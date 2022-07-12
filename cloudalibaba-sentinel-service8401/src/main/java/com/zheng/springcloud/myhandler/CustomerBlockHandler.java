package com.zheng.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zheng.springcloud.entity.CommonResult;

/**
 * @Description: TODO
 * @author: zsq
 * @date: 2022年04月19日 9:25
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException-----1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException-----2");
    }
}
