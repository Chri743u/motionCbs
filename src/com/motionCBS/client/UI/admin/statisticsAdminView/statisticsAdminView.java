package com.motionCBS.client.UI.admin.statisticsAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class statisticsAdminView extends Composite {
    interface statisticsAdminViewUiBinder extends UiBinder<HTMLPanel, statisticsAdminView> {
    }

    private static statisticsAdminViewUiBinder ourUiBinder = GWT.create(statisticsAdminViewUiBinder.class);

    public statisticsAdminView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}