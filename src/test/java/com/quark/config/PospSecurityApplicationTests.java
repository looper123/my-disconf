//package com.quark.config;
//
//import com.qf.posp.serv.util.JsonProviderHolder;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Map;
//import java.util.TreeMap;
//
//@RunWith(SpringRunner.class)
//public class PospSecurityApplicationTests {
//
//
//    /**
//     * 测试加密
//     * @throws Exception
//     */
//    @Test
//    public void testEncrypt() throws Exception {
//        String orign = "{\"token\": \"Wxdm32yZfQD0m8waDaev1O91OqXpydQDM3HkqRxAAeZkd2UMXkaIhGIMyEBDMoBwSyQL3FySFn95m0eRHu59AchDRGWcbMlDGPYJ\", \"remark\": \"\", \"tradeNo\": \"10C101000009515112080001868742\", \"tradeDate\": \"2017-11-21\", \"tradeTime\": \"04:00:00\", \"interfaceId\": \"QF-POSP-DEPO-REFRESH_APPLICATION_TOKEN-0095\", \"merchantCode\": \"10\", \"applicationCode\": \"1000\", \"oldTokenExpires\": \"5111\"}";
//        //加密秘钥
//        String keyBase64 = "2l1kltfeVz7SXh87yKA/YQ==";
//        Map<String,Object> map = JsonProviderHolder.JACKSON.parse(orign,TreeMap.class);
//        StringBuffer sb = new StringBuffer("");
//        for (Map.Entry<String,Object> entry : map.entrySet()){
//            sb.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
//        }
//        String digestSrc = sb.substring(0,sb.length()-1);
//        String digest = AesSecurityUtils.digest(digestSrc);
//        map.put("digest",digest);
//        //待加密报文
//        orign = JsonProviderHolder.JACKSON.convertObj(map);
//        String encryptData = AesSecurityUtils.encrypt(keyBase64,orign);
//        System.out.println("加密之后的报文:"+encryptData);
//    }
//
//    /**
//     * 测试解密
//     * @throws Exception
//     */
//    @Test
//    public void testDecrypt() throws Exception {
//        //解密秘钥
//        String keyBase64 = "2l1kltfeVz7SXh87yKA/YQ==";
//        //加密后的报文
//        String encryptData = "ZNYefBnflEu3pHavXCgGoZBZdkPQUwIlmC0nn8hH/0RoelQ/Sr4+ehoFtN+Lp1JpDWiJx8M3zb6FV8on1uNHG3g27ZhvP8ZoljdYkrHSdS+yk1fYFHfMQuxP5COo44VCRJVU9yq4nZolwMIc2rPhn6YEIMynpQB8I0Txbtw7JfLBZLt9xV/NSw7zjMlTFNztkFlmyVg4BMo89121uvOikEELClIt1XD/ThxRjpb1SaimHphXjUU9IzF7i7LJRiQ4bz+7mSbcGh0VCvC/soEzgSxcz1y5z0mtbpwaDTBy2gK+JAOeKJABKLg1H0kURvTlfSOjSuPDBCvPQ3dyKpuXP6Dbij7ptRnO7k/MNH2u3oV+AJ7RNef05b2DLkwIpTMVCa92TGg1aiswbjIMbvGQymoQu1xmXY10lFgMnq8jgkaE86sZF1pPHujoqyqHDwGh0ASSxhpDANKiDVNb6d0PVZRycQ42/DiNCzC0mebi3rrNRHyjRCLFFqgKkgY+ilss";
//
//        System.out.println("##########开始解密##########################");
//        String orign = AesSecurityUtils.decrypt(keyBase64,encryptData);
//        System.out.println("解密成功<<<<<<-----"+orign);
//        System.out.println("##########开始解密##########################");
//
//
//        System.out.println("##########验证摘要##########################");
//        Map<String,Object> map = JsonProviderHolder.JACKSON.parse(orign,TreeMap.class);
//        String orignDigest = (String) map.get("digest");
//        map.remove("digest");
//        StringBuffer sd = new StringBuffer();
//        for (Map.Entry<String,Object> entry : map.entrySet()) {
//            sd.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
//        }
//        String digestSrc  = sd.substring(0,sd.length()-1);
//        String digest = AesSecurityUtils.digest(digestSrc);
//        Assert.assertTrue(orignDigest.equals(digest));
//        System.out.println("##########验证摘要##########################");
//
//
//    }
//
//
//}
