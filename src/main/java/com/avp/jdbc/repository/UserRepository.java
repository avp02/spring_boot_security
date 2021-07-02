package com.avp.jdbc.repository;

import com.avp.jdbc.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername (String name);

    List<User> findByIdIsGreaterThan(Long id);
}
