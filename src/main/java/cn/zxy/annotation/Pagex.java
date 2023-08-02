package cn.zxy.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//当成注解来应用
public @interface Pagex {
}
