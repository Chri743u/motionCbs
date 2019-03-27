package com.motionCBS.client.UI.user.changeUserInfoUserView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ChangeUserInfoUserView extends Composite {
    interface changeUserInfoUserViewUiBinder extends UiBinder<HTMLPanel, ChangeUserInfoUserView> {
    }

    private static changeUserInfoUserViewUiBinder ourUiBinder = GWT.create(changeUserInfoUserViewUiBinder.class);

    public ChangeUserInfoUserView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}