package com.sinensia.pollosalegres.backend.business.model;

import java.io.Serializable;

public class DatosContacto implements Serializable {

	private String telefono;
	private String fax;
	private String email;
	
	public DatosContacto() {
		// No args constructor
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
