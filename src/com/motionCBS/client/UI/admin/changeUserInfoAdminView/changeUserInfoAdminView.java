package com.motionCBS.client.UI.admin.changeUserInfoAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class changeUserInfoAdminView extends Composite {
    interface changeUserInfoAdminViewUiBinder extends UiBinder<HTMLPanel, changeUserInfoAdminView> {
    }

    private static changeUserInfoAdminViewUiBinder ourUiBinder = GWT.create(changeUserInfoAdminViewUiBinder.class);

    public changeUserInfoAdminView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}