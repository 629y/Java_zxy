package cn.zxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication



@MapperScan(basePackages = "cn.zxy.mapper")
public class StudentProApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentProApplication.class, args);
    }

}
