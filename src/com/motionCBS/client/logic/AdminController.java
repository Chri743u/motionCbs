package com.motionCBS.client.logic;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.view.client.ListDataProvider;
import com.motionCBS.Shared.User;
import com.motionCBS.client.RPC.motionCBSServiceAsync;
import com.motionCBS.client.UI.ContentPanel;
import com.motionCBS.client.UI.admin.mainAdminView.MainAdminView;

import java.util.ArrayList;

public class AdminController {

    private ContentPanel content;
    private MainAdminView mainAdminView;
    private motionCBSServiceAsync cbsServiceAsync;
    private User currentUser;

    private ListDataProvider<User> listDataProviderUsers;

    public AdminController(ContentPanel content, motionCBSServiceAsync cbsServiceAsync) {
        this.content = content;
        this.mainAdminView = content.getMainAdminView();
        this.cbsServiceAsync = cbsServiceAsync;

        listDataProviderUsers = new ListDataProvider<>();
        
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
                listDataProviderUsers.getList().addAll(users);
            }
        });
    }
}
