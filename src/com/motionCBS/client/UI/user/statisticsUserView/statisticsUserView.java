package com.motionCBS.client.UI.user.statisticsUserView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class statisticsUserView extends Composite {
    interface statisticsUserViewUiBinder extends UiBinder<HTMLPanel, statisticsUserView> {
    }

    private static statisticsUserViewUiBinder ourUiBinder = GWT.create(statisticsUserViewUiBinder.class);

    public statisticsUserView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}