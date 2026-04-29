package logistic;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnections {
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/logistics",
                "root",
                "dhruv@21"
        );
    }
}
