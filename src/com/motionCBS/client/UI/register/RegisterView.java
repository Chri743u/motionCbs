package com.motionCBS.client.UI.register;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.*;

public class RegisterView extends Composite {
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

    interface registerViewUiBinder extends UiBinder<HTMLPanel, RegisterView> {

    }

    private static registerViewUiBinder ourUiBinder = GWT.create(registerViewUiBinder.class);

    public RegisterView() {
        initWidget(ourUiBinder.createAndBindUi(this));

        // panel
        vPanel = new VerticalPanel();

        // init panel
        initWidget(this.vPanel);

        // flextable
        FlexTable t = new FlexTable();

        // define widgets
        txtFname = new TextBox();
        txtLname = new TextBox();
        txtEmail = new TextBox();
        txtAddress = new TextBox();
        txtMobileNo = new TextBox();
        txtEducation = new TextBox();
        lstExperience = new ListBox();
        lstHoursPrWeek = new ListBox();
        txtPassword = new PasswordTextBox();
        lstTeamtype = new ListBox();
        Button btnSubmit = new Button("Submit");

        // add values to listboxes
        lstExperience.addItem("1");
        lstExperience.addItem("2");
        lstExperience.addItem("3");
        lstExperience.addItem("4");
        lstExperience.addItem("5");
        lstExperience.addItem("6");
        lstExperience.addItem("7");
        lstExperience.addItem("8");
        lstExperience.addItem("9");
        lstExperience.addItem("10");
        lstExperience.addItem("11");
        lstExperience.addItem("12");
        lstExperience.addItem("13");
        lstExperience.addItem("14");
        lstExperience.addItem("15");
        lstExperience.addItem("16");
        lstExperience.addItem("17");
        lstExperience.addItem("18");
        lstExperience.addItem("19");
        lstExperience.addItem("20");

        lstHoursPrWeek.addItem("1");
        lstHoursPrWeek.addItem("2");
        lstHoursPrWeek.addItem("3");
        lstHoursPrWeek.addItem("4");
        lstHoursPrWeek.addItem("5");
        lstHoursPrWeek.addItem("6");
        lstHoursPrWeek.addItem("7");
        lstHoursPrWeek.addItem("8");
        lstHoursPrWeek.addItem("9");
        lstHoursPrWeek.addItem("10");
        lstHoursPrWeek.addItem("11");
        lstHoursPrWeek.addItem("12");
        lstHoursPrWeek.addItem("13");
        lstHoursPrWeek.addItem("14");
        lstHoursPrWeek.addItem("15");
        lstHoursPrWeek.addItem("16");
        lstHoursPrWeek.addItem("17");
        lstHoursPrWeek.addItem("18");
        lstHoursPrWeek.addItem("19");
        lstHoursPrWeek.addItem("20");
        lstHoursPrWeek.addItem("21");
        lstHoursPrWeek.addItem("22");
        lstHoursPrWeek.addItem("23");
        lstHoursPrWeek.addItem("24");
        lstHoursPrWeek.addItem("25");
        lstHoursPrWeek.addItem("26");
        lstHoursPrWeek.addItem("27");
        lstHoursPrWeek.addItem("28");
        lstHoursPrWeek.addItem("29");
        lstHoursPrWeek.addItem("30");
        lstHoursPrWeek.addItem("31");
        lstHoursPrWeek.addItem("32");
        lstHoursPrWeek.addItem("33");
        lstHoursPrWeek.addItem("34");
        lstHoursPrWeek.addItem("35");
        lstHoursPrWeek.addItem("36");
        lstHoursPrWeek.addItem("37");
        lstHoursPrWeek.addItem("38");
        lstHoursPrWeek.addItem("39");
        lstHoursPrWeek.addItem("40");

        lstTeamtype.addItem("Crossfit");
        lstTeamtype.addItem("H.I.T");
        lstTeamtype.addItem("Spinning");
        lstTeamtype.addItem("Stram op");







    }
}