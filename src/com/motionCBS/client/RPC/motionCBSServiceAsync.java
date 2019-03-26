package com.motionCBS.client.RPC;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface motionCBSServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
