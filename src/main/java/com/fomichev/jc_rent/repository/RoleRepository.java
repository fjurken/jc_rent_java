package com.fomichev.jc_rent.repository;

import com.fomichev.jc_rent.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
