package pe.edu.upeu.LP2_clase01.service;

import java.util.List;
import java.util.Optional;
import pe.edu.upeu.LP2_clase01.entity.Facultad;

public interface FacultadService {
	Facultad create(Facultad c);
	Facultad update(Facultad c);
	void delete(Long id);
	Optional<Facultad> read(Long id);
	List<Facultad> readAll();
}
