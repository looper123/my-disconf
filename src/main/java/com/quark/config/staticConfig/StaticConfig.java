package com.quark.config.staticConfig;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

/**
 * Created by ZhenpengLu on 2017/12/18.
 * 静态配置文件和静态配置项
 */
@DisconfFile(filename = "static.properties")
public class StaticConfig {

    public  static int staticVar;

    @DisconfFileItem(name = "staticVar", associateField = "staticVar")
    public static int getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(int staticVar) {
        StaticConfig.staticVar = staticVar;
    }
}
