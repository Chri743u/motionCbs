package com.motionCBS.client.logic;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.view.client.ListDataProvider;
import com.motionCBS.Shared.User;
import com.motionCBS.client.RPC.motionCBSServiceAsync;
import com.motionCBS.client.UI.ContentPanel;
import com.motionCBS.client.UI.user.mainUserView.MainUserView;

import java.util.ArrayList;

public class UserController {
    private ContentPanel content;
    private MainUserView mainUserView;
    private motionCBSServiceAsync cbsServiceAsync;
    private User currentUser;

    // A List Data Provider which contains an ArrayList with users is used for the DataGrid
    private ListDataProvider<User> listProviderUsers;

    public UserController(ContentPanel content, motionCBSServiceAsync cbsServiceAsync) {
        this.content = content;
        this.mainUserView = content.getMainUserView();
        this.cbsServiceAsync = cbsServiceAsync;
    }

    public void loadUser(User currentUser){
        this.currentUser = currentUser;
        loadTables();

    }

    private void loadTables() {
        cbsServiceAsync.getUsers(currentUser.getId(), new AsyncCallback<ArrayList<User>>() {

            @Override
            public void onFailure(Throwable caught) {
                Window.alert("Could not load users");
            }

            @Override
            public void onSuccess(ArrayList<User> users) {
                // Adding all the users to the DataProvider (ArrayList)
                listProviderUsers.getList().addAll(users);
            }
        });
    }








}
