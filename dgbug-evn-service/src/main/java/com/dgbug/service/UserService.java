package com.dgbug.service;

import com.dgbug.domain.UserDomain;
import com.dgbug.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tiger on 2016-10-31.
 */
@Service
public class UserService {

    @Autowired
    private UserDomain userDomain;

    public User getUserById(Long id) {
        return userDomain.getUserById(id);
    }
}
