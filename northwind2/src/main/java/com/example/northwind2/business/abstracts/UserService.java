package com.example.northwind2.business.abstracts;

import com.example.northwind2.core.entities.User;
import com.example.northwind2.core.utilities.results.DataResult;
import com.example.northwind2.core.utilities.results.Result;

public interface UserService {
    Result add( User user);
    DataResult < User>  findByEmail( String email );
}
