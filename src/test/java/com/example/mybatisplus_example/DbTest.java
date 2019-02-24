package com.example.mybatisplus_example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.db.MybatisPlusExampleApplication;
import com.example.db.entity.AdBanners;
import com.example.db.mapper.AdBannersMapper;
import com.example.db.service.IAdBannersService;
import com.example.mybatisplus_example.base.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

public class DbTest  extends BaseTest {


    @Autowired
    private IAdBannersService adBannersService;


    @Test
    public void selectList() {


       List<AdBanners> adBanners =  adBannersService.lambdaQuery().list();
       for (AdBanners item : adBanners)
       {
           System.out.println(item);
       }
       System.out.println(adBanners.size());
    }

}
