package com.simon.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simon.models.Artista;

@Repository
public interface RepositorieArtistas extends CrudRepository<Artista, Long>{
	List<Artista> findAll();
}
