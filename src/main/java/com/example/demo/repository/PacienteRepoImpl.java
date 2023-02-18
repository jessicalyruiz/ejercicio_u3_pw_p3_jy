package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Paciente;
import com.example.demo.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{

	
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void create(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void update(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public Paciente buscarCedula(String cedula) {
		TypedQuery<Paciente> myQuery = this.entityManager
				.createQuery("Select c from Paciente c where c.cedula=:valor", Paciente.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}
	
	
}
