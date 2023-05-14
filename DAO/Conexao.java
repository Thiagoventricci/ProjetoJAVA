package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

 private static final String url = "jdbc:mysql://localhost:3306/lifestyle_banco_digital";
 private static final String user = "root";
 private static final String pwd = "060919";
 
 private static Connection conn;

 public static Connection getConexao() {
    
    try {
        if (conn == null){
        conn = DriverManager.getConnection(url,user,pwd);
        return conn;
        }else{
            return conn;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
 }
}
