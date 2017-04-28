package org.fsr.sso.support.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 加密工具类
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/27 14:36
 */
public final class CredentialsUtil {

    /**
     * 对source进行加密
     * @param source 加密源
     * @param alg 算法
     * @return
     */
    public static String encrypt(Object source, String alg) {
        String str = null;
        if (ALG_MD5.equalsIgnoreCase(alg)) {
            str = new Md5Hash(source).toString();
        }
        return str;
    }

    public static final String ALG_MD5 = "md5";
}
