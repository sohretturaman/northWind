package kodlama.io.hrmstrials.businnes.concretes;

import kodlama.io.hrmstrials.businnes.abstarcts.EmployeeService;
import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.core.utilities.results.SuccessDataResult;
import kodlama.io.hrmstrials.core.utilities.results.SuccessResult;
import kodlama.io.hrmstrials.dataAccess.abstracts.EmployeeDao;
import kodlama.io.hrmstrials.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao ;

@Autowired
    public EmployeeManager (EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }


    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult< List<Employee>>(this.employeeDao.findAll(),"iş arayanlar listlendi ");
    }

    @Override
    public List<Employee> getList() {
        return this.employeeDao.findAll();
    }

    @Override
    public Result add(Employee employee) {
        return new SuccessResult(" iş arayan eklendi");
    }
}
