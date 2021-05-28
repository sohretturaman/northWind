package kodlama.io.hrmstrials.businnes.abstarcts;

import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    DataResult <List<Employee>> getAll ();
    List< Employee> getList ();
    Result add (Employee employee) ;
}
