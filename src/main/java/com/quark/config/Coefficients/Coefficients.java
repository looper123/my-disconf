package com.quark.config.Coefficients;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ZhenpengLu on 2017/12/18.
 */
@Service
@DisconfFile(filename = "coefficients.properties")
public class Coefficients {

    public static final String key = "discountRate";

    @Value(value = "2.0d")
    private Double discount;


    /**
     * 折扣率，分布式配置
     *
     * @return
     */
    @DisconfItem(key = key)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
