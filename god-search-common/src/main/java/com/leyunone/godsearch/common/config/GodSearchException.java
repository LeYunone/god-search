package com.leyunone.godsearch.common.config;

/**
 * :)
 *
 * @author LeYunone
 * @email 365627310@qq.com
 * @date 2023-07-17
 */
public class GodSearchException extends RuntimeException{

    static final long serialVersionUID = -7034897190745766939L;

    public GodSearchException() {
        super();
    }

    public GodSearchException(String message) {
        super(message);
    }

    public GodSearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public GodSearchException(Throwable cause) {
        super(cause);
    }

    protected GodSearchException(String message, Throwable cause,
                                 boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
