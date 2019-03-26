package com.motionCBS.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("motionCBSService")
public interface motionCBSService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use motionCBSService.App.getInstance() to access static instance of motionCBSServiceAsync
     */
    public static class App {
        private static motionCBSServiceAsync ourInstance = GWT.create(motionCBSService.class);

        public static synchronized motionCBSServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
