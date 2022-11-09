/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

/**
 *
 * @author LOIDEPTRAI
 */
public class SQLSeverConnection {

    public static final String HOSTNAME = "localhost";

    public static final String PORT = "1433";

    public static final String DBNAME = "QL_QUANAO";

    public static final String USERNAME = "sa";

    public static final String PASSWORD = "loi0921283376";

    /**
     *
     * Get connection to MSSQL Server
     *
     *
     *
     * @return Connection
     *
     */
    public static Connection getConnection() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);

        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace(System.out);

        }

        return null;

    }

    public static void main(String[] args) {

        System.out.println(getConnection());

    }
}
