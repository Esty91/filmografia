package com.springapp.filmografia.web;

import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springapp.filmografia.domain.Pelicula;
import com.springapp.filmografia.service.PeliculaManager;


@Controller
public class PeliculaController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private PeliculaManager peliculaManager;
	
	@RequestMapping(value = "/hello.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return new ModelAndView("hello");
	}
	
	@RequestMapping(value = "/informacionGeneral.htm")
	public ModelAndView handleRequest1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return new ModelAndView("informacionGeneral");
	}
	
	@RequestMapping(value = "/consultarDirectores.htm")
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return new ModelAndView("consultarDirectores");
	}
	
	@RequestMapping(value = "/peliculaPorDirector.htm", method = RequestMethod.POST)
	public ModelAndView handleRequest5(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, List<Pelicula>> myModel = new HashMap<String, List<Pelicula>>();
		String director = request.getParameter("director");
		int id= 0;
		String titulo = null;
		Date fecha = null;

		Pelicula oPelicula = new Pelicula(id, director, titulo, fecha);
		myModel.put("director", this.peliculaManager.buscarPeliculaPorDirector(oPelicula));
		return new ModelAndView("peliculaPorDirector", "model", myModel);
	}
}
