package com.motionCBS.client.logic;

import com.motionCBS.Shared.User;
import com.motionCBS.client.UI.login.LoginView;
import com.motionCBS.server.dao.DbConnection;
import com.motionCBS.client.UI.login.LoginView;

public class MainController {
    private DbConnection dbConnection;
    private LoginView lv = new LoginView();


    public MainController() {
        dbConnection = new DbConnection();
        login();
    }

    public void login() {
        new LoginView();


    }



}
