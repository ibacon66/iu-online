package com.ibacon.servicebase.exceptionhandler;

import com.ibacon.commonutils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxin
 * @Description 统一异常处理
 * @createTime 2023年01月03日 10:09:00
 */

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 全局异常处理
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        log.error(e.getMessage());
        e.printStackTrace();
        return R.error().message("全局异常处理");
    }

    /**
     * 特定异常处理
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e){
        log.error(e.getMessage());
        e.printStackTrace();
        return R.error().message("执行了ArithmeticException异常处理");
    }

    /**
     * 自定义异常处理
     */
    @ExceptionHandler(IuException.class)
    @ResponseBody
    public R error(IuException e){
        //输出错误日志到文件
        log.error(e.getMessage());
        e.printStackTrace();
        return R.error().code(e.getCode()).message(e.getMsg());
    }
}
