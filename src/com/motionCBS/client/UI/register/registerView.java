package com.motionCBS.client.UI.register;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class registerView extends Composite {
    interface registerViewUiBinder extends UiBinder<HTMLPanel, registerView> {
    }

    private static registerViewUiBinder ourUiBinder = GWT.create(registerViewUiBinder.class);

    public registerView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}