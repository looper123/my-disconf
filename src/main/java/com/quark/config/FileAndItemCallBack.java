package com.quark.config;

import com.baidu.disconf.client.common.update.IDisconfUpdatePipeline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by ZhenpengLu on 2017/12/19.
 * 远程库配置更新时回调此方法
 * 不需要注解，不需要必须指定变更地象。更加freely，方便大家在这里统一的、自由的控制更新逻辑
 */
@Service
public class FileAndItemCallBack implements IDisconfUpdatePipeline {

    private static final Logger  logger = LoggerFactory.getLogger(FileAndItemCallBack.class);

    //监控配置文件的改变
    /**
     * @param key      文件名
     * @param filePath 文件路径
     * @throws Exception
     */
    @Override
    public void reloadDisconfFile(String key, String filePath) throws Exception {
        logger.info("configuration file is changed key="+key+"---filePath="+filePath);
    }

    //监控配置项的改变
    /**
     * @param key     配置项名
     * @param content 配置内容
     * @throws Exception
     */
    @Override
    public void reloadDisconfItem(String key, Object content) throws Exception {
        logger.info("configuration item is changed key="+key+"------content="+content);
    }
}
