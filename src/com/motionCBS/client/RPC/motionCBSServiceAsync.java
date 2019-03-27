package com.motionCBS.client.RPC;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.motionCBS.Shared.User;

public interface motionCBSServiceAsync {
    void authorizeUser(String username, String password, AsyncCallback<User> async);
}
