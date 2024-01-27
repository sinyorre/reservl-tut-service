package com.example.demo.service;

import com.example.demo.service.abscrtaction.CacheService;
import org.springframework.stereotype.Service;

@Service("hazelcast")
public class HazelcastCache implements CacheService {
    @Override
    public void saveCache() {
        System.out.println("Hazelcast save cache");
    }

    @Override
    public void getCache() {
        System.out.println("Hazelcast get cache");
    }
}
