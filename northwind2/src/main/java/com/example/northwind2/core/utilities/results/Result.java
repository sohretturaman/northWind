package com.example.northwind2.core.utilities.results;

public class Result {
    private boolean success ;
    private String message ;




    public Result ( boolean success) {
        this.success = success ;
    }

    public Result (boolean success,String message ){
        this( success) ;
        this.message = message ;
    }

    public boolean isSuccess (){ // boolean türnde olacağı için fonksiyon boolean
        return this.success ;
    }

    public String getMessage (){  // string türünde olacağı için fonksiyon string olur
        return this.message ;
    }
}
