package com.dgbug.core.jwt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by tiger on 2016-10-31.
 */

/*
*Target指定注解的目标为方法级
*Retention指定注解可以在运行时被获取（利用反射）
*/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Token {

}
