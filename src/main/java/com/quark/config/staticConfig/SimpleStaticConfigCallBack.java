package com.quark.config.staticConfig;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhenpengLu on 2017/12/18.
 */
@DisconfUpdateService(confFileKeys = {"static.properties"})
public class SimpleStaticConfigCallBack implements IDisconfUpdate {

    private static final Logger logger = LoggerFactory.getLogger(SimpleStaticConfigCallBack.class);

    @Override
    public void reload() throws Exception {
        logger.info("SimpleStaticConfigCallBack is running...");
        SimpleStaticConfService.getStaticConfInfo();
    }
}
