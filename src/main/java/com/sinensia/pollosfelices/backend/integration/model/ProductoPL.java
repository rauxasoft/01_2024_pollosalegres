package com.sinensia.pollosfelices.backend.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="PRODUCTOS")
public class ProductoPL implements Serializable {

	@Id
	private Long codigo;
	
	private String nombre;
	private String descripcion;
	
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	
	private double precio;
	
	@ManyToOne
	@JoinColumn(name="ID_CATEGORIA")
	private CategoriaPL categoria;
	
	private boolean descatalogado;
	
	public ProductoPL() {
		// No args constructor
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public CategoriaPL getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaPL categoria) {
		this.categoria = categoria;
	}
	
	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
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
		if (!(obj instanceof ProductoPL)) {
			return false;
		}
		ProductoPL other = (ProductoPL) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
