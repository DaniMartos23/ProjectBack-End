package com.crud.h2.service;


import com.crud.h2.dto.Role;

public interface IRoleService {
	Role findByName(String name);
	Role saveRole(Role role);
	Role searchRoleXID(Integer id);
}
