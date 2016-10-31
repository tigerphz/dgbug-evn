package com.dgbug.persist.DaoRepositoryImpl;

import com.dgbug.persist.DaoMapper.UserMapper;
import com.dgbug.persist.IDaoRepository.IUserDaoRepository;
import com.dgbug.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by tiger on 2016-10-29.
 */
@Repository("userDaoRepositoryImpl")
public class UserDaoRepositoryImpl implements IUserDaoRepository {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
