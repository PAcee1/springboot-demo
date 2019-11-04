package com.enbuys.springboot.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;

@Configuration
public class MyRedisConfig {

    @Bean
    public RedisTemplate<Object, Object> myRedisTemplate(
            RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        //开启默认类型
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    /**
     * 在Redis自动配置类中@ConditionalOnMissingBean(name = "redisTemplate") 如果没有名字叫RedisTemplate的才生效
     * 因为我们向容器中注入的组件就为redisTemplate，所以不需要配置RedisCacheManager便可自动使用
     * 如果名字叫其他的，便需要配置我们的myRedisCacheManager，这样在使用时才会使用我们配置的RedisTemplate
     *
     */
    @Primary // 如果有多个cacheManager，可以使用这个注解标志默认使用这个类为缓存管理器
    @Bean
    public RedisCacheManager myRedisCacheManager(RedisTemplate<Object, Object> myRedisTemplate){
        RedisCacheManager cacheManager = new RedisCacheManager(myRedisTemplate);
        cacheManager.setUsePrefix(true);
        return cacheManager;
    }
}
