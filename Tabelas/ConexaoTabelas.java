
import java.sql.DriverManager;
import java.util.Optional;
import java.net.URL;
import java.sql.*;
public class ConexaoTabelas {   
    static String URL = 
        "jdbc:mysql://localhost:3306/lifestyle_banco_digital"   ;
    public static String USER = "root";
    public static String PWD = "060919"; // a instalação padrão do XAMP a senha é vazia

    // objetos de conexão

    private Connection dbconn = null;
    private Statement sqlmgr = null;
    private ResultSet resultsql = null;

    public void OpenDatabase (){
        try{
            dbconn = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conectado com sucesso em: " + URL);
            sqlmgr = dbconn.createStatement(); // cria objeto para SQLs
        }catch (Exception Error){
            System.out.println("Error on connect: " + Error.getMessage());
        }
    }

    public void  CloseDatabase () throws SQLException{
        
        sqlmgr.close();
        dbconn.close();


    }

    public int ExecuteQuery(String sql){
    try {
        return sqlmgr.executeUpdate(sql); // insert/delete/update/create
    } catch (Exception Error) {
        System.out.println("Error on connect: " + Error.getMessage());
    }
        return -1;
}

    public static Object getConnection() {
        return null;
    }
    
    

}