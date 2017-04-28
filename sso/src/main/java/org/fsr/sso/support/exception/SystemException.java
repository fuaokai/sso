package org.fsr.sso.support.exception;

/**
 * 系统异常
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/23 18:24
 */
public class SystemException extends RuntimeException {

    public SystemException() {
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
