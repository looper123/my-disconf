package com.quark.config.staticConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhenpengLu on 2017/12/18.
 */
public class SimpleStaticConfService {

    private static final Logger logger = LoggerFactory.getLogger(SimpleStaticConfService.class);

    private static int staticItem = 56;

    public static void getStaticConfInfo(){
        logger.info("static config is update.."+StaticConfig.staticVar);
    }
}
