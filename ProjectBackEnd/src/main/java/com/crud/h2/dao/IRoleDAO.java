package com.crud.h2.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Role;

public interface IRoleDAO extends JpaRepository<Role, Integer> {
    Role findRoleByName(String name);
}