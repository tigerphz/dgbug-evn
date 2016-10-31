package com.dgbug.domain;

import com.dgbug.model.User;
import com.dgbug.persist.IDaoRepository.IUserDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by tiger on 2016-10-29.
 */
@Service
public class UserDomain {

    @Autowired
    @Qualifier("userDaoRepositoryImpl")
    private IUserDaoRepository userDaoRepository;

    public User getUserById(Long id) {
        return userDaoRepository.getUserById(id);
    }
}
