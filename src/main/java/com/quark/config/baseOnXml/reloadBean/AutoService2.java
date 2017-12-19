package com.quark.config.baseOnXml.reloadBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhenpengLu on 2017/12/18.
 */
public class AutoService2 {

    private static final Logger logger = LoggerFactory.getLogger(AutoService2.class);

    private String auto2;

    public String getAuto2() {
        return auto2;
    }

    public void setAuto2(String auto2) {
        logger.info("AutoService2's property has changed auto2="+auto2);
        this.auto2 = auto2;
    }
}
