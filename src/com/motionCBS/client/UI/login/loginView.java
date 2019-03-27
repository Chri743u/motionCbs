package com.motionCBS.client.UI.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.event.dom.client.ClickHandler;


public class loginView extends Composite {
    //hej

    private static loginViewUiBinder UiBinder = GWT.create(loginViewUiBinder.class);
    @UiField
    TextBox usernameTxtBox;
    @UiField
    PasswordTextBox passwordTxtBox;
    @UiField
    Button loginBtn;
    @UiField
    Button registerBtn;

    interface loginViewUiBinder extends UiBinder<HTMLPanel, loginView> {
    }

    public loginView() {

        initWidget(UiBinder.createAndBindUi(this));

        usernameTxtBox.getElement().setPropertyString("placeholder","username");
        passwordTxtBox.getElement().setPropertyString("placeholder", "password");
    }

    // Method to add a Click Handler to the login button
    public void addClickHandlers(ClickHandler clickHandler) {
        loginBtn.addClickHandler(clickHandler);
        registerBtn.addClickHandler(clickHandler);
    }

    // Method to clean the tectbox fiels
    public void clearTextBoxFields(){
        usernameTxtBox.setText("");
        passwordTxtBox.setText("");
    }

    // Getters for the usernameTxtBox and passwordTxtBox
    public TextBox getUsernameTxtBox() { return usernameTxtBox; }
    public PasswordTextBox getPasswordTxtBox() { return passwordTxtBox; }
}