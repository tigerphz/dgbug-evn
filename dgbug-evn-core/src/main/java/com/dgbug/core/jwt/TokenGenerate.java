package com.dgbug.core.jwt;

import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.InvalidJwtException;

/**
 * Created by tiger on 2016-10-31.
 */
public interface TokenGenerate{
    //根据用户名来创建Token
    String create(String username);
    /*
    *验证Token
    *验证不和法的情况jose4j会抛出一个异常
    */
    JwtClaims valid(String token) throws InvalidJwtException;
}