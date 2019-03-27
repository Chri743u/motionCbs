package com.motionCBS.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.motionCBS.client.logic.MainController;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MotionCBS implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        RootLayoutPanel.get().add((IsWidget) new MainController());

    }
}
