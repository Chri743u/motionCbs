package com.motionCBS.client.UI.admin.mainAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.motionCBS.client.UI.admin.changeUserInfoAdminView.ChangeUserInfoAdminView;
import com.motionCBS.client.UI.admin.deleteTrainerView.DeleteTrainerView;
import com.motionCBS.client.UI.admin.statisticsAdminView.StatisticsAdminView;
import com.motionCBS.client.UI.admin.verifyTrainerView.VerifyTrainerView;

public class MainAdminView extends Composite {
    interface mainAdminViewUiBinder extends UiBinder<HTMLPanel, MainAdminView> {
    }

    private static mainAdminViewUiBinder ourUiBinder = GWT.create(mainAdminViewUiBinder.class);

    @UiField
    DeckLayoutPanel centerpanel;
    @UiField
    Button verifyBtn;
    @UiField
    Button deleteBtn;
    @UiField
    Button changeBtn;
    @UiField
    Button statisticsBtn;
    @UiField
    Button logoutBtn;

    private ChangeUserInfoAdminView changeUserInfoAdminView;
    private DeleteTrainerView deleteTrainerView;
    private StatisticsAdminView statisticsAdminView;
    private VerifyTrainerView verifyTrainerView;

    public MainAdminView() {
        initWidget(ourUiBinder.createAndBindUi(this));

        changeUserInfoAdminView = new ChangeUserInfoAdminView();
        centerpanel.add(changeUserInfoAdminView);

        deleteTrainerView = new DeleteTrainerView();
        centerpanel.add(deleteTrainerView);

        statisticsAdminView = new StatisticsAdminView();
        centerpanel.add(statisticsAdminView);

        verifyTrainerView = new VerifyTrainerView();
        centerpanel.add(verifyTrainerView);

        centerpanel.showWidget(verifyTrainerView);
    }

    public void addClickHandlers (ClickHandler clickHandler) {
        verifyBtn.addClickHandler(clickHandler);
        deleteBtn.addClickHandler(clickHandler);
        changeBtn.addClickHandler(clickHandler);
        statisticsBtn.addClickHandler(clickHandler);
        logoutBtn.addClickHandler(clickHandler);
    }

    public void changeView(Widget panel) {centerpanel.showWidget(panel);}

    //Getter for the buttons
    public Button getVerifyBtn() {return verifyBtn;}

    public Button getDeleteBtn() {return deleteBtn; }

    public Button getChangeBtn() {return changeBtn;}

    public Button getStatisticsBtn() {return statisticsBtn;}

    public Button getLogoutBtn() {return logoutBtn;}

    //Getter for views
    public ChangeUserInfoAdminView getChangeUserInfoAdminView() {return changeUserInfoAdminView;}

    public DeleteTrainerView getDeleteTrainerView() {return deleteTrainerView;}

    public StatisticsAdminView getStatisticsAdminView() {return statisticsAdminView;}

    public VerifyTrainerView getVerifyTrainerView() {return verifyTrainerView;}
}