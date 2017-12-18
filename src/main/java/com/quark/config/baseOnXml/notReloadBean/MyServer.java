package com.quark.config.baseOnXml.notReloadBean;

/**
 * Created by ZhenpengLu on 2017/12/18.
 * 非自动加载bean
 */
public class MyServer {

    private String server;

    private String retry;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getRetry() {
        return retry;
    }

    public void setRetry(String retry) {
        this.retry = retry;
    }
}
