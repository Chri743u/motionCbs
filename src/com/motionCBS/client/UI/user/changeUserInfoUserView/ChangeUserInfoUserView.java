package com.motionCBS.client.UI.user.changeUserInfoUserView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class ChangeUserInfoUserView {
    interface ChangeUserInfoUserViewUiBinder extends UiBinder<DivElement, ChangeUserInfoUserView> {
    }

    private static ChangeUserInfoUserViewUiBinder ourUiBinder = GWT.create(ChangeUserInfoUserViewUiBinder.class);

    public ChangeUserInfoUserView() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}