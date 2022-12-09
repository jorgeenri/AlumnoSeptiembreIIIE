package com.AlumnoMicroservicioIIIE.dto;

public class AlumnoDTO {
	//1er paso
	//TRANSFERIMOS LOS CAMPOS DEL MODELO A DTO PERO CON OTRO NOMBRE
	
	private Integer codigo;
	private String nom;
	private String ape;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	
	
	
	

}
