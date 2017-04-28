package org.fsr.sso.support.exception;

/**
 * 业务异常
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/23 18:24
 */
public class BiException extends SystemException {
    public BiException() {
    }

    public BiException(String message) {
        super(message);
    }

    public BiException(String message, Throwable cause) {
        super(message, cause);
    }
}
