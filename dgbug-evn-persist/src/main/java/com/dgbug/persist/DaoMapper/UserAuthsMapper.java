package com.dgbug.persist.DaoMapper;

import com.dgbug.model.UserAuths;

public interface UserAuthsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAuths record);

    int insertSelective(UserAuths record);

    UserAuths selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAuths record);

    int updateByPrimaryKey(UserAuths record);
}