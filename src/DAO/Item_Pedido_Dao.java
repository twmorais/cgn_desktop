/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Conexao;
import Classes.Item_pedido;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author m10816361
 */
public class Item_Pedido_Dao {

    public Boolean inserir(Item_pedido item_pedido) throws SQLException, ClassNotFoundException {

        Integer resultado;
        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm = con.createStatement();

        try {
            stm.execute("INSERT INTO item_pedido (id_pedido,id_produto, quantidade, preco) VALUES"
                    + " ('" + item_pedido.getId_pedido() + "','" + item_pedido.getId_produto()
                    + "','" + item_pedido.getQuantidade() + "','" + item_pedido.getTotal() + "')");
            resultado = 1;
            stm.close();
            con.close();

            if (resultado == 1) {
                System.out.println(" Inserir Item_Pedido Dao inserido...");
                return true;
            } else {
                System.out.println(" Inserir Item_Pedido Dao nao inserido...");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro.... metodo Inserir Item_Pedido Dao..." + e);
            return false;
        }
    }

    public boolean Apagar(Integer codigo) throws ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        Integer resultado;
        try {
            stm = con.createStatement();
            resultado = stm.executeUpdate("DELETE FROM item_pedido where id_produto = '" + codigo + "'");
            stm.close();
            con.close();
            if (resultado == 1) {
                return true;
            } else {
                stm.close();
                System.out.println("Apagar item_pedido DAO executado com sucesso...");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Apagar item_pedido DAO falhou..." + e);
            return false;
        }
    }

    public ArrayList<Item_pedido> buscarItens(Integer id_pedido) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Item_pedido> listapedidos = new ArrayList<Item_pedido>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM item_pedido where id_pedido = '" + id_pedido + "'");

            while (rs.next()) {
                Item_pedido item_pedido = new Item_pedido();
                item_pedido.setId(rs.getInt(1));
                item_pedido.setId_pedido(rs.getInt(2));
                item_pedido.setId_produto(rs.getInt(3));
                item_pedido.setQuantidade(rs.getInt(4));
                item_pedido.setTotal(rs.getDouble(5));
                listapedidos.add(item_pedido);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println(" Buscar Item_Pedido DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Erro buscar Item_Pedido DAO..." + e);
        }
        return listapedidos;
    }

}
