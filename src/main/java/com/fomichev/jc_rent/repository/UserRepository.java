package com.fomichev.jc_rent.repository;

import com.fomichev.jc_rent.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
