package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Doctor;
import com.example.demo.repository.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	IDoctorRepo doctorRepo;
	
	@Override
	public void create(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.create(doctor);
	}

	@Override
	public Doctor read(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepo.read(id);
	}

	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.update(doctor);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepo.delete(id);
	}

}
