package com.imooc.sell.Exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * 异常处理类
 * @author hexin
 * @date 2019/02/26
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum code) {
        super(code.getMessage());
        this.code = code.getCode();
    }

    public SellException(String message, Integer code) {
        super(message);
        this.code = code;
    }
}
