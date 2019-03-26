package com.motionCBS.client.UI.admin.mainAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class mainAdminView extends Composite {
    interface mainAdminViewUiBinder extends UiBinder<HTMLPanel, mainAdminView> {
    }

    private static mainAdminViewUiBinder ourUiBinder = GWT.create(mainAdminViewUiBinder.class);

    public mainAdminView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}