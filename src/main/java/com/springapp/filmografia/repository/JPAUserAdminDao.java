package com.springapp.filmografia.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.filmografia.domain.UserAdmin;

@Repository(value = "userAdminDao")
public class JPAUserAdminDao implements UserAdminDao{

	private EntityManager em = null;

	/*
	 * Sets the entity manager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<UserAdmin> identificarUsuario(UserAdmin oUserAdmin) {
		String nombre = oUserAdmin.getnombreUsuario();
		String clave = oUserAdmin.getclave();
		return em.createQuery("select u from Useradmin u where nombreusuario ='" + nombre + "'" + "' and clave = '" + clave
				+ "'").getResultList();
	}

	
}
