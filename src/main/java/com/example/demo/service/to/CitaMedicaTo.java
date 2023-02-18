package com.example.demo.service.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaMedicaTo {
	
	private String numeroCita;
	private LocalDateTime fechaCita;
	private BigDecimal valorCita;
	private String lugarCita;
	private String cedulaDoctor;
	private String cedulaPaciente;
	public String getNumeroCita() {
		return numeroCita;
	}
	public void setNumeroCita(String numeroCita) {
		this.numeroCita = numeroCita;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public BigDecimal getValorCita() {
		return valorCita;
	}
	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}
	public String getLugarCita() {
		return lugarCita;
	}
	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}
	public String getCedulaDoctor() {
		return cedulaDoctor;
	}
	public void setCedulaDoctor(String cedulaDoctor) {
		this.cedulaDoctor = cedulaDoctor;
	}
	public String getCedulaPaciente() {
		return cedulaPaciente;
	}
	public void setCedulaPaciente(String cedulaPaciente) {
		this.cedulaPaciente = cedulaPaciente;
	}
	
	
}
