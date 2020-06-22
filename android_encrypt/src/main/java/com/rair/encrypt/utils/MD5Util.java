package com.rair.encrypt.utils;

import android.util.Base64;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    private static final String ALGORITHM = "MD5";

    /**
     * MD5加密
     */
    public static byte[] encrypt(String src) {
        try {
            MessageDigest md = MessageDigest.getInstance(ALGORITHM);
            byte[] input = src.getBytes(StandardCharsets.UTF_8);
            return md.digest(input);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /**
     * MD5 - BASE64编码
     */
    public static String encryptWithBase64(String src) throws UnsupportedEncodingException {
        // MD5加密
        byte[] result = encrypt(src);
        // result字节转换为 16 进制内容
        //Integer.toHexString(int)
        String hexString = getHexString(result);
        // Base64编码
        return Base64.encodeToString(hexString.getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
    }

    private final static String[] HEX_DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    private static String getHexString(byte[] result) {
        StringBuilder buffer = new StringBuilder();
        for (int b : result) {
            int iResult = b;
            if (iResult < 0) {
                iResult += 256;
            }
            int id1 = iResult / 16;
            int id2 = iResult % 16;
            // 5 d
            System.out.println(HEX_DIGITS[id1] + HEX_DIGITS[id2]);
            buffer.append(HEX_DIGITS[id1]).append(HEX_DIGITS[id2]);
        }
        return buffer.toString();
    }
}





