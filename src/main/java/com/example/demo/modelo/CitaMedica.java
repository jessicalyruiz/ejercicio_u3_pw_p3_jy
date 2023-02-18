package com.example.demo.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cita_medica")
public class CitaMedica implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@Column(name = "cime_id")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cita")
		@SequenceGenerator(name = "seq_cita", sequenceName = "seq_cita", allocationSize = 1)
		private Integer id;
		
		@Column(name = "cime_numero_cita")
		private String numeroCita;
		
		@Column(name = "cime_fecha_cita")
		private LocalDateTime fechaCita;
		
		@Column(name = "cime_valor_cita")
		private BigDecimal valorCita;
		
		@Column(name = "cime_lugar_cita")
		private String lugarCita;
		
		@Column(name = "cime_diagnostico")
		private String diagnostico;
		
		@Column(name = "cime_receta")
		private String receta;
		
		@Column(name = "cime_fecha_proxima_cita")
		private LocalDateTime fechaProxCita;
		
		@ManyToOne
		@JoinColumn(name = "cime_id_paci")
		private Paciente paciente;
		
		@ManyToOne
		@JoinColumn(name = "cime_id_doct")
		private Doctor doctor;

		
		//getters y setters
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

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

		public String getDiagnostico() {
			return diagnostico;
		}

		public void setDiagnostico(String diagnostico) {
			this.diagnostico = diagnostico;
		}

		public String getReceta() {
			return receta;
		}

		public void setReceta(String receta) {
			this.receta = receta;
		}

		public LocalDateTime getFechaProxCita() {
			return fechaProxCita;
		}

		public void setFechaProxCita(LocalDateTime fechaProxCita) {
			this.fechaProxCita = fechaProxCita;
		}

		public Paciente getPaciente() {
			return paciente;
		}

		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		}

		public Doctor getDoctor() {
			return doctor;
		}

		public void setDoctor(Doctor doctor) {
			this.doctor = doctor;
		}

		
}
