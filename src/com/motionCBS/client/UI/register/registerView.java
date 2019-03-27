package com.motionCBS.client.UI.register;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.*;

public class registerView extends Composite {
    private VerticalPanel vPanel;

    private TextBox txtFname;
    private TextBox txtLname;
    private TextBox txtEmail;
    private TextBox txtAddress;
    private TextBox txtMobileNo;
    private TextBox txtEducation;
    private ListBox lstExperience;
    private ListBox lstHoursPrWeek;
    private PasswordTextBox txtPassword;
    private ListBox lstTeamtype;

    interface registerViewUiBinder extends UiBinder<HTMLPanel, registerView> {


    }

    private static registerViewUiBinder ourUiBinder = GWT.create(registerViewUiBinder.class);

    public registerView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}