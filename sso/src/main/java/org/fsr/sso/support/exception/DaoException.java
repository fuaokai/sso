package org.fsr.sso.support.exception;

/**
 * 数据访问异常
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/3 22:40
 */
public class DaoException extends SystemException {

    public DaoException() {
    }

    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Throwable e) {
        super(message, e);
    }
}
