package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.repository.ICitaMedicaRepo;
import com.example.demo.service.to.CitaMedicaTo;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	ICitaMedicaRepo citaRepo;
	
	
	@Override
	public void create(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaRepo.create(citaMedica);
	}

	@Override
	public CitaMedica read(Integer id) {
		// TODO Auto-generated method stub
		return this.citaRepo.read(id);
	}

	@Override
	public void update(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaRepo.update(citaMedica);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.citaRepo.delete(id);
	}

	@Override
	public void agendarCita(CitaMedicaTo citaTo) {
		// TODO Auto-generated method stub
		Doctor doc=new Doctor();
		doc.setCedula(citaTo.getCedulaDoctor());
		
		Paciente paciente=new Paciente();
		paciente.setCedula(citaTo.getCedulaPaciente());
		
		CitaMedica cita=new CitaMedica();
		cita.setDoctor(doc);
		cita.setFechaCita(citaTo.getFechaCita());
		cita.setValorCita(citaTo.getValorCita());
		cita.setNumeroCita(citaTo.getNumeroCita());
		cita.setLugarCita(citaTo.getLugarCita());
		this.create(cita);
	}

	@Override
	public CitaMedica buscarNumeroCita(String numeroCita) {
		// TODO Auto-generated method stub
		return this.citaRepo.buscarNumeroCita(numeroCita);
	}

	@Override
	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaProxCita) {
		// TODO Auto-generated method stub
		CitaMedica citaAntigua=this.buscarNumeroCita(numeroCita);
		citaAntigua.setDiagnostico(diagnostico);
		citaAntigua.setReceta(receta);
		citaAntigua.setFechaProxCita(fechaProxCita);
	}




}
