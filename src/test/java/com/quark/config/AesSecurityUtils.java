//package com.quark.config;
//
//import com.qf.posp.exception.EncryptionException;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.codec.binary.Base64;
//
//import javax.crypto.spec.SecretKeySpec;
//import java.security.Key;
//
///**
// * 名称: AesSecurityUtils.java <br>
// * 描述:<br>
// * 类型: JAVA<br>
// * 最近修改时间:2017/12/4 16:36<br>
// *
// * @author HaoWu
// * @version [版本号, V1.0]
// * @since 2017/12/4 16:36
// */
//@Slf4j
//public class AesSecurityUtils {
//
//	private static final String ENCODING = "UTF-8";
//	/**
//	 * 秘钥算法
//	 */
//	private static final String KEY_ALGORITHM = "AES";
//	/**
//	 * 加密算法
//	 */
//	private static final String CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
//	/**
//	 * 摘要算法
//	 */
//	private static final String DIGEST_ALGORITHM = "MD5";
//
//	public static String encrypt(String keyBase64, String orign) {
//		try {
//			Key key = new SecretKeySpec(Base64.decodeBase64(keyBase64), KEY_ALGORITHM);
//			byte[] encryptData = SecurityUtils.encrypt(CIPHER_ALGORITHM, key, orign.getBytes(ENCODING));
//			return Base64.encodeBase64String(encryptData);
//		} catch (Exception e) {
//			log.error("encrypt data error", e);
//			throw new EncryptionException("encrypt data error", e);
//		}
//	}
//
//	public static String decrypt(String keyBase64, String encryptData) {
//		try {
//			Key key = new SecretKeySpec(Base64.decodeBase64(keyBase64), KEY_ALGORITHM);
//			byte[] decryptData = SecurityUtils.decrypt(CIPHER_ALGORITHM, key, Base64.decodeBase64(encryptData));
//			return new String(decryptData, ENCODING);
//		} catch (Exception err) {
//			throw new EncryptionException("decrypt error.", err);
//		}
//
//	}
//
//	public static String digest(String digestSrc) {
//		try {
//			return Base64.encodeBase64String(SecurityUtils.digest(DIGEST_ALGORITHM, digestSrc.getBytes(ENCODING)));
//		} catch (Exception e) {
//			log.error("digest data error", e);
//			throw new EncryptionException("digest data error", e);
//		}
//	}
//
//}
