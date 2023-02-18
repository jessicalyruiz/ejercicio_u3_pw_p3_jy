package com.example.demo.repository;

import com.example.demo.modelo.Doctor;

public interface IDoctorRepo {

	public void  create(Doctor doctor);
	public Doctor read(Integer id);
	public void update(Doctor doctor);
	public void delete(Integer id);
}
