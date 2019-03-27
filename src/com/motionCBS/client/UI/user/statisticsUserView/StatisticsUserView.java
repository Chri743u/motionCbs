package com.motionCBS.client.UI.user.statisticsUserView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class StatisticsUserView {
    interface StatisticsUserViewUiBinder extends UiBinder<DivElement, StatisticsUserView> {
    }

    private static StatisticsUserViewUiBinder ourUiBinder = GWT.create(StatisticsUserViewUiBinder.class);

    public StatisticsUserView() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}