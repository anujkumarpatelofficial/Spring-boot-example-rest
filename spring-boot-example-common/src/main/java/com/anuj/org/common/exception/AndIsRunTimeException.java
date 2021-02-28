package com.anuj.org.common.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public class AndIsRunTimeException extends RuntimeException{

    private static final Long serialVersionUID = 1L;

    private Map<ExceptionProperty, String>  properties = new EnumMap<ExceptionProperty, String>(ExceptionProperty.class);

    public AndIsRunTimeException(){
        super();
    }

    public AndIsRunTimeException(String message){
        super(message);
    }

    public AndIsRunTimeException(Throwable cause){
        super(cause);
    }

    public AndIsRunTimeException(String message, Throwable cause){
        super(message, cause);
    }

    public String getProperty(ExceptionProperty key){
        return properties.get(key);
    }

    public void setProperty(ExceptionProperty key, String value){
        properties.put(key, value);
    }

    public Map<ExceptionProperty, String> getProperties(){
        return Collections.unmodifiableMap(properties);
    }


    @Override
    public void printStackTrace(PrintStream s) {
        s.println("**************************");
        for (Map.Entry<ExceptionProperty, String> entry: properties.entrySet()){
            s.println(entry.getKey() +"="+ entry.getValue());
        }
        s.println("**************************");
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        s.println("**************************");
        for (Map.Entry<ExceptionProperty, String> entry: properties.entrySet()){
            s.println(entry.getKey() +"="+ entry.getValue());
        }
        s.println("**************************");
        super.printStackTrace();
    }
}
