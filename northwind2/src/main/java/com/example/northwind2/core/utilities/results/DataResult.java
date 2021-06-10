package com.example.northwind2.core.utilities.results;

public class DataResult <T>extends Result{
    private T data ;
    public DataResult (T data,boolean success){  // yeni constructorlar oluşturup success ve error dataResult larda import ediyoruz
        super( success) ;                   // super i üstte yazman gerek hata veriyor
        this.data = data ;

    }

    public DataResult( T data, boolean success, String message) {
        super(success ,message);
        this.data = data ;
    }

    public T getData (){  // T türünde fonksiyon veri tipi de T dir
        return this.data ;
    }
}
