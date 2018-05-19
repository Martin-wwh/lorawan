package com.example.lorawan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void test(){
        ///stringRedisTemplate.opsForValue().set("aaa","eee");
        String devaddr="BBBBBBB7";

       if(stringRedisTemplate.opsForList().leftPop(devaddr)!=null) System.out.println("具体内容："+stringRedisTemplate.opsForList().leftPop(devaddr));
    }
}
