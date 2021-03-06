package edu.eci.arep.CasoCATS_Back.model;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName, lastName, phoneNumeber, password, email;
	private long cedula;
	private List<Credito> creditos;
	public List<Credito> getCreditos() {
		return creditos;
	}
	public void setCreditos(List<Credito> creditos) {
		this.creditos = creditos;
	}
	public CuentaAhorro getCuentaAhorro() {
		return cuentaAhorro;
	}
	public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
		this.cuentaAhorro = cuentaAhorro;
	}
	private CuentaAhorro cuentaAhorro;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumeber() {
		return phoneNumeber;
	}
	public void setPhoneNumeber(String phoneNumeber) {
		this.phoneNumeber = phoneNumeber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCedula() {
		return cedula;
	}
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	
}
