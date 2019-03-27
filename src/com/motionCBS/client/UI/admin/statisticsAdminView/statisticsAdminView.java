package com.motionCBS.client.UI.admin.statisticsAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class StatisticsAdminView extends Composite {
    interface statisticsAdminViewUiBinder extends UiBinder<HTMLPanel, StatisticsAdminView> {
    }

    private static statisticsAdminViewUiBinder ourUiBinder = GWT.create(statisticsAdminViewUiBinder.class);

    public StatisticsAdminView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}