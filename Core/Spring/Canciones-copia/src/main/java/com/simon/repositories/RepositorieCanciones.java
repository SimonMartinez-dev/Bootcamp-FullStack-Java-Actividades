package com.simon.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simon.models.Cancion;
import java.util.List;

@Repository
public interface RepositorieCanciones  extends CrudRepository<Cancion, Long>{
	List<Cancion> findAll();
}
