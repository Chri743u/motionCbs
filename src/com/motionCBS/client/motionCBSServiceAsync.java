package com.motionCBS.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface motionCBSServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
