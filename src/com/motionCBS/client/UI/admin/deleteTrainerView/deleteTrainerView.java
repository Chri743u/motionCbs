package com.motionCBS.client.UI.admin.deleteTrainerView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class DeleteTrainerView extends Composite {
    interface deleteTrainerViewUiBinder extends UiBinder<HTMLPanel, DeleteTrainerView> {
    }

    private static deleteTrainerViewUiBinder ourUiBinder = GWT.create(deleteTrainerViewUiBinder.class);

    public DeleteTrainerView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}