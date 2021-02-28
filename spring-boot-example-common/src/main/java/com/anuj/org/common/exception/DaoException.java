package com.anuj.org.common.exception;

public class DaoException  extends AndIsRunTimeException{

    private static final Long serialVersionUID = 1L;

    public DaoException(String message){
        super(message);
    }

    public DaoException(String massage, Throwable cause){
        super(massage, cause);
    }
}
