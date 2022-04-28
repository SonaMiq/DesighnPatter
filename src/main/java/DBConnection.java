import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;


    private DBConnection() {

    }

    public static Connection getDbConnection() {
        String url = "jdbc:mysql://localhost:3306/airport";
        String root = "root";
        String pass = "Yelena";
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, root, pass);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
