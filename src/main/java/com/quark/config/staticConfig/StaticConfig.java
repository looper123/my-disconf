package com.quark.config.staticConfig;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhenpengLu on 2017/12/18.
 * 静态配置文件和静态配置项
 */
//targetDirPath属性不为空的时候 不会下载到classpath下 而是会下载到DisconfFile 指定的目录下
@DisconfFile(filename = "static.properties")
public class StaticConfig {

    private static final Logger logger = LoggerFactory.getLogger(StaticConfig.class);
    public  static int staticVar;

    @DisconfFileItem(name = "staticVar", associateField = "staticVar")
    public static int getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(int staticVar) {
        logger.info("StaticConfig's  property is changed");
        StaticConfig.staticVar = staticVar;
    }
}
