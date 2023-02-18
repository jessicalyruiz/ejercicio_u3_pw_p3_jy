package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void create(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public CitaMedica read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public void update(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public CitaMedica buscarNumeroCita(String numeroCita) {
		TypedQuery<CitaMedica> myQuery = this.entityManager
				.createQuery("Select c from CitaMedica c where c.numeroCita=:valor", CitaMedica.class);
		myQuery.setParameter("valor", numeroCita);
		return myQuery.getSingleResult();
	
	}

}
