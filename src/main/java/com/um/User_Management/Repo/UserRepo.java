package com.um.User_Management.Repo;

import com.um.User_Management.Model.UserManagement;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserManagement, Integer> {
}
