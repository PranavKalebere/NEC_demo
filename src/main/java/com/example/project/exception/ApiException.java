package com.example.project.exception;

public class ApiException extends RuntimeException
{
    private static final long serialVersionUID=1l;
    public ApiException(String message)
    {
        super(message);
    }
}
