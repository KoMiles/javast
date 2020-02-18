package com.imooc.luckymoney.utils;

import com.imooc.luckymoney.domain.Result;

public class ResultUtils {


    /**
     * 返回成功
     * @param object
     * @return
     */
    public static Result success(Object object)
    {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    /**
     * 返回成功空数据，方法重载
     * @return
     */
    public static Result success()
    {
        return success(null);
    }


    /**
     * 返回失败
     * @param code
     * @param message
     * @return
     */
    public static Result error(Integer code, String message)
    {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
