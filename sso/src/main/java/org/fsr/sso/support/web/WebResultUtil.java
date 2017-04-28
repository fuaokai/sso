package org.fsr.sso.support.web;

import com.google.gson.Gson;

/**
 * Created with WebResult
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/25 16:03
 */
public class WebResultUtil {

    public static String toJSON(){
        return toJSON(SUCCESS, null, null);
    }

    /**
     * 将对象转换为json对象
     * @param result 需要被转换对象
     * @return json
     */
    public static String toJSON(Object result){
        return toJSON(SUCCESS, null, result);
    }

    /**
     * 将对象转换为json对象
     * @param code  响应码
     * @param result 需要被转换对象
     * @return json
     */
    public static String toJSON(String code, Object result){
        return toJSON(SUCCESS, null, result);
    }

    /**
     * 将对象转换为json对象
     * @param code  响应码
     * @param message 响应消息
     * @param result 需要被转换对象
     * @return json
     */
    public static String toJSON(String code, String message, Object result){
        return new Gson().toJson(new Result(code, message, result));
    }

    private static class Result {
        private String code;
        private String message;
        private Object result;

        public Result(String code, Object result) {
            this.code = code;
            this.result = result;
        }

        public Result(String code, String message, Object result) {
            this.code = code;
            this.message = message;
            this.result = result;
        }

        public String toJSON(){
            return new Gson().toJson(this);
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Object getResult() {
            return result;
        }

        public void setResult(Object result) {
            this.result = result;
        }

    }

    public static final String SUCCESS = "0";
    public static final String FAIL = "1";
}
