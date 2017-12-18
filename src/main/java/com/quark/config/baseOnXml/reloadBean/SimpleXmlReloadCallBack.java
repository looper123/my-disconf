package com.quark.config.baseOnXml.reloadBean;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ZhenpengLu on 2017/12/18.
 * 基于xml的两种配置的回调测试
 */
@Service
@Scope("singleton")
@DisconfUpdateService(confFileKeys={"autoconfig.properties","autoconfig2.properties"})
public class SimpleXmlReloadCallBack implements IDisconfUpdate {

    @Autowired
    private AutoService autoService;

    @Autowired
    private AutoService2 autoService2;

    private static final Logger logger = LoggerFactory.getLogger(SimpleXmlReloadCallBack.class);

    @Override
    public void reload() throws Exception {
        logger.info("call back is running...auto="+autoService.getAuto());
        logger.info("call back is running...auto2="+autoService2.getAuto2());

    }
}
