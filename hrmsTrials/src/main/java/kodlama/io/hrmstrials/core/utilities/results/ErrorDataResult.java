package kodlama.io.hrmstrials.core.utilities.results;

public class ErrorDataResult <P>  extends DataResult <P>{

    public ErrorDataResult(P data) {
        super(  data,false);
    }

    public ErrorDataResult ( String message ){
        super ( null,false,message) ;

    }

    public ErrorDataResult (){
        super (null,false) ;
    }
}
