package com.quark.config.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by ZhenpengLu on 2017/12/15.
 */
@Configuration
@ImportResource(locations = {"classpath:disconfig.xml"})
public class MyConfiguration {
}
