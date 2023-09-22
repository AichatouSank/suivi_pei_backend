package com.dgsi.suivievaluationpei.service;

import com.dgsi.suivievaluationpei.model.Role;

import java.util.List;

public interface RoleService {
    Role addRole(Role role);
    List<Role> findAllRoles();
    Role updateRole(Role role);
    Boolean deleteRole(int id);
}
