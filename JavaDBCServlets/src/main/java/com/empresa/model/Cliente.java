package com.empresa.model;

public class Cliente {
	public int id;
	public String nombre;
	public String ciudad;
	public float facturacion;
	
	public Cliente(int id, String nombre, String ciudad, float facturacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.facturacion = facturacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public float getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(float facturacion) {
		this.facturacion = facturacion;
	}



	
	
}
