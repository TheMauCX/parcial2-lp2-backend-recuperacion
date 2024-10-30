package pe.edu.upeu.LP2_clase01.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Carrera;

public interface CarreraService {
	Carrera create(Carrera c);
	Carrera update(Carrera c);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();
}
