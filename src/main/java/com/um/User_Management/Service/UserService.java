package com.um.User_Management.Service;


import com.um.User_Management.Model.UserManagement;
import com.um.User_Management.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String addUsers(List<UserManagement> newUsers) {
        userRepo.saveAll(newUsers);
        return "added successfully";
    }

    public String add(UserManagement user) {
        userRepo.save(user);
        return  "User Added Successfully !!";
    }

    public Optional<UserManagement> getUserById(Integer id) {
        return  userRepo.findById(id);
    }


    public  List<UserManagement> getAllUsers() {
        return (List<UserManagement>) userRepo.findAll();
    }

    public String update(Integer id, Long phoneNumber) {
        UserManagement UserUpdate = userRepo.findById(id).orElse(null);
        if (UserUpdate != null) {
            UserUpdate.setPhoneNumber(phoneNumber);
            userRepo.save(UserUpdate);
            return "Wohoo!! User updated successfully";
        }
        return "User not found !!";
    }

    public String removeUserByIds(List<Integer> userId) {
        userRepo.deleteAllById(userId);
        return "User Deleted Successfully !!";
    }

}
