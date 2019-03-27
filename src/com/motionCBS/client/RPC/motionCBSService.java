package com.motionCBS.client.RPC;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.motionCBS.Shared.User;

@RemoteServiceRelativePath("motionCBSService")
public interface motionCBSService extends RemoteService {

    User authorizeUser(String username, String password) throws Exception;


}
