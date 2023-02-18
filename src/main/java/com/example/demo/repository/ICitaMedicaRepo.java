package com.example.demo.repository;

import com.example.demo.modelo.CitaMedica;

public interface ICitaMedicaRepo {
	
	public void  create(CitaMedica citaMedica);
	public CitaMedica read(Integer id);
	public void update(CitaMedica citaMedica);
	public void delete(Integer id);
	public CitaMedica buscarNumeroCita(String numeroCita);
}
