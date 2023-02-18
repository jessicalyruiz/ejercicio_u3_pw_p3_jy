package com.example.demo.service;

import java.time.LocalDateTime;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.service.to.CitaMedicaTo;

public interface ICitaMedicaService {

	public void  create(CitaMedica citaMedica);
	public CitaMedica read(Integer id);
	public void update(CitaMedica citaMedica);
	public void delete(Integer id);
	public void agendarCita(CitaMedicaTo citaTo);
	public CitaMedica buscarNumeroCita(String numeroCita);
	
	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaProxCita);
}
