package com.motionCBS.client.logic;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.motionCBS.Shared.User;
import com.motionCBS.client.UI.ContentPanel;
import com.motionCBS.client.RPC.motionCBSServiceAsync;
import com.motionCBS.client.UI.login.LoginView;
import com.motionCBS.server.dao.DbConnection;
import com.motionCBS.client.UI.login.LoginView;

public class MainController {

    private ContentPanel content;
    private motionCBSServiceAsync cbsService;

    private AdminController adminController;
    private UserController userController;

    /**
     * Constructor for MainController
     *
     * @param content
     * @param service
     */
    public MainController(ContentPanel content, motionCBSServiceAsync service) {
        this.content = content;
        this.cbsService = service;

        adminController = new AdminController(content, service);
        userController = new UserController(content, service);

        bindHandlers();
    }

    public MainController() {

    }

    /**
     * Adding a handler to the login button
     */
    private void bindHandlers() {
        content.getLoginView().addClickHandlers(new LoginClickHandler());
    }

    /**
     * Handle clicks on the login button
     *
     * @author KonnerupsMac
     */
    class LoginClickHandler implements ClickHandler {
        @Override
        public void onClick(ClickEvent event) {
            // Getting the text from the two text boxes on the login screen
            String username = content.getLoginView().getUsernameTxtBox().getText();
            String password = content.getLoginView().getPasswordTxtBox().getText();

            // RPC authenticating user method
            cbsService.authorizeUser(username, password, new AsyncCallback<User>() {

                /*
                 * Handles error from callback function
                 */
                @Override
                public void onFailure(Throwable caught) {
                    Window.alert("Der skete en fejl");

                }

                /*
                 * Handles success response from callback
                 * The callback returns a user
                 */
                @Override
                public void onSuccess(User user) {
                    // Failed to match input with User in database
                    if (user == null) {
                        Window.alert("Wrong username or password");
                    } else {

                        // Clearing the text fields (username & password) from
                        // the login screen
                        content.getLoginView().clearTextBoxFields();

                        /*
                         * 1) User match in database,
                         * 2) Checks access level Admin != User
                         * 3) Change the view to either admin og user view
                         */
                        if (user.getType() == 1) {
                            adminController.loadUser(user);
                            content.changeView(content.getMainAdminView());
                        } else if (user.getType() == 2) {
                            userController.loadUser(user);
                            content.changeView(content.getMainUserView());
                            content.getMainUserView().changeView(content.getMainUserView().getStatisticsUserView());
                        }
                    }

                }
            });

        }
    }

}
