package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.LP2_clase01.entity.Facultad;
import pe.edu.upeu.LP2_clase01.repository.FacultadRepository;
import pe.edu.upeu.LP2_clase01.service.FacultadService;
@Service
public class FacultadServiceImpl implements FacultadService{

	@Autowired
	private FacultadRepository facultadRepository;
	
	@Override
	public Facultad create(Facultad c) {
		// TODO Auto-generated method stub
		return facultadRepository.save(c);
	}

	@Override
	public Facultad update(Facultad c) {
		// TODO Auto-generated method stub
		return facultadRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facultadRepository.deleteById(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return facultadRepository.findById(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return facultadRepository.findAll();
	}

}
