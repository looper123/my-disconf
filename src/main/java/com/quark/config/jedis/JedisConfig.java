package com.quark.config.jedis;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ZhenpengLu on 2017/12/14.
 * 注解类 连接disconfig配置 自动同步
 */
@Service
@Scope("singleton")
@DisconfFile(filename = "redis.properties")
//@DisconfUpdateService(classes = {JedisConfig.class})
//@EnableAsync(proxyTargetClass=true)
//@EnableCaching
public class JedisConfig  {

    protected static final Logger LOGGER = LoggerFactory.getLogger(JedisConfig.class);

    // 代表连接地址
    private String host;

    // 代表连接port
    private int port;

    /**
     * 地址, 分布式文件配置
     *
     * @return
     */
    @DisconfFileItem(name = "redis.host", associateField = "host")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 端口, 分布式文件配置
     *
     * @return
     */
//    获取配置文件下的配置项
    @DisconfFileItem(name = "redis.port", associateField = "port")
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


}
