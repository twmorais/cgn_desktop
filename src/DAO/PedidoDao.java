/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Conexao;
import Classes.Pedido;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author m10816361
 */
public class PedidoDao {

    public boolean inserir(Pedido pedido) throws SQLException, ClassNotFoundException {

        boolean inserido;
        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm = con.createStatement();

        try {
            stm.execute("INSERT INTO pedido (id_cliente,tipo,data_entrega,total) VALUES"
                    + " ('" + pedido.getId_cliente() + "','" + pedido.getTipo()
                    + "','" + pedido.getStr_data() + "','" + pedido.getTotal() + "')");
            inserido = true;
            stm.close();
            con.close();

            if (inserido == true) {
                System.out.println("Pedido inserido com sucesso...");
                return true;
            } else {
                System.out.println("Erro na inserção do pedido...");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro.... metodo Inserir pedido Dao..." + e);
            return false;
        }

    }

    public Boolean Apagar(Integer codigo) throws ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        int apaga_pedido;
        int apaga_item_pedido;
        try {
            stm = con.createStatement();
            apaga_pedido = stm.executeUpdate("DELETE FROM pedido where id = '" + codigo + "'");
            apaga_item_pedido = stm.executeUpdate("DELETE FROM item_pedido where id_pedido = '" + codigo + "'");
            stm.close();
            con.close();
            if (apaga_pedido == 1) {
                System.out.println("Pedido apagado com sucesso...");
                return true;
            } else {
                stm.close();
                con.close();
                System.out.println("Pedido não apagado......");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Apagar Pedido DAO falhou..." + e);
            return false;
        }
    }

    public ArrayList<Pedido> buscarPedidos(Integer id_cliente) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Pedido> listapedidos = new ArrayList<Pedido>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM pedido where id_cliente = '" + id_cliente + "'");

            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(rs.getInt(1));
                pedido.setId_cliente(rs.getInt(2));
                pedido.setTipo(rs.getString(3));
                pedido.setStr_data(rs.getString(4));
                pedido.setTotal(rs.getDouble(5));
                listapedidos.add(pedido);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println(" Buscar Pedido DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Erro buscar Pedido DAO..." + e);
        }
        return listapedidos;
    }

    public Pedido buscarPedido(Integer id) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Pedido pedido = new Pedido();
        Statement stm;
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM pedido where id = '" + id + "'");

            if (rs.next()) {
                pedido.setId(rs.getInt(1));
                pedido.setId_cliente(rs.getInt(2));
                pedido.setTipo(rs.getString(3));
                pedido.setData_entrega(rs.getDate(4));
                pedido.setTotal(rs.getDouble(5));
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println(" Buscar Pedido por id DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Erro buscar Pedido DAO..." + e);
        }
        return pedido;
    }

    public Pedido buscar_id_pedido(Integer id_cliente, String entrega, Double total) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Pedido pedido = new Pedido();
        Statement stm;
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM pedido where id_cliente = '" + id_cliente
                    + "' and data_entrega = '" + entrega + "' and total = '" + total + "'");

            if (rs.next()) {
                pedido.setId(rs.getInt(1));
                pedido.setId_cliente(rs.getInt(2));
                pedido.setTipo(rs.getString(3));
                pedido.setData_entrega(rs.getDate(4));
                pedido.setTotal(rs.getDouble(5));
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println(" Buscar Pedido DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Erro buscar Pedido DAO..." + e);
        }
        return pedido;
    }

    public ArrayList<Pedido> buscarPedidosTodosPorData(Integer id_cliente, String data_inicio, String data_fim) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Pedido> listapedidos = new ArrayList<Pedido>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM pedido where id_cliente = '" + id_cliente
                    + "' and data_entrega >= '" + data_inicio + "' and data_entrega <= '" + data_fim + "'");
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(rs.getInt(1));
                pedido.setId_cliente(rs.getInt(2));
                pedido.setTipo(rs.getString(3));
                pedido.setStr_data(rs.getString(4));
                pedido.setTotal(rs.getDouble(5));
                listapedidos.add(pedido);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println(" Buscar Pedido DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Erro buscar Pedido DAO..." + e);
        }
        return listapedidos;
    }
     public ArrayList<Pedido> buscarTodos(String data_inicio, String data_fim) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Pedido> listapedidos = new ArrayList<Pedido>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM pedido where data_entrega >= '" + data_inicio + "' and data_entrega <= '" + data_fim + "'");

            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(rs.getInt(1));
                pedido.setId_cliente(rs.getInt(2));
                pedido.setTipo(rs.getString(3));
                pedido.setStr_data(rs.getString(4));
                pedido.setTotal(rs.getDouble(5));
                listapedidos.add(pedido);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println(" Buscar Pedido DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Erro buscar Pedido DAO..." + e);
        }
        return listapedidos;
    }
}
