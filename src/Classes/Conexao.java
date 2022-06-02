package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection conector() throws ClassNotFoundException {

        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bd_cgn";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados, favor informar ao Administrador do Sistema.");
          return null;
        }        
    }   
}
