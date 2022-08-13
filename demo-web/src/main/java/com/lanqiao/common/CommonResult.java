package com.lanqiao.common;

/**
 * 通用的返回结果
 * 统一了回复数据的标准
 */
public class CommonResult {
    private Boolean success;
    private String message;
    private Object data;

    public CommonResult() {
    }
    public CommonResult(Boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功情况
     * @return
     */
    public static CommonResult  success(String message,Object data){
        return new CommonResult(true,message,data);
    }
    public static CommonResult  success(String message){
        return new CommonResult(true,message,null);
    }

    /**
     * 失败情况
     * @return
     */
    public static CommonResult failure(String message,Object data){
        return new CommonResult(false,message,data);
    }
    public static CommonResult failure(String message){
        return new CommonResult(false,message,null);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
