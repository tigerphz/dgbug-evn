package com.dgbug.persist.IDaoRepository;

import com.dgbug.model.User;

/**
 * Created by tiger on 2016-10-29.
 */
public interface IUserDaoRepository {
    User getUserById(Long id);
}
