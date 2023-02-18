package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.to.CitaMedicaTo;

@RestController
@RequestMapping("/citas")
public class CitaMedicaControllerRestFull {

	
	@Autowired
	ICitaMedicaService citaMedicaService;
	
	@PostMapping
	public void agendar(@RequestBody CitaMedicaTo cita) {
		this.citaMedicaService.agendarCita(cita);
	}
	
	@PutMapping(path = "/{numero}", consumes = {
			MediaType.APPLICATION_JSON_VALUE
	})
	public void actualizar(@PathVariable("numero") Integer id,@RequestBody CitaMedicaTo cita) {
		
		
	}
}
