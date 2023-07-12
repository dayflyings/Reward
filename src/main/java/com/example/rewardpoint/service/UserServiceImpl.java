package com.example.rewardpoint.service;

import com.example.rewardpoint.dao.UserDAO;
import com.example.rewardpoint.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDAO userDAO;

    /**
     * Find user based on its id
     * @param id userId
     * @return UserEntity of current user
     */
    @Override
    public UserEntity findUserById(Long id) {
        UserEntity user = userDAO.findById(id).orElse(null);
        return user;
    }
}
