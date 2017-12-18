package com.quark.config.jedis;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ZhenpengLu on 2017/12/14.
 * 配置更新回调
 */
@Service
@Scope("singleton")
@DisconfUpdateService(classes={JedisConfig.class})
//效果同上@DisconfUpdateService(confFileKeys = { "redis.properties" })
public class SimpleRedisServiceUpdateCallback implements IDisconfUpdate {

    protected static final Logger LOGGER = LoggerFactory.getLogger(SimpleRedisServiceUpdateCallback.class);

    @Autowired
    private SimpleRedisService simpleRedisService;

    /**
     *配置更改后回调方法
     */
    public void reload() throws Exception {
        LOGGER.info("call back method is running!!");
        simpleRedisService.changeJedis();
    }

}
