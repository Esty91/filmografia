package com.springapp.filmografia.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "useradmin")
public class UserAdmin implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	public UserAdmin(String nombreUsuario, String clave) {
	
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
	}

	@Id
	@Column(name = "nombreusuario")
	private String nombreUsuario;
	
	private String clave;


	public String getnombreUsuario() {
		return nombreUsuario;
	}

	public void setnombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getclave() {
		return clave;
	}

	public void setclave(String clave) {
		this.clave = clave;
	}

	
	public String toString() {
		return "UserAdmin [nombreUsuario=" + nombreUsuario + ", clave=" + clave + "]";
	}

	
	
	
	
}
