package kodlama.io.hrmstrials.businnes.abstarcts;

import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    DataResult <List <Employer> > getAll ();
    Result add (Employer employer);
}
