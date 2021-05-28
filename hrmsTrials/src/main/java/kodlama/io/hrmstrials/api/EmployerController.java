package kodlama.io.hrmstrials.api;


import kodlama.io.hrmstrials.businnes.abstarcts.EmployerService;
import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (name ="/api/employers")

public class EmployerController {

  private EmployerService employerService ;

  @Autowired
  public EmployerController (EmployerService employerService){
      this.employerService = employerService ;
  }

  @GetMapping ( name ="/getall")
    DataResult<List<Employer>> getAll (){
       return  employerService.getAll();
    }

    @PostMapping("/add")
    Result add ( @RequestBody Employer employer){
      return this.employerService.add (employer);
    }
}
