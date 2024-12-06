package com.simon.services;

import com.simon.repositories.RepositorieCanciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simon.models.Cancion;

@Service
public class ServiceCanciones {
	
	@Autowired
	private RepositorieCanciones repositorieCanciones;
	
	public List<Cancion> obtenerCanciones(){
		return (List<Cancion>)repositorieCanciones.findAll();
	}
	public Cancion obtenerCancionPorId(Long id) {
		return repositorieCanciones.findById(id).orElse(null);
	}

	public Cancion agregarCancion(Cancion cancion) {
		return this.repositorieCanciones.save(cancion);
	}
	public Cancion actualizaCancion(Cancion cancion) {
		return this.repositorieCanciones.save(cancion);
	}

    	public void eliminarCancion(Long id) {
		this.repositorieCanciones.deleteById(id);
	}
}

