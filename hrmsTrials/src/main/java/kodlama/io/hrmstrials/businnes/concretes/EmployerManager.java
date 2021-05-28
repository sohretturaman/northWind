package kodlama.io.hrmstrials.businnes.concretes;

import kodlama.io.hrmstrials.businnes.abstarcts.EmployerService;
import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.core.utilities.results.SuccessDataResult;
import kodlama.io.hrmstrials.core.utilities.results.SuccessResult;
import kodlama.io.hrmstrials.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrmstrials.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao ;

    @Autowired
    public EmployerManager (EmployerDao employerDao){
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult< List<Employer> >( this.employerDao.findAll(),"iş verenler başarıyla listelendi");
    }

    @Override
    public Result add(Employer employer) {
        return new SuccessResult( " iş verenin  kaydı yapıldı ");
    }
}
