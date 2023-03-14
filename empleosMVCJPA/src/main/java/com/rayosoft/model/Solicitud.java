package com.rayosoft.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Solicitudes")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDate fecha;

	private String comentarios;

	private String archivo;

//Constructor
	public Solicitud() {
		this.fecha = LocalDate.now();
	}

//Relaciones
	@OneToOne
	@JoinColumn(name = "idVacante")
	private Vacante vacante;

	@OneToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

//G&S -----------------------------------------------
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	/**
	 * @return the vacante
	 */
	public Vacante getVacante() {
		return vacante;
	}

	/**
	 * @param vacante the vacante to set
	 */
	public void setVacante(Vacante vacante) {
		this.vacante = vacante;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

//ToString()

	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", fecha=" + fecha + ", comentarios=" + comentarios + ", archivo=" + archivo
				+ "]";
	}
}
