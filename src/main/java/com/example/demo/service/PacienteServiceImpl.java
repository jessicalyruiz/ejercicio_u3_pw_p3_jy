package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Paciente;
import com.example.demo.repository.IPacienteRepo;
import com.example.demo.service.to.PacienteTo;

@Service
public class PacienteServiceImpl implements IPacienteService {

	
	@Autowired
	IPacienteRepo pacienteRepo;
	@Override
	public void create(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.create(paciente);
	}

	@Override
	public Paciente read(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.read(id);
	}

	@Override
	public void update(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.update(paciente);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepo.delete(id);
	}

	@Override
	public Paciente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscarCedula(cedula);
	}

	
	
	private PacienteTo convertir(Paciente paciente) {
		PacienteTo pacienteTo= new PacienteTo();
		pacienteTo.setApellido(paciente.getApellido());
		pacienteTo.setCedula(paciente.getCedula());
		pacienteTo.setFechaNacimiento(paciente.getFechaNacimiento());
		pacienteTo.setNombre(paciente.getNombre());
		return pacienteTo;
	}
}
