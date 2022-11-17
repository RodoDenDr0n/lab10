package singleton.task1;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.sql.Statement;

public class Connection {
    private java.sql.Connection dbConnection;
    private static Connection connection;

    @SneakyThrows
    private Connection() {
        dbConnection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
    }

    @SneakyThrows
    public void executeQuery(String query) {
        Statement stmt = dbConnection.createStatement();
        stmt.executeUpdate(query);
    }

    public static Connection getConnection() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
