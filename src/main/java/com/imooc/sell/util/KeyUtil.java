package com.imooc.sell.util;

import java.util.Random;

public class KeyUtil {
    /**
     * 生成一个随机数，并加入synchronized,防止并发
     * @return
     */
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
