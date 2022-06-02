/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Classes.Produto;
import Classes.Conexao;
import Classes.Item_pedido;

/**
 *
 * @author m10816361
 */
public class ProdutoDao {

    public Boolean inserir(Produto produto) throws SQLException, ClassNotFoundException {

        Integer resultado;
        String mensagem;
        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm = con.createStatement();

        try {
            stm.execute("INSERT INTO produto (tipo,descricao,data_produto,preco) VALUES" + " ('" + produto.getTipo() + "','" + produto.getDescricao() + "','" + produto.getData_produto() + "','" + produto.getPreco() + "')");
            resultado = 1;
            stm.close();
            con.close();
            System.out.println(" Metodo Inserir Produto Dao ok...");

            if (resultado == 1) {
                mensagem = "Dados Inseridos com sucesso.";
                return true;
            } else {
                mensagem = "Erro na insercao dos dados";
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro.... metodo Inserir Produto Dao..." + e);
            return false;
        }
    }

    public boolean Apagar(Integer codigo) throws ClassNotFoundException {

        ProdutoDao produtoDao = new ProdutoDao();
        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        String mensagem;
        Integer resultado;
        Boolean retorno = false;
        try {
            stm = con.createStatement();
            resultado = stm.executeUpdate("DELETE FROM produto where id = '" + codigo + "'");
            stm.close();
            con.close();
            if (resultado == 1) {
                mensagem = " *** Registro Apagado com sucesso. ***";
                stm.close();
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Apagar produto DAO falhou..." + e);
            mensagem = "*** Erro *** " + e;
            retorno = false;
        }
        return retorno;
    }

    public boolean Atualizar(Produto produto) throws SQLException, ClassNotFoundException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm = con.createStatement();
        String mensagem;
        Integer resultado;

        try {
            resultado = stm.executeUpdate(" UPDATE produto SET tipo = '" + produto.getTipo() + "'," + " descricao = '" + produto.getDescricao()
                    + "'," + " data_produto = '" + produto.getData_produto() + "',"
                    + " preco = '" + produto.getPreco() + "'" + " WHERE id = " + produto.getId());

            stm.close();
            con.close();

            System.out.println("Dados Atualizados... Metodo atualizar produto Dao...");

            if (resultado == 1) {
                mensagem = "*** Dados Atualizados com sucesso. ***";
                return true;
            } else {
                mensagem = "*** Os dados nao foram atualizados. ***";
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro.... Metodo atualizar produto Dao..." + e);
            mensagem = ("Erro.... Metodo atualizar produto Dao..." + e);
            return false;
        }

    }

    public Produto buscarEditar(String tipo) throws SQLException, ClassNotFoundException {

        Produto produto = new Produto();
        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM produto where tipo =  '" + tipo + "'");

            if (rs.next()) {

                produto.setId(rs.getInt(1));
                produto.setTipo(rs.getString(2));
                produto.setDescricao(rs.getString(3));
                produto.setData_produto(rs.getString(4));
                produto.setPreco(rs.getDouble(5));

            }
            rs.close();
            stm.close();
            System.out.println("Metodo buscar produto Editar DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Metodo buscar produto Editar DAO falhou..." + e);
        }
        return produto;
    }

    public ArrayList<Produto> buscarProdutos(String tipo) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM produto where tipo  like '%" + tipo + "%'order by tipo");

            while (rs.next()) {

                Produto produto = new Produto();
                produto.setId(rs.getInt(1));
                produto.setTipo(rs.getString(2));
                produto.setDescricao(rs.getString(3));
                produto.setData_produto(rs.getString(4));
                produto.setPreco(rs.getDouble(5));
                listaProdutos.add(produto);
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println("Metodo buscarProduto DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Metodo buscarProduto  DAO falhou..." + e);
        }
        return listaProdutos;
    }

    public ArrayList<Produto> buscar_Produtos_pelo_id(Integer id_pedido) throws ClassNotFoundException {

        Conexao Conexao = new Conexao();
        Connection con = Conexao.conector();
        Statement stm;
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        ResultSet rs;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM produto p INNER JOIN item_pedido i ON p.id = i.id_produto where i.id_pedido = '" + id_pedido + "'");
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt(1));
                produto.setTipo(rs.getString(2));
                produto.setDescricao(rs.getString(3));
                produto.setData_produto(rs.getString(4));
                produto.setPreco(rs.getDouble(5));
                listaProdutos.add(produto);
            }
            rs.close();
            stm.close();

            con.close();
            System.out.println("Metodo buscarProduto DAO executado com sucesso...");
        } catch (SQLException e) {
            System.out.println("Metodo buscarProduto  DAO pelo id falhou..." + e);
        }
        return listaProdutos;
    }

    public Boolean buscarPeloCodigo(Integer codigo) throws SQLException, ClassNotFoundException {

        Produto produto = new Produto();
        Conexao conexao = new Conexao();
        Connection con = conexao.conector();
        Statement stm;
        ResultSet rs;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM produto where id =  '" + codigo + "'");

            if (rs.next()) {
                rs.close();
                stm.close();
                System.out.println("Metodo buscar pelo codigo DAO Produto encontrado...");
                return true;
            } else {
                System.out.println("Metodo buscar pelo codigo DAO Produto não encontrado...");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Metodo buscar produto Editar DAO falhou..." + e);
        }
        return false;
    }
}
