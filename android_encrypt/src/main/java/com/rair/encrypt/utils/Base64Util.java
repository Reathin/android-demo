package com.rair.encrypt.utils;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

public class Base64Util {

    /**
     * base64加密算法 把字符转换为 - base64的字符
     */
    public static String encode(String src) {
        if (src == null) {
            return null;
        }
        return Base64.encodeToString(src.getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
    }

    /**
     * base64加密算法 把字节转换为 - base64的字符
     */
    public static String encode(byte[] src) {
        if (src == null) {
            return null;
        }
        return Base64.encodeToString(src, Base64.NO_WRAP);
    }

    /**
     * Base64解码
     * 把编码的字符进行解码成明文
     */
    public static String decode(String dest) {
        if (dest == null) {
            return null;
        }
        byte[] buffer = Base64.decode(dest, Base64.NO_WRAP);
        return new String(buffer, StandardCharsets.UTF_8);
    }

    /**
     * Base64解码
     */
    public static byte[] decodeToBytes(String dest) {
        if (dest == null) {
            return null;
        }
        return Base64.decode(dest, Base64.NO_WRAP);
    }

    /**
     * Base64解码
     * 把编码的字符进行解码成明文
     */
    public static String decode(byte[] destBytes) {
        if (destBytes == null) {
            return null;
        }
        byte[] buffer = Base64.decode(new String(destBytes, StandardCharsets.UTF_8), Base64.NO_WRAP);
        return new String(buffer, StandardCharsets.UTF_8);
    }
}
