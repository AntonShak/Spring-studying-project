package com.shakov.spring.database.repository;

import com.shakov.spring.database.entity.Role;
import com.shakov.spring.database.entity.User;
import com.shakov.spring.dto.PersonalInfo;
import com.shakov.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter filter);

    List<PersonalInfo> findAllByCompanyIdAndRole(Integer companyId, Role role);

    void updateCompanyAndRole(List<User> users);

    void updateCompanyAndRoleNamed(List<User> users);
}
