package com.quark.config.baseOnXml.reloadBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhenpengLu on 2017/12/18.
 * 自定加载bean
 */
public class AutoService {

    private static final Logger logger = LoggerFactory.getLogger(AutoService.class);

    private String auto;

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        logger.info("AutoService's property has changed auto="+auto);
        this.auto = auto;
    }
}
