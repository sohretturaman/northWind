package kodlama.io.hrmstrials.businnes.concretes;


import kodlama.io.hrmstrials.businnes.abstarcts.JobPositionService;
import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.core.utilities.results.SuccessDataResult;
import kodlama.io.hrmstrials.core.utilities.results.SuccessResult;
import kodlama.io.hrmstrials.dataAccess.abstracts.JobPositionDao;
import kodlama.io.hrmstrials.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao ;

    @Autowired
    public JobPositionManager (JobPositionDao jobPositionDao){
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult< List<JobPosition>>(this.jobPositionDao.findAll(),"iş pozisyonları başarıyla listelendi ");
    }

    @Override
    public Result Add(JobPosition jobPosition) {
        return new SuccessResult("  iş pozisyonu başarıyla eklendi ");
    }
}
