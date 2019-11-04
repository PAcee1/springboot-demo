package com.enbuys.es.repository;

import com.enbuys.es.bean.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UserRepository extends ElasticsearchRepository<User,Integer> {

    public List<User> getUserByName(String name);
}
