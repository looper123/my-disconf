package com.quark.config.configuration;

import com.baidu.disconf.client.usertools.IDisconfDataGetter;
import com.baidu.disconf.client.usertools.impl.DisconfDataGetterDefaultImpl;

import java.util.Map;

/**
 * Created by ZhenpengLu on 2017/12/19.
 */
public class DisconfDataGetter {

    private static IDisconfDataGetter iDisconfDataGetter = new DisconfDataGetterDefaultImpl();

    /**
     * 根据 分布式配置文件 获取该配置文件的所有数据，以 map形式呈现 （.properties配置文件）
     *
     * @param fileName
     *
     * @return
     */
    public static Map<String, Object> getByFile(String fileName) {
        return iDisconfDataGetter.getByFile(fileName);
    }

    /**
     * 获取 分布式配置文件 获取该配置文件 中 某个配置项 的值 （.properties配置文件）
     *
     * @param fileName
     * @param fileItem
     *
     * @return
     */
    public static Object getByFileItem(String fileName, String fileItem) {
        return iDisconfDataGetter.getByFileItem(fileName, fileItem);
    }

    /**
     * 根据 分布式配置 获取其值（配置项）
     *
     * @param itemName
     *
     * @return
     */
    public static Object getByItem(String itemName) {
        return iDisconfDataGetter.getByItem(itemName);
    }
}
