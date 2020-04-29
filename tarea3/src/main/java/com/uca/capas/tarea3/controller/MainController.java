package com.uca.capas.tarea3.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea3.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/ingresar")
	public String sendForm(Usuario usuario){
		return "ingresar";
	}
	
	@PostMapping("/validado")
	public ModelAndView verificar(@Valid @ModelAttribute Usuario usuario, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("novalido");
		}
		else {
			mav.setViewName("bueno");
			mav.addObject("usuario", usuario);
		}
		
		return mav;
	}

}
