package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Classes.Usuario;
import Classes.Conexao;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public boolean buscarUsuario(Usuario usuario) throws SQLException {

        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conector();
            Statement stm;
            ResultSet rs;

            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM usuario where nome =  '" + usuario.getNome() + "' and senha = '" + usuario.getSenha() + "'");

            if (rs.next()) {
                System.out.print("Usuário encontrado");
                con.close();
                return true;
            } else {
                System.out.print("Usuário não encontrado");
                con.close();
                return false;
            }
        } catch (ClassNotFoundException ex) {
            System.out.print("Erro" + ex);
        }
        return false;
    }

    public boolean Atualizar(Usuario usuario) throws SQLException, ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm = con.createStatement();
        String mensagem;
        Integer resultado;

        try {
            resultado = stm.executeUpdate(" UPDATE usuario SET nome = '" + usuario.getNome() + "',"
                    + " senha = '" + usuario.getSenha() + "'"
                    + " WHERE nome = '" + usuario.getNome() + "'");
            stm.close();
            con.close();
            if (resultado == 1) {
                 System.out.print("Usuário Atualizado");
                return true;
            } else {
                System.out.print("Usuário não Atualizado");
                return false;
            }
        } catch (SQLException e) {
            System.out.print("Erro" + e);
            return false;
        }

    }

}
