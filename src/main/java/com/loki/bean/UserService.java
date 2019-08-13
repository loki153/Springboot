package com.loki.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Loki
 * @Date: 2019/8/13 20:34
 * @Project: Springboot
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByName(String name){
        User user = null;

        try{
            user = userRepository.findByUserName(name);

        }catch (Exception e){}
        return user;
    }
}
