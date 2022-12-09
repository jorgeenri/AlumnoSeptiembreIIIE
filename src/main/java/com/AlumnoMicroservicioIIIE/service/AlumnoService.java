package com.AlumnoMicroservicioIIIE.service;

import java.util.List;

import com.AlumnoMicroservicioIIIE.dto.AlumnoDTO;
import com.AlumnoMicroservicioIIIE.model.Alumno;

public interface AlumnoService {
	
	List<AlumnoDTO> listar();
	AlumnoDTO obtenerId(Integer id);
	void guardar(AlumnoDTO alumno);
	void eliminar(Integer id);
	void actualizar(AlumnoDTO alumno);

}
