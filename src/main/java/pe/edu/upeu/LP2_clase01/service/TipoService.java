package pe.edu.upeu.LP2_clase01.service;

import pe.edu.upeu.LP2_clase01.entity.Tipo;

import java.util.List;
import java.util.Optional;

public interface TipoService {
	Tipo create(Tipo c);
	Tipo update(Tipo c);
	void delete(Long id);
	Optional<Tipo> read(Long id);
	List<Tipo> readAll();
}
