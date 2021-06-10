package com.example.northwind2.core.utilities.results;

public class ErrorResult extends Result{

    public ErrorResult(boolean success) {
        super( false);
    }

    public ErrorResult ( String message){
        super(false,message) ;   // mesajın ne olduğu businnes katmanında yazılıyor
    }
}
