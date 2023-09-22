package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Role;
import com.dgsi.suivievaluationpei.repository.RoleRepository;
import com.dgsi.suivievaluationpei.service.RoleService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;
    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> findAllRoles() {
        return null;
    }

    @Override
    public Role updateRole(Role role) {
        return null;
    }

    @Override
    public Boolean deleteRole(int id) {
        return null;
    }
}
