import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBase{

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
    }

    public static Connection getConnection()throws SQLException{
        String host = "database-1.cnccq4cw2sze.us-east-2.rds.amazonaws.com";
        String user = "admin";
        String password = "Cesarmc$00";
        int puerto = 3306;
        String dbName = "Users_Test";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (Exception e) {
            System.out.println("Libreria no encontrada: " + e.getMessage());
        }

        String url = String.format("jdbc:mysql://%s/%s", host, dbName);

        return DriverManager.getConnection(url, user,password);
    }    
        
}
