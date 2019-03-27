package com.motionCBS.client.UI.admin.mainAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckLayoutPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
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
    Button statistics;
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

    }

}