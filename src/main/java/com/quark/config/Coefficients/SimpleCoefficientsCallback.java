package com.quark.config.Coefficients;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ZhenpengLu on 2017/12/18.
 */
@Service
@Scope("singleton")
//监控配置项的改变
@DisconfUpdateService(itemKeys = { Coefficients.key })
public class SimpleCoefficientsCallback implements IDisconfUpdate {

    private static final Logger  logger = LoggerFactory.getLogger(SimpleCoefficientsCallback.class);

    @Autowired
    private BaoBaoService baoBaoService;
    @Override
    public void reload() throws Exception {
        logger.info("call back method is running!!!");
        baoBaoService.calcMoney();
    }
}
