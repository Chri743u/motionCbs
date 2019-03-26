package com.motionCBS.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.motionCBS.client.motionCBSService;

public class motionCBSServiceImpl extends RemoteServiceServlet implements motionCBSService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}