package com.enbuys.springboot.repository;

import com.enbuys.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Pace
 * @Data: 2019/10/29 14:49
 * @Version: v1.0
 */
// 只需继承JpaRepository即可
public interface UserRepository extends JpaRepository<User,Integer> {
}
