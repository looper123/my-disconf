package com.quark.config;

import com.quark.config.configuration.DisconfDataGetter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyDisconfigApplicationTests {


	@Test
	public void contextLoads() {
		Map<String, Object> map = DisconfDataGetter.getByFile("redis.properties");
		String host = (String)DisconfDataGetter.getByFileItem("redis.properties", "redis.host");
		Double discountRate = (Double)DisconfDataGetter.getByItem("discountRate");
		System.out.println("end..........");
	}



}
