package com.springapp.filmografia.service;

import java.io.Serializable;
import java.util.List;

import com.springapp.filmografia.domain.Pelicula;

public interface PeliculaManager extends Serializable{

	public List<Pelicula> buscarPeliculaPorDirector(Pelicula oPelicula);
	public List<Pelicula> mostrarPeliculas();
	public List<Pelicula> aniadirPelicula(Pelicula oPelicula);
}
