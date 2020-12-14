package com.springapp.filmografia.service;

import java.io.Serializable;
import java.util.List;

import com.springapp.filmografia.domain.UserAdmin;

public interface UserAdminManager extends Serializable {

	public List<UserAdmin> identificarUsuario(UserAdmin oUserAdmin);
}
