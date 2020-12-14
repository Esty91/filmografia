package com.springapp.filmografia.repository;

import java.util.List;

import com.springapp.filmografia.domain.UserAdmin;

public interface UserAdminDao {

	public List<UserAdmin> identificarUsuario(UserAdmin oUserAdmin);
	
}
