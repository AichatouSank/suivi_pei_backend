package com.dgsi.suivievaluationpei.service.implementation;

import com.dgsi.suivievaluationpei.model.Role;
import com.dgsi.suivievaluationpei.repository.RoleRepository;
import com.dgsi.suivievaluationpei.service.RoleService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Boolean deleteRole(int id) {
        return null;
    }
}
