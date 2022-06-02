package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import CLASSES.Cliente;
import Classes.Conexao;

public class ClienteDao {

    public boolean inserir(Cliente cliente) throws SQLException, ClassNotFoundException {

        boolean inserido;
        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm = con.createStatement();

        try {
            stm.execute("INSERT INTO cliente (nome,nascimento,endereco,telefone,email,observacoes) VALUES"
                    + " ('" + cliente.getNome() + "','" + cliente.getNascimento() + "','" + cliente.getEndereco() + "','"
                    + cliente.getTelefone() + "','" + cliente.getEmail() + "','" + cliente.getObservacoes() + "')");
            inserido = true;
            stm.close();
            con.close();

            if (inserido == true) {
                System.out.println("cliente inserido com sucesso...");
                return true;
            } else {
                System.out.println("Erro na inserção do cliente...");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro.... metodo Inserir Cliente Dao..." + e);
            return false;
        }

    }

    public Boolean Apagar(Integer codigo) throws ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        int apagado;
        try {
            stm = con.createStatement();
            apagado = stm.executeUpdate("DELETE FROM cliente where id = '" + codigo + "'");
            stm.close();
            con.close();
            if (apagado == 1) {
                System.out.println("Cliente apagado com sucesso...");
                return true;
            } else {
                stm.close();
                con.close();
                System.out.println("Cliente não apagado......");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Apagar cliente DAO falhou..." + e);
            return false;
        }
    }

    public boolean Atualizar(Cliente cliente) throws SQLException, ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm = con.createStatement();
        Integer resultado;

        try {
            resultado = stm.executeUpdate(" UPDATE cliente SET nome = '" + cliente.getNome() + "',"
                    + " nascimento = '" + cliente.getNascimento() + "',"
                    + " endereco = '" + cliente.getEndereco() + "',"
                    + " telefone = '" + cliente.getTelefone() + "',"
                    + " email = '" + cliente.getEmail() + "',"
                    + " observacoes = '" + cliente.getObservacoes() + "'"
                    + " WHERE id = " + cliente.getId());

            stm.close();
            con.close();
            if (resultado == 1) {
                System.out.println("Cliente atualizado com sucesso...");
                return true;
            } else {
                System.out.println("Cliente não atualizado...");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro.... metodo Atualizar clientes Dao..." + e);
            return false;
        }

    }

    public Cliente buscarEditar(String nome) throws SQLException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM cliente where nome =  '" + nome + "'");

            if (rs.next()) {
                cliente.setId(rs.getInt(1));
                cliente.setNome(rs.getString(2));
                cliente.setNascimento(rs.getString(3));
                cliente.setEndereco(rs.getString(4));
                cliente.setTelefone(rs.getString(5));
                cliente.setEmail(rs.getString(6));
                cliente.setObservacoes(rs.getString(7));
            }
            rs.close();
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro buscarEditar cliente Dao..." + e);
        }
        return cliente;
    }

    public ArrayList<Cliente> buscarClientes(String nome) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Cliente> listaclientes = new ArrayList<Cliente>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM cliente where nome like '%" + nome + "%' order by nome");

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt(1));
                cliente.setNome(rs.getString(2));
                cliente.setNascimento(rs.getString(3));
                cliente.setEndereco(rs.getString(4));
                cliente.setTelefone(rs.getString(5));
                cliente.setEmail(rs.getString(6));
                cliente.setObservacoes(rs.getString(7));
                listaclientes.add(cliente);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println(" Buscar Clientes DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Erro buscar clientes DAO..." + e);
        }
        return listaclientes;
    }

    public boolean buscar_por_id(Integer id) throws ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        ResultSet rs;
        Boolean resultado = false;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM cliente where id =  '" + id + "'");

            if (rs.next()) {
                resultado = true;
            }
            rs.close();
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro buscarEditar cliente Dao..." + e);
        }
        return resultado;

    }

   
}
