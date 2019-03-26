package com.motionCBS.client.UI.admin.verifyTrainerView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class verifyTrainerView extends Composite {
    interface verifyTrainerViewUiBinder extends UiBinder<HTMLPanel, verifyTrainerView> {
    }

    private static verifyTrainerViewUiBinder ourUiBinder = GWT.create(verifyTrainerViewUiBinder.class);

    public verifyTrainerView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}