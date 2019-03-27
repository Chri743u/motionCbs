package com.motionCBS.client.RPC;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.motionCBS.Shared.User;

import java.util.ArrayList;

public interface motionCBSServiceAsync {
    void authorizeUser(String username, String password, AsyncCallback<User> async);
    void getUsers(int userId, AsyncCallback<ArrayList<User>> asyncCallback) throws IllegalArgumentException;
}
