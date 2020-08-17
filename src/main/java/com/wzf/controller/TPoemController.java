package com.wzf.controller;

import com.wzf.entity.TPoem;
import com.wzf.service.TPoemService;
import org.apache.ibatis.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Set;

/**
 * (TPoem)表控制层
 *
 * @author makejava
 * @since 2020-08-16 12:33:38
 */
@RestController
@RequestMapping("tPoem")
public class TPoemController {
    /**
     * 服务对象
     */
    @Resource
    private TPoemService tPoemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TPoem selectOne(String id) {
        return this.tPoemService.queryById(id);
    }

    @Autowired
    private RedisTemplate redisTemplate;

    public void test() {
˚

    }

}