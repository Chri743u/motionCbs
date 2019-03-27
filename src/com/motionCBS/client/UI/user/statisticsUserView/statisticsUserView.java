package com.motionCBS.client.UI.user.statisticsUserView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class StatisticsUserView extends Composite {

    private static StatisticsUserViewUiBinder uiBinder = GWT.create(StatisticsUserViewUiBinder.class);


    interface UsersViewUiBinder extends UiBinder<HTMLPanel, StatisticsUserView> {}


    public StatisticsUserView() {
        initWidget(uiBinder.createAndBindUi(this));    }
}