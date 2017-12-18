package com.quark.config.baseOnXml.notReloadBean;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ZhenpengLu on 2017/12/18.
 * xml不会自动加载bean
 */
@Service
@Scope("singleton")
@DisconfUpdateService(confFileKeys = {"myserver.properties"})
public class SimpleXmlNoReloadCallBack implements IDisconfUpdate {

    @Autowired
    private MyServer myServer;

    private static final Logger logger = LoggerFactory.getLogger(SimpleXmlNoReloadCallBack.class);

    @Override
    public void reload() throws Exception {
        logger.info("call back is running...retry="+myServer.getRetry());
        logger.info("call back is running...server="+myServer.getServer());

    }
}
