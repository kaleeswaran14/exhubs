package com.bigcay.exhubs.service;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.springframework.data.domain.Page;

import com.bigcay.exhubs.common.ValidationResult;
import com.bigcay.exhubs.form.GroupFormBean;
import com.bigcay.exhubs.model.Group;
import com.bigcay.exhubs.model.Role;
import com.bigcay.exhubs.model.User;

public interface AuthorityService {

	User findUserById(Integer id);
	
	User findUserByUserId(String userId);

	Page<User> findPageableUsers(Integer pageNumber);

	Role findRoleById(Integer id);

	List<Role> findAllRoles();

	Group findGroupById(Integer id);
	
	Group findGroupByName(String name);

	List<Group> findAllGroups();

	Set<Role> findRolesByGroupId(Integer groupId);

	User persist(User user);
	
	Group persist(Group group);

	boolean updateUserActiveFlag(Integer updateId, boolean activeFlag);
	
	ValidationResult validateBeforeDeleteGroup(Integer groupId, Locale locale);
	
	void deleteGroup(Integer groupId);
	
	Group saveNewGroup(GroupFormBean groupFormBean);
}
