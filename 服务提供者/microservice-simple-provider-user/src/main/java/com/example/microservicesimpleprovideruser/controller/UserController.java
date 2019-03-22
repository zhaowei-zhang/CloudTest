package com.example.microservicesimpleprovideruser.controller;

import com.example.microservicesimpleprovideruser.dao.UserRepository;
import com.example.microservicesimpleprovideruser.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: x.x@hand-china.com
 * @date: 2019/2/21
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne;
        findOne = this.userRepository.findOne(id);

        return findOne;
    }
}
