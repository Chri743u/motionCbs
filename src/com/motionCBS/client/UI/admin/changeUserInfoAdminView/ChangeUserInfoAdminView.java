package com.motionCBS.client.UI.admin.changeUserInfoAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ChangeUserInfoAdminView extends Composite {
    interface changeUserInfoAdminViewUiBinder extends UiBinder<HTMLPanel, ChangeUserInfoAdminView> {
    }

    private static changeUserInfoAdminViewUiBinder ourUiBinder = GWT.create(changeUserInfoAdminViewUiBinder.class);

    public ChangeUserInfoAdminView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}

