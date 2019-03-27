package com.motionCBS.client.UI;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.motionCBS.client.UI.login.LoginView;
import com.motionCBS.client.UI.register.RegisterView;
import com.motionCBS.client.UI.user.mainUserView.MainUserView;

public class ContentPanel extends Composite {

    private DeckLayoutPanel contentPanel;

    private MainAdminView mainAdminView;
    private LoginView loginView;
    private RegisterView registerView;
    private MainUserView mainUserView;

    public ContentPanel() {
        contentPanel = new DeckLayoutPanel();

        mainAdminView = new MainAdminView();
        contentPanel.add(mainAdminView);

        loginView = new LoginView();
        contentPanel.add(loginView);

        registerView = new RegisterView();
        contentPanel.add(registerView);

        mainUserView = new MainUserView();
        contentPanel.add(mainUserView);

        contentPanel.showWidget(loginView);

        initWidget(contentPanel);
    }

    public void changeView(Widget panel) {contentPanel.showWidget(panel);}

    public MainAdminView getMainAdminView() {return mainAdminView;}

    public LoginView getLoginView() {return loginView;}

    public RegisterView getRegisterView() {return registerView;}

    public MainUserView getMainUserView() {return mainUserView;}
}
