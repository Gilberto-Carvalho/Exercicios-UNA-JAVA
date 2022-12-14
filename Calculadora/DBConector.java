import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConector {
    public void connect() {
        String database = "jdbc:mysql//localhost/calculadora";
        try {
            Class.forName("com.mysql.jbdc.Driver");
            Connection conexaoMySQL = DriverManager.getConnection(database, "root", "admin");
            Statement comando = conexaoMySQL.createStatement();
        } catch (Exception e){
            System.out.println("ERRO");
        }
    }
}