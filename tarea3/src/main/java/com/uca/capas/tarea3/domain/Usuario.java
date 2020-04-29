package com.uca.capas.tarea3.domain;

import javax.validation.constraints.Size;

public class Usuario {
	
	@Size(min = 1, max = 25, message = "Los nombres deben tener mínimo 1 carácter y máximo 25 caracteres")
	private String nombres;
	
	@Size(min = 1, max = 25, message = "Los apellidos deben tener mínimo 1 carácter y máximo 25 caracteres")
	private String apellidos;
	
	private String fechaN;
	
	@Size(min = 1, max = 25, message = "El lugar de nacimiento deben tener mínimo 1 carácter y máximo 25 caracteres")
	private String lugarN;
	
	@Size(min = 1, max = 25, message = "El Instituto o Colegio debe tener mínimo 1 carácter y máximo 100 caracteres")
	private String colegio;
	
	@Size(min = 8, max = 8, message ="El telefono fijo debe contener 8 números exactamente")
	private	String telF;

	@Size(min = 8, max = 8, message ="El telefono movil debe contener 8 números exactamente")
	private	String telM;
	
	public Usuario(String nombres, String apellidos, String fechaN,
			String lugarN, String colegio, String telF, String telM) {
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaN = fechaN;
		this.lugarN = lugarN;
		this.colegio = colegio;
		this.telF = telF;
		this.telM = telM;
		
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getFechaN() {
		return fechaN;
	}
	
	public void setFechaN(String fechaN) {
		this.fechaN = fechaN;
	}
	
	public String getLugarN() {
		return lugarN;
	}
	
	public void setLugarN(String lugarN) {
		this.lugarN = lugarN;
	}
	
	public String getColegio() {
		return colegio;
	}
	
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	
	public String getTelF() {
		return telF;
	}
	
	public void setTelF(String telF) {
		this.telF= telF;
	}
	
	public String getTelM() {
		return telM;
	}
	
	public void setTelM(String telM) {
		this.telM = telM;
	}
	
}