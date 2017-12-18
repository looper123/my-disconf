package com.quark.config.Coefficients;

import com.baidu.disconf.client.common.annotations.DisconfItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ZhenpengLu on 2017/12/18.
 */
@Service
@Scope("singleton")
public class BaoBaoService {

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(BaoBaoService.class);

    public static final String key = "moneyInvest";

    private Double moneyInvest = 1000d;

    @Autowired
    private Coefficients coefficients;

    /**
     *
     *
     * @return
     */
    public double calcMoney() {
        LOGGER.info("update discountRate is.."+coefficients.getDiscount()+"..moneyInvest.."+getMoneyInvest());
        return 10000 * coefficients.getDiscount();
    }

//    获取单独的配置项
    @DisconfItem(key = key)
    public Double getMoneyInvest() {
        return moneyInvest;
    }

    public void setMoneyInvest(Double moneyInvest) {
        this.moneyInvest = moneyInvest;
    }
}
