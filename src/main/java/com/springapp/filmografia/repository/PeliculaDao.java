package com.springapp.filmografia.repository;

import java.util.List;

import com.springapp.filmografia.domain.Pelicula;

public interface PeliculaDao {

	public List<Pelicula> buscarPeliculaPorDirector(Pelicula oPelicula);
	public List<Pelicula> mostrarPeliculas();
	public List<Pelicula> aniadirPelicula(Pelicula oPelicula);
}
