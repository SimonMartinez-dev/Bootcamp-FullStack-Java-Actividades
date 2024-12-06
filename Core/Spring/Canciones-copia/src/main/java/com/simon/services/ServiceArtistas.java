package com.simon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simon.models.Artista;
import com.simon.repositories.RepositorieArtistas;

@Service
public class ServiceArtistas {

	@Autowired
		
		RepositorieArtistas repositorieArtistas;
		
		public List<Artista> obtenerArtistas(){
			return (List<Artista>)repositorieArtistas.findAll();
		}
	
		public Artista obtenerArtistaPorId(Long id) {
			return repositorieArtistas.findById(id).orElse(null);
	}
	
	public Artista agregarArtista(Artista artista) {
		return this.repositorieArtistas.save(artista);
	}
}

