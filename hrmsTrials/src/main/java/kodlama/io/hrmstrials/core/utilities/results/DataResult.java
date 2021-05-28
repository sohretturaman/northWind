package kodlama.io.hrmstrials.core.utilities.results;

public class DataResult <P>  extends Result{
    private  P data ;

    public DataResult ( P data,boolean success, String message ) {
        super (success,  message ) ;
        this.data = data;
    }

    public DataResult ( P data, boolean success ){
        super (success) ;
        this.data = data ;

    }

    public  P getData () {
        return this.data;
    }
}
