package com.springapp.filmografia.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springapp.filmografia.domain.Pelicula;
import com.springapp.filmografia.repository.PeliculaDao;



@Component
public class PeliculaManagerImpl implements PeliculaManager{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PeliculaDao peliculaDao;
	
	public void setPeliculaDao(PeliculaDao empleadoDao) {
		this.peliculaDao = empleadoDao;
	}

	
	public List<Pelicula> buscarPeliculaPorDirector(Pelicula oPelicula) {
		
		return peliculaDao.buscarPeliculaPorDirector(oPelicula);
	}

	
	public List<Pelicula> mostrarPeliculas() {
		return peliculaDao.mostrarPeliculas();
	}


	public List<Pelicula> aniadirPelicula(Pelicula oPelicula) {
		
		return peliculaDao.aniadirPelicula(oPelicula);
	}
}
