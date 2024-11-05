package pe.edu.upeu.LP2_clase01.service;

import pe.edu.upeu.LP2_clase01.entity.Coche;

import java.util.List;
import java.util.Optional;

public interface CocheService {
	Coche create(Coche c);
	Coche update(Coche c);
	void delete(Long id);
	Optional<Coche> read(Long id);
	List<Coche> readAll();
}
