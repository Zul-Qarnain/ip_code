import java.sql.*;
import oracle.jdbc.driver.OracleDriver;
import javax.swing.*;

public class DatabaseUtils {

    public static Connection getConnection() throws SQLException {
        try {
            String jdbcUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String username = "System";
            String password = "sysmain123";

            DriverManager.registerDriver(new OracleDriver());
            return DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
    }
}
