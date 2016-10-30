package com.dgbug.domain;

import com.dgbug.persist.IDaoRepository.IUserDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tiger on 2016-10-29.
 */
public class UserDomain {

    @Autowired
    private IUserDaoRepository userDaoRepository;

    
}
