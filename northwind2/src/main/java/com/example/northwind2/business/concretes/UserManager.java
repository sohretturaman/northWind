package com.example.northwind2.business.concretes;

import com.example.northwind2.business.abstracts.UserService;
import com.example.northwind2.core.dataAccess.UserDao;
import com.example.northwind2.core.entities.User;
import com.example.northwind2.core.utilities.results.DataResult;
import com.example.northwind2.core.utilities.results.Result;
import com.example.northwind2.core.utilities.results.SuccessDataResult;
import com.example.northwind2.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userdao ;

    @Autowired
    public UserManager(UserDao userdao) {
        this.userdao = userdao;
    }


    @Override
    public Result add(User user) {
        this.userdao.save(user);
        return new SuccessResult("kullanıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userdao.findByEmail(email),"kullanıcı e mail ile getrildi  " );
    }
}
