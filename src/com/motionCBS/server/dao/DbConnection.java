package com.motionCBS.server.dao;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.motionCBS.Shared.User;
import com.motionCBS.client.RPC.motionCBSService;

import java.sql.*;
import java.util.ArrayList;

public class DbConnection extends RemoteServiceServlet implements motionCBSService {
    /*
     * The url, username and password for the database. The password is not necessarily
     * the same pass as your computer password
     */
    private static final String URL = "jdbc:mysql://localhost:3306/motioncbs";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "emj39bqg";



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
    public User authorizeUser (String mobilenr, String password) {

        ArrayList<User> authorizeUsers = new ArrayList<>();
        ResultSet rs = null;

        try {
            PreparedStatement authorizeUser = connection.prepareStatement("SELECT * FROM users where mobilenr = ? AND password = ?");

            authorizeUser.setString(1, mobilenr);
            authorizeUser.setString(2,password);

            rs = authorizeUser.executeQuery();

            User user = new User();

            //user.setUsername(rs.getString("username"));
            //user.setPassword(rs.getString("password"));

        /*while(rs.next()){
            User user = new User();

            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));*/



        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    }
