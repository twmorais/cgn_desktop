/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Conexao;
import Classes.Patrimonio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author m10816361
 */
public class PatrimonioDao {

    public Boolean inserir(Patrimonio patrimonio) throws SQLException, ClassNotFoundException {

        Integer resultado;
        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm = con.createStatement();

        try {
            stm.execute("INSERT INTO patrimonio (tipo,data_aquisicao,valor) VALUES" + " ('" + patrimonio.getTipo()
                    + "','" + patrimonio.getData_aquisicao() + "','" + patrimonio.getValor() + "')");
            resultado = 1;
            stm.close();
            con.close();

            if (resultado == 1) {

                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro, verifique os números digitados, se o problema persistir acione o Administrador do Sistema.");
        }
        return null;
    }

    public Boolean Apagar(Integer codigo) throws ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        Integer resultado;
        try {
            stm = con.createStatement();
            resultado = stm.executeUpdate("DELETE FROM patrimonio where id = '" + codigo + "'");
            stm.close();
            con.close();
            if (resultado == 1) {
                return true;
            } else {
                stm.close();
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Apagar patrimonio DAO falhou..." + e);
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados, favor acionar o Administrador do Sistema.");
            return false;
        }
    }

    public Patrimonio buscarEditar(Integer codigo) throws SQLException, ClassNotFoundException {

        Patrimonio patrimonio = new Patrimonio();
        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM patrimonio where id =  '" + codigo + "'");

            if (rs.next()) {
                patrimonio.setId(rs.getInt(1));
                patrimonio.setTipo(rs.getNString(2));
                patrimonio.setData_aquisicao(rs.getString(3));
                patrimonio.setValor(rs.getFloat(4));
            }
            rs.close();
            stm.close();
            System.out.println("Metodo buscar patrimonio Editar DAO executado com sucesso...");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados, favor acionar o Administrador do Sistema.");
        }
        return patrimonio;
    }

    public Boolean Atualizar(Patrimonio patrimonio) throws SQLException, ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm = con.createStatement();
        Integer resultado;

        try {
            resultado = stm.executeUpdate(" UPDATE patrimonio SET tipo = '" + patrimonio.getTipo() + "',"
                    + " data_aquisicao = '" + patrimonio.getData_aquisicao() + "'," + " valor = '"
                    + patrimonio.getValor() + "'" + " WHERE id = " + patrimonio.getId());

            stm.close();
            con.close();

            System.out.println("Dados Atualizados... patrimonio Dao...");

            if (resultado == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados, favor acionar o Administrador do Sistema.");
            return false;
        }

    }

    public ArrayList<Patrimonio> buscarPatrimonio(String tipo) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Patrimonio> lista_patrimonio = new ArrayList<Patrimonio>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM patrimonio where tipo like '%" + tipo + "%'");

            while (rs.next()) {
                Patrimonio patrimonio = new Patrimonio();
                patrimonio.setId(rs.getInt(1));
                patrimonio.setTipo(rs.getString(2));
                patrimonio.setData_aquisicao(rs.getString(3));
                patrimonio.setValor(rs.getFloat(4));
                lista_patrimonio.add(patrimonio);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println("Metodo buscar patrimonio DAO executado com sucesso...");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro método buscar Patrimônio, favor acionar o Administrador do Sistema.");
        }
        return lista_patrimonio;
    }

    public ArrayList<Patrimonio> buscarTodos() throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Patrimonio> lista_patrimonio = new ArrayList<Patrimonio>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM patrimonio");

            while (rs.next()) {
                Patrimonio patrimonio = new Patrimonio();
                patrimonio.setId(rs.getInt(1));
                patrimonio.setTipo(rs.getString(2));
                patrimonio.setData_aquisicao(rs.getString(3));
                patrimonio.setValor(rs.getFloat(4));
                lista_patrimonio.add(patrimonio);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println("Metodo buscar patrimonio DAO executado com sucesso...");
            return lista_patrimonio;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro método buscar Todos Patrimônio, favor acionar o Administrador do Sistema.");
            return lista_patrimonio;
        }
    }

}
