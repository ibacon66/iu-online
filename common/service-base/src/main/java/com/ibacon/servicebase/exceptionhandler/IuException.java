package com.ibacon.servicebase.exceptionhandler;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangxin
 * @Description 自定义异常
 * @createTime 2023年01月03日 20:40:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IuException extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code; //状态码

    private String msg; //异常信息

}
