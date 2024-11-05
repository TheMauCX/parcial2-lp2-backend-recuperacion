package pe.edu.upeu.LP2_clase01.service;

import pe.edu.upeu.LP2_clase01.entity.Marca;

import java.util.List;
import java.util.Optional;

public interface MarcaService {
	Marca create(Marca c);
	Marca update(Marca c);
	void delete(Long id);
	Optional<Marca> read(Long id);
	List<Marca> readAll();
}
