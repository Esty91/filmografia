package com.springapp.filmografia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springapp.filmografia.domain.UserAdmin;

import com.springapp.filmografia.repository.UserAdminDao;

@Component
public class UserAdminManagerImpl implements UserAdminManager {

	private static final long serialVersionUID = 1L;

	@Autowired
	private UserAdminDao userAdminDao;

	public void setUserAdminDao(UserAdminDao userAdminDao) {
		this.userAdminDao = userAdminDao;
	}

	public List<UserAdmin> identificarUsuario(UserAdmin oUserAdmin) {
		return userAdminDao.identificarUsuario(oUserAdmin);
	}
}
