package com.example.northwind2.core.dataAccess;

import com.example.northwind2.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
  User  findByEmail (String email);
}
