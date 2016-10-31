package com.dgbug.core.jwt;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Sha2Crypt;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.lang.JoseException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tiger on 2016-10-31.
 */
@Component("defaultTokenGenerate")
public class DefaultTokenGenerate implements TokenGenerate {

    //利用spring注入request
    @Autowired
    private HttpServletRequest request;

    public String create(String username) {
        String token = null;
        try {
            //此处用到了apache commons codec的依赖
            //subject参数 此处使用了登陆者的ip地址，从而避免Token被盗用请求
            token = TokenUtils.create(Sha2Crypt.sha256Crypt(username.getBytes()),
                    TokenUtils.ISSUED,
                    DigestUtils.md5Hex(username.getBytes()),
                    request.getRemoteAddr(),
                    30, 2);
        /*
        *注意：此处省略了存储进Redis的过程 键值对分别为 Token:username
        */
        } catch (JoseException e) {
            e.printStackTrace();
        }
        return token;
    }

    public JwtClaims valid(String token) throws InvalidJwtException {
        /*
        *注意：此处省略了从Redis中验证Token的存在以及根据Token取出username的过程
        */
        String username = "";

        return TokenUtils.valid(token, TokenUtils.ISSUED, username, request.getRemoteAddr());
    }
}
