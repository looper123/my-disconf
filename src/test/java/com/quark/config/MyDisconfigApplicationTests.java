package com.quark.config;

import com.alibaba.fastjson.JSON;
import com.quark.config.configuration.DisconfDataGetter;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.misc.BASE64Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

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

	@Test
	public void testEncode() throws IOException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException {
		/**
		 * applicationCode=1000,interfaceId=QF-POSP-DEPO-REFRESH_APPLICATION_TOKEN-0095,
		 * merchantCode=10,oldTokenExpires=5,remark=,
		 * token=Wxdm32yZfQD0m8waDaev1O91OqXpydQDM3HkqRxAAeZkd2UMXkaIhGIMyEBDMoBwSyQL3FySFn95m0eRHu59AchDRGWcbMlDGPYJ,
		 * tradeDate=2017-11-21,tradeNo=10C101000009515112080001868742,tradeTime=04:00:00
		 */
		/**
		 * ZNYefBnflEu3pHavXCgGoZBZdkPQUwIlmC0nn8hH/0RoelQ/Sr4+ehoFtN+Lp1JpDWiJx8M3zb6FV8on1uNHG3g27ZhvP8ZoljdYkrHSdS+yk1fYFHfMQuxP5COo44VCRJVU9yq4nZolwMIc2rPhn6YEIMynpQB8I0Txbtw7JfLBZLt9xV/NSw7zjMlTFNztkFlmyVg4BMo89121uvOikEELClIt1XD/ThxRjpb1SaimHphXjUU9IzF7i7LJRiQ4bz+7mSbcGh0VCvC/soEzgSxcz1y5z0mtbpwaDTBy2gK+JAOeKJABKLg1H0kURvTlfSOjSuPDBCvPQ3dyKpuXP6Dbij7ptRnO7k/MNH2u3oV+AJ7RNef05b2DLkwIpTMVCa92TGg1aiswbjIMbvGQymoQu1xmXY10lFgMnq8jgkaE86sZF1pPHujoqyqHDwGh0ASSxhpDANKiDVNb6d0PVZRycQ42/DiNCzC0mebi3rrNRHyjRCLFFqgKkgY+ilss
		 */
		String originDecodeMessage= "ZNYefBnflEu3pHavXCgGoZBZdkPQUwIlmC0nn8hH/0RoelQ/Sr4+ehoFtN+Lp1JpDWiJx8M3zb6FV8on1uNHG3g27ZhvP8ZoljdYkrHSdS+yk1fYFHfMQuxP5COo44VCRJVU9yq4nZolwMIc2rPhn6YEIMynpQB8I0Txbtw7JfLBZLt9xV/NSw7zjMlTFNztkFlmyVg4BMo89121uvOikEELClIt1XD/ThxRjpb1SaimHphXjUU9IzF7i7LJRiQ4bz+7mSbcGh0VCvC/soEzgSxcz1y5z0mtbpwaDTBy2gK+JAOeKJABKLg1H0kURvTlfSOjSuPDBCvPQ3dyKpuXP6Dbij7ptRnO7k/MNH2u3oV+AJ7RNef05b2DLkwIpTMVCa92TGg1aiswbjIMbvGQymoQu1xmXY10lFgMnq8jgkaE86sZF1pPHujoqyqHDwGh0ASSxhpDANKiDVNb6d0PVZRycQ42/DiNCzC0mebi3rrNRHyjRCLFFqgKkgY+ilss";
		java.security.Key key = new SecretKeySpec(Base64.decodeBase64("2l1kltfeVz7SXh87yKA/YQ=="), "AES");
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
		Cipher decryptor = Cipher.getInstance("AES/ECB/PKCS5Padding", BouncyCastleProvider.PROVIDER_NAME);
		decryptor.init(Cipher.DECRYPT_MODE, key);
		byte[] bytes = decryptor.doFinal(Base64.decodeBase64(originDecodeMessage));
		String s = new String(bytes, "utf-8");
		Map<String, Object> inMap = (Map<String, Object>) JSON.parse(s);
//		Map<String, Object> inMap = new HashMap<>();
//		inMap.put("interfaceId","QF-POSP-DEPO-REFRESH_APPLICATION_TOKEN-0095");
//		inMap.put("merchantCode","10");
//		inMap.put("oldTokenExpires","5");
//		inMap.put("remark","");
//		inMap.put("token","Wxdm32yZfQD0m8waDaev1O91OqXpydQDM3HkqRxAAeZkd2UMXkaIhGIMyEBDMoBwSyQL3FySFn95m0eRHu59AchDRGWcbMlDGPYJ");
//		inMap.put("tradeNo","10C101000009515112080001868742");
//		inMap.put("tradeTime","04:00:00");
//		inMap.put("tradeDate","2017-11-21");
//		inMap.put("applicationCode","9999");
//		inMap.put("digest","TJYBJ6ZOSlwOYYGyI4LLqg==");
//		String "{\n" +
//				"  \"encodeMessage\":\"ewoiaW50ZXJmYWNlSWQiOiJRRi1QT1NQLURFUE8tUkVGUkVTSF9BUFBMSUNBVElPTl9UT0tFTi0wMDk1IiwKImRpZ2VzdCI6ICJUSllCSjZaT1Nsd09ZWUd5STRMTHFnPT0iLAoidHJhZGVObyI6IjEwQzEwMTAwMDAwOTUyMDE3MTAyNzE1MTU0NDExMTAwMDEiLAoibWVyY2hhbnRDb2RlIjoiMTAiLAoiYXBwbGljYXRpb25Db2RlIjoiOTk5OSIsCiJ0b2tlbiI6IjZjNDg3NTBmMTI5NzQ0YmZiNmZkMmY4MjU0ZDdlNTFiIiwKIm9sZFRva2VuRXhwaXJlcyI6IjUiLAoidHJhZGVEYXRlIjoiMjAxNy0xMC0yNyIsCiJ0cmFkZVRpbWUiOiIxNDoyNTo1NSIsCiJyZW1hcmsiOiIiCn0=\"\n" +
//				"} \n"
		Map<String, Object> treeMap = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (Map.Entry<String,Object> entry:inMap.entrySet()) {
			treeMap.put(entry.getKey(),entry.getValue());
//			requestVo.getInMap().put(entry.getKey(),entry.getValue());
		}
		//构建digest
		StringBuffer buffer = new StringBuffer();
		for (Map.Entry<String,Object> entry:treeMap.entrySet()) {
			if(!"digest".equals(entry.getKey())){
				buffer.append(entry.getKey()+"="+entry.getValue()+",");
			}else{
//				digest = (String) entry.getValue();
			}
		}
		String paramStr = buffer.substring(0, buffer.length() - 1);
		//TJYBJ6ZOSlwOYYGyI4LLqg==
		String md5 = new BASE64Encoder().encode(MessageDigest.getInstance("MD5").digest(paramStr.getBytes("utf-8")));
		System.out.println("1111");
	}

	public void baseAesTest(){

	}




}
