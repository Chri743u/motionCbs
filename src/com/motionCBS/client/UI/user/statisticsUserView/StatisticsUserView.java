package com.motionCBS.client.UI.user.statisticsUserView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class StatisticsUserView extends Composite {
    interface StatisticsUserViewUiBinder extends UiBinder<HTMLPanel, StatisticsUserView> {
    }

    private static StatisticsUserViewUiBinder ourUiBinder = GWT.create(StatisticsUserViewUiBinder.class);

    public StatisticsUserView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}