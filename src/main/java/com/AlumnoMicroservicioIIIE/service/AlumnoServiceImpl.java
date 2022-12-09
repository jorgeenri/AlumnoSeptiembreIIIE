package com.AlumnoMicroservicioIIIE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AlumnoMicroservicioIIIE.dto.AlumnoDTO;
import com.AlumnoMicroservicioIIIE.model.Alumno;
import com.AlumnoMicroservicioIIIE.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	///SEGUNDO PASO
	
	@Autowired
	private AlumnoRepository repository;
	

	@Override
	public List<AlumnoDTO> listar() {
		// TODO Auto-generated method stub
		
		List<AlumnoDTO> listadto = new ArrayList<>();
		AlumnoDTO dto = null;
		
		for (Alumno alumno : repository.findAll()) {
			dto= new AlumnoDTO();
			dto.setApe(alumno.getApellido());
			dto.setNom(alumno.getNombre());
			dto.setCodigo(alumno.getIdAlumno());
			listadto.add(dto);
		}
		return listadto;
	}
	
	
	

	@Override
	public AlumnoDTO obtenerId(Integer id) {
		// TODO Auto-generated method stub
		
		Alumno alumno = repository.findById(id).orElse(null);
		
		AlumnoDTO dto= new AlumnoDTO();
		dto.setApe(alumno.getApellido());
		dto.setNom(alumno.getNombre());
		dto.setCodigo(alumno.getIdAlumno());
		
		return dto;
	}
	
	
	
	

	@Override
	public void guardar(AlumnoDTO alumno) {
		// TODO Auto-generated method stub
		
		Alumno alu = new  Alumno();
		alu.setApellido(alumno.getApe());
		alu.setNombre(alumno.getNom());
		alu.setIdAlumno(alumno.getCodigo());
		repository.save(alu);
	}

	
	
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(AlumnoDTO alumno) {
		// TODO Auto-generated method stub
		Alumno alu = new  Alumno();
		alu.setApellido(alumno.getApe());
		alu.setNombre(alumno.getNom());
		alu.setIdAlumno(alumno.getCodigo());
		repository.saveAndFlush(alu);

	}

}
