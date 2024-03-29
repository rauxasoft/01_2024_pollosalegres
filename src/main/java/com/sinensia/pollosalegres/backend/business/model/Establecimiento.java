package com.sinensia.pollosalegres.backend.business.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Establecimiento implements Serializable {
	
	private Long codigo;
	private String nombreComercial;
	private Direccion direccion;
	private DatosContacto datosContacto;
	private Date fechaInauguracion;
	
	public Establecimiento() {
		// No args constructor
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public DatosContacto getDatosContacto() {
		return datosContacto;
	}

	public void setDatosContacto(DatosContacto datosContacto) {
		this.datosContacto = datosContacto;
	}

	public Date getFechaInauguracion() {
		return fechaInauguracion;
	}

	public void setFechaInauguracion(Date fechaInauguracion) {
		this.fechaInauguracion = fechaInauguracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Establecimiento)) {
			return false;
		}
		Establecimiento other = (Establecimiento) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
