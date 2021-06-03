package com.formation.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

    private static final String URL = "jdbc:mysql://localhost:8889/test";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // SINGLETON INSTANCE
    private static Connection connection;

    private ConnectionManager(){
        // Avoid instantiate
    }

    public static Connection getConnection(){
        if (connection == null) {
            try {
                loadDriver();
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                connection.setAutoCommit(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void loadDriver(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Driver MySQL introuvable");
        }
    }

    public static void closeConnection(){
        try {
            if (getConnection() != null) {
                getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
