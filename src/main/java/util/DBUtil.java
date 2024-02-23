package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // Database connection parameters
    private static final String URL = "jdbc:postgresql://aws-0-ap-south-1.pooler.supabase.com:5432/postgres";
    private static final String USERNAME = "postgres.lzyowiasbdsftpdbpmnj";
    private static final String PASSWORD = "tKwpMiNB$T6%RLV";

    // Static method to establish a database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
