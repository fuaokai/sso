package org.fsr.sso.support.exception;

/**
 * 数据处理异常
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/23 18:23
 */
public class DpoException extends SystemException  {
    public DpoException() {
    }

    public DpoException(String message) {
        super(message);
    }

    public DpoException(String message, Throwable cause) {
        super(message, cause);
    }
}
