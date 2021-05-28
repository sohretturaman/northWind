package kodlama.io.hrmstrials.businnes.concretes;

import kodlama.io.hrmstrials.businnes.abstarcts.UserService;
import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.core.utilities.results.SuccessDataResult;
import kodlama.io.hrmstrials.core.utilities.results.SuccessResult;
import kodlama.io.hrmstrials.dataAccess.abstracts.UserDao;
import kodlama.io.hrmstrials.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public DataResult<List<User>> getAll() {
        return  new SuccessDataResult <List<User>>( this.userDao.findAll(),  " Tüm kullanıcılar başarıyla listelendi ");

    }

    @Override
    public Result add(User user) {
        return new SuccessResult( " Bu kullanıcı hrms sistemine eklendi");
    }
}
//  public List<Users> getAll() {
//    return this.userDao.findAll();