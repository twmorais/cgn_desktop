/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Despesa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Classes.Conexao;


/**
 *
 * @author m10816361
 */
public class DespesaDao {

    public boolean inserir(Despesa despesa) throws SQLException, ClassNotFoundException {

        Integer resultado;
        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm = con.createStatement();

        try {
            stm.execute("INSERT INTO despesa (tipo,descricao,data_despesa,total) VALUES" + " ('" + despesa.getTipo()
                    + "','" + despesa.getDescricao() + "','" + despesa.getData_despesa() + "','" + despesa.getTotal() + "')");
            resultado = 1;
            stm.close();
            con.close();
            if (resultado == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro.... metodo Inserir despesa Dao..." + e);
            return false;
        }
    }

    public boolean Apagar(Integer codigo) throws ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        String mensagem;
        Integer resultado;
        try {
            stm = con.createStatement();
            resultado = stm.executeUpdate("DELETE FROM despesa where id = '" + codigo + "'");
            stm.close();
            con.close();
            if (resultado == 1) {
                mensagem = " *** Registro Apagado com sucesso. ***";
                return true;
            } else {
                stm.close();
                System.out.println("Apagar despesa DAO executado com sucesso...");
                return false;
            }

        } catch (SQLException e) {
            mensagem = "*** Erro *** " + e;
            return false;
        }
    }

    public boolean Atualizar(Despesa despesa) throws SQLException, ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm = con.createStatement();
        String mensagem;
        Integer resultado;

        try {
            resultado = stm.executeUpdate(" UPDATE despesa SET tipo = '" + despesa.getTipo() + "'," + " descricao = '" + despesa.getDescricao() + "',"
                    + " data_despesa = '" + despesa.getData_despesa() + "'," + " total = '" + despesa.getTotal() + "'" + " WHERE id = " + despesa.getId());

            stm.close();
            con.close();
            if (resultado == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro.... metodo Atualizar despesa Dao..." + e);
            return false;
        }

    }

    public Despesa buscarEditar(String tipo) throws SQLException, ClassNotFoundException {

        Despesa despesa = new Despesa();
        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM despesa where tipo =  '" + tipo + "'");

            if (rs.next()) {
                despesa.setId(rs.getInt(1));
                despesa.setTipo(rs.getString(2));
                despesa.setDescricao(rs.getString(3));
                despesa.setData_despesa(rs.getString(4));
                despesa.setTotal(rs.getFloat(5));
            }
            rs.close();
            stm.close();
            System.out.println("Metodo buscar despesa Editar DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Metodo buscar despesa Editar DAO falhou..." + e);
        }
        return despesa;
    }

    public ArrayList<Despesa> buscarDespesa(String tipo) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Despesa> lista_despesas = new ArrayList<Despesa>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM despesa where tipo like '%" + tipo + "%'");

            while (rs.next()) {
                Despesa despesa = new Despesa();
                despesa.setId(rs.getInt(1));
                despesa.setTipo(rs.getNString(2));
                despesa.setDescricao(rs.getString(3));
                despesa.setData_despesa(rs.getString(4));
                despesa.setTotal(rs.getFloat(5));
                lista_despesas.add(despesa);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println("Metodo buscar despesa DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Metodo buscar despesa DAO falhou..." + e);
        }
        return lista_despesas;
    }

    public ArrayList<Despesa> buscarDespesaPorData(String data_inicio, String data_fim) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Despesa> lista_despesas = new ArrayList<Despesa>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM despesa where data_despesa between '" + data_inicio + "' and '" + data_fim + "'");
            while (rs.next()) {
                Despesa despesa = new Despesa();
                despesa.setId(rs.getInt(1));
                despesa.setTipo(rs.getNString(2));
                despesa.setDescricao(rs.getString(3));
                despesa.setData_despesa(rs.getString(4));
                despesa.setTotal(rs.getFloat(5));
                lista_despesas.add(despesa);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println("Metodo buscar despesa DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Metodo buscar despesa DAO falhou..." + e);
        }
        return lista_despesas;
    }

}
