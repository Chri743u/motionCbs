package com.motionCBS.server.dao;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.motionCBS.Shared.User;
import com.motionCBS.client.RPC.motionCBSService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection extends RemoteServiceServlet implements motionCBSService {
    /*
     * The url, username and password for the database. The password is not necessarily
     * the same pass as your computer password
     */
    private static final String URL = "jdbc:mysql://localhost:3306/motioncbs";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";



    private static Connection connection = null;

    /**
     * The constructor which is creating the connection the the database
     */
    public DbConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User authorizeUser(String username, String password) throws Exception {
        return null;
    }
}
