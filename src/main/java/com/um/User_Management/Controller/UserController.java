package com.um.User_Management.Controller;

import com.um.User_Management.Model.UserManagement;
import com.um.User_Management.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    // addUser , getUser/{userid}, getAllUser  ,updateUserInfo  , deleteUser

    @PostMapping("addUsers")
    public String addUsers(@RequestBody @Valid List<UserManagement> newUsers) {
        return userService.addUsers(newUsers);
    }

    @PostMapping("user")
    public  String add(@RequestBody @Valid UserManagement user){
        return  userService.add(user);
    }

    @GetMapping("Users/id/{id}")
    public Optional<UserManagement> getUserById(@PathVariable Integer id){
        return  userService.getUserById(id);
    }

    @GetMapping("getAllUsers")
    public List<UserManagement> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("update/id/{id}")
    public String update(@PathVariable  Integer id, @RequestParam  Long phoneNumber) {
        return userService.update(id, phoneNumber);
    }


    @DeleteMapping("user/id")
    public String removeUserByIds(@RequestBody List<Integer>  userId) {
        return userService.removeUserByIds(userId);
    }

}

