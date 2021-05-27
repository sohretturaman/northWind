package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T>extends DataResult<T> {

    public SuccessDataResult(T data, String message) {
        super(data, true , message);
    }


    public SuccessDataResult(T data,boolean success){
        super(data,true);

    }

    public SuccessDataResult(T data){   // farklı alternatifler oluşturup constructor ları buna göre dizayn et faakt süper in parametrelerine değer vermen gerekiyor. null verebilirsin
        super(data,true);

    }

    public SuccessDataResult( String message) {
        super(null, true , message);
    }

    public SuccessDataResult() {
        super(null, true);
    }

}
