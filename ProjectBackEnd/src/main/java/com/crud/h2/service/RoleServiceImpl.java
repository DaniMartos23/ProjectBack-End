package com.crud.h2.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.crud.h2.dao.IRoleDAO;
import com.crud.h2.dto.Role;

public class RoleServiceImpl implements IRoleService {

	@Autowired
    private IRoleDAO roleDao;
	@Override
    public Role findByName(String name) {
        Role role = roleDao.findRoleByName(name);
        return role;
    }
	@Override
	public Role saveRole(Role role) {
		return roleDao.save(role);
	}
	@Override
	public Role searchRoleXID(Integer id) {
		return roleDao.findById(id).get();
	}



}
