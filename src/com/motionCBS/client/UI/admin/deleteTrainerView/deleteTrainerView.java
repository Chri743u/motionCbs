package com.motionCBS.client.UI.admin.deleteTrainerView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class deleteTrainerView extends Composite {
    interface deleteTrainerViewUiBinder extends UiBinder<HTMLPanel, deleteTrainerView> {
    }

    private static deleteTrainerViewUiBinder ourUiBinder = GWT.create(deleteTrainerViewUiBinder.class);

    public deleteTrainerView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}