package com.springapp.filmografia.web;

import java.io.IOException;

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


import com.springapp.filmografia.domain.UserAdmin;
import com.springapp.filmografia.service.UserAdminManager;


@Controller
public class UserAdminController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private UserAdminManager userAdminManager;
	
	@RequestMapping(value = "/login.htm")
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/userAdmin.htm", method = RequestMethod.POST)
	public ModelAndView handleRequest5(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, List<UserAdmin>> myModel = new HashMap<String, List<UserAdmin>>();
		String nombreUsuario = request.getParameter("nombreusuario");
		String clave = request.getParameter("clave");
		

		UserAdmin ouserAdmin = new UserAdmin(nombreUsuario, clave);
		myModel.put("nombreusuario", this.userAdminManager.identificarUsuario(ouserAdmin));
		myModel.put("clave", this.userAdminManager.identificarUsuario(ouserAdmin));
		return new ModelAndView("peliculaPorDirector", "model", myModel);
	}
}
