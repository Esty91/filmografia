package com.springapp.filmografia.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "pelicula")
public class Pelicula implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public Pelicula() {
		
	}
	public Pelicula(Integer id, String director, String titulo, Date fecha) {
		
		this.id = id;
		this.director = director;
		this.titulo = titulo;
		this.fecha = fecha;
	}
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String director;
	private String titulo;
	private Date fecha;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String toString() {
		return "Pelicula [id=" + id + ", director=" + director + ", titulo=" + titulo + ", fecha=" + fecha + "]";
	}
	
	
	
}
