package kodlama.io.hrmstrials.businnes.abstarcts;

import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {

    DataResult <List<JobPosition>> getAll ();
    Result Add (JobPosition jobPosition);




}
