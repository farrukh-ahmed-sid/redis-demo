package com.example.redisdemo;

import redis.clients.jedis.Jedis;

public class RedisCachingDemoMain {


    public static void main(String args[]){
        //Connect to Redis server using localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection successful");
        //set string data in redis cache
        jedis.set("user", "Farrukh");
        //Retrieve the string value from the cache
        System.out.println("Stored data in cache: "+ jedis.get("user"));
    }
}
