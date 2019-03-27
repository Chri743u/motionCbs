package com.motionCBS.client.UI.user.mainUserView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.motionCBS.client.UI.user.changeUserInfoUserView.ChangeUserInfoUserView;

// We use DockLayoutPanel which contains option to place panels/widgets in North, east, west, south
// and center of the screen. We use DeckLayoutPanel in the center.

public class MainUserView extends Composite {

    interface MainUserViewUiBinder extends UiBinder<DivElement, MainUserView> {}

    private static MainUserViewUiBinder UiBinder = GWT.create(MainUserViewUiBinder.class);

    private ChangeUserInfoUserView changeUserInfoUserView;


    public MainUserView() {
        DivElement rootElement = UiBinder.createAndBindUi(this);
    }
}