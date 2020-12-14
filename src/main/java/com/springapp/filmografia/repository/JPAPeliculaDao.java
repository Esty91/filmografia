package com.springapp.filmografia.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.filmografia.domain.Pelicula;

@Repository(value = "peliculaDao")
public class JPAPeliculaDao implements PeliculaDao{

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
	public List<Pelicula> mostrarPeliculas() {
		return em.createQuery("select p from Pelicula p order by p.id").getResultList();
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Pelicula> buscarPeliculaPorDirector(Pelicula oPelicula) {
		String director = oPelicula.getDirector();
		return em.createQuery("select p from Pelicula p where director = '" + director + "'").getResultList();
	}
 //select u from Useradmin u where nombreusuario ='" + nombre + "'" + "' and clave = '" + clave

	


	public List<Pelicula> aniadirPelicula(Pelicula oPelicula) {
		// TODO Auto-generated method stub
		return null;
	}
}
