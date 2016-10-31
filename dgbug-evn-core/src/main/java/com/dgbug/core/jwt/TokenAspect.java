package com.dgbug.core.jwt;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.jose4j.jwt.JwtClaims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by tiger on 2016-10-31.
 */
@Aspect
public class TokenAspect {

    //利用spring注入request
    @Autowired
    private HttpServletRequest request;

    @Autowired
    @Qualifier("defaultTokenGenerate")
    private TokenGenerate tokenGenerate;

    //pjp参数由spring注入
    public Object execute(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        //获取当前正在执行的方法
        Method method = methodSignature.getMethod();
        //判断该方法是否被注解@Token标记
        if (method.isAnnotationPresent(Token.class)) {
            //执行token验证
            final String authHeader = request.getHeader("Authorization");
            if (authHeader == null || !authHeader.startsWith(TokenUtils.TOKEN_HEAD)) {
                throw new ServletException("在请求头Authorization中没有找到有效的JWT信息.");
            }

            final String token = authHeader;

            JwtClaims jwtClaims = tokenGenerate.valid(token);
            request.setAttribute("claims", jwtClaims);
        }

        //继续执行方法
        return proceedingJoinPoint.proceed();
    }
}
