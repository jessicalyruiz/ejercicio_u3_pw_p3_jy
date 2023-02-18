package com.example.demo.service;

import com.example.demo.modelo.Doctor;

public interface IDoctorService {

	public void  create(Doctor doctor);
	public Doctor read(Integer id);
	public void update(Doctor doctor);
	public void delete(Integer id);
}
