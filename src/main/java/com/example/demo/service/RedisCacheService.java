package com.example.demo.service;

import com.example.demo.service.abscrtaction.CacheService;
import org.springframework.stereotype.Service;

@Service("redis")
public class RedisCacheService implements CacheService {
    @Override
    public void saveCache() {
        System.out.println("Redis save cache");
    }

    @Override
    public void getCache() {
        System.out.println("Redis get cache");
    }
}
