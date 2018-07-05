//package com.quark.config;
//
//import com.alibaba.fastjson.JSON;
//import com.quark.config.configuration.DisconfDataGetter;
//import org.apache.commons.codec.binary.Base64;
//import org.bouncycastle.jce.provider.BouncyCastleProvider;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import sun.misc.BASE64Encoder;
//
//import javax.crypto.BadPaddingException;
//import javax.crypto.Cipher;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//import javax.crypto.spec.SecretKeySpec;
//import java.io.IOException;
//import java.security.InvalidKeyException;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.security.NoSuchProviderException;
//import java.security.Security;
//import java.util.Comparator;
//import java.util.Map;
//import java.util.TreeMap;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MyDisconfigApplicationTests {
//
//	@Test
//	public void contextLoads() {
//		Map<String, Object> map = DisconfDataGetter.getByFile("redis.properties");
//		String host = (String)DisconfDataGetter.getByFileItem("redis.properties", "redis.host");
//		Double discountRate = (Double)DisconfDataGetter.getByItem("discountRate");
//	System.out.println("end..........");
//	}
//
//}
