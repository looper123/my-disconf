package com.quark.config.baseOnXml.notReloadBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhenpengLu on 2017/12/18.
 * 非自动加载bean
 */
public class MyServer {

    private static final Logger logger = LoggerFactory.getLogger(MyServer.class);

    private String server;

    private String retry;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        logger.info("MyServer's property has changed server=" + server);
        this.server = server;
    }

    public String getRetry() {
        return retry;
    }

    public void setRetry(String retry) {
        logger.info("MyServer's property has changed retry=" + retry);
        this.retry = retry;
    }
}
