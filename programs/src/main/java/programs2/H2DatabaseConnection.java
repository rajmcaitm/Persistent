package programs2;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2DatabaseConnection {

    //it will create folder called ~ and with database name dharya in the current directory
    private static final String DB_URL1 = "jdbc:h2:file:~/dharya";

    //it is in memory database and with database name dharya.
    private static final String DB_URL2 = "jdbc:h2:mem:dharya";
    static String filePath1 = "~/resources/database.mv.db";
    static String DB_URL3 = "jdbc:h2:" + filePath1;

    static String filePath2 = "~/resources/database.mv.db";
    static String DB_URL4 = "jdbc:h2:" + filePath2;
    private static final String USER = "sa";
    private static final String PASS = "password";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL3, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Error creating connection to H2 database: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Connected to H2 database successfully!");
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS USER(id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), email VARCHAR(255))");
            stmt.execute("INSERT INTO USER(name, email) VALUES ('Dharya', 'dharya@gmail.com')");
            stmt.execute("INSERT INTO USER(name, email) VALUES ('Raj', 'Raj@gmail.com')");
            ResultSet rs = stmt.executeQuery("SELECT * FROM USER");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Email: " + rs.getString(3));
            }

        } else {
            System.out.println("Failed to connect to H2 database.");
        }
    }
}