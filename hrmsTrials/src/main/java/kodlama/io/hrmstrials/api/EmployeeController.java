package kodlama.io.hrmstrials.api;

import kodlama.io.hrmstrials.businnes.abstarcts.EmployeeService;
import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")

public class EmployeeController {
    private EmployeeService employeeService ;

    @Autowired
  public EmployeeController (EmployeeService employeeService){
      this.employeeService = employeeService ;
  }

  @RequestMapping("/getall")
    DataResult<List<Employee>> getAll (){
        return this.employeeService.getAll();
    }

@RequestMapping("/getlist")
    List< Employee> getList (){
        return  this.employeeService.getList();
    }

    @PostMapping ("/add")
    Result add (Employee employee){
        return this.employeeService.add(employee);
    }
}
