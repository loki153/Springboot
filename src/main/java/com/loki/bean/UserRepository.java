package com.loki.bean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Author: Loki
 * @Date: 2019/8/13 20:31
 * @Project: Springboot
 * @Description:
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select t from user t where t.name = :name")
    User findByUserName(String name);
}
