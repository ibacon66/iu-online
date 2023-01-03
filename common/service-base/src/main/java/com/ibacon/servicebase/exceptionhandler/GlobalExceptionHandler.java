package com.ibacon.servicebase.exceptionhandler;

import com.ibacon.commonutils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxin
 * @Description 统一异常处理类
 * @createTime 2023年01月03日 10:09:00
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error().message("全局异常处理");
    }
}
