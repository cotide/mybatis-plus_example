package com.example.db;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.db.entity.AdBanners;
import com.example.db.mapper.AdBannersMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;



@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.example.db.mapper")
public class MybatisPlusExampleApplication {

    public  static void main(String[] args) {
        SpringApplication.run(MybatisPlusExampleApplication.class, args);

    }

}
