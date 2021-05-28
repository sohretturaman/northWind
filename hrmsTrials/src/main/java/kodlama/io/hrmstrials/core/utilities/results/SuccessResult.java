package kodlama.io.hrmstrials.core.utilities.results;

public class SuccessResult extends Result{

    public SuccessResult() {      // boolean success i burada parametre içinde vermedsen de oluyor o zaten superin parametrelerinde var
        super(true );     // burda  işimizi kolaylaştırmak için  direk   constructor a değer verip boolean ı true giriyoruz
    }

    public SuccessResult(String message){  // burda mesajın ne lduğunu yazmıyoruz. o iş katmanlarında olur . core her projede  kullanılabilir olmalıdır  ama yazadığımızda da sistem hata vermiyor
        super( true ,message );        // iki tane  constructor var istediğini kullanabilirsin . süper için
    }
}
