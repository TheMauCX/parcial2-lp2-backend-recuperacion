package pe.edu.upeu.LP2_clase01.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.LP2_clase01.entity.Coche;
import pe.edu.upeu.LP2_clase01.repository.CocheRepository;
import pe.edu.upeu.LP2_clase01.service.CocheService;

import java.util.List;
import java.util.Optional;

@Service
public class CocheServiceImpl implements CocheService {

	@Autowired
	private CocheRepository repository;
	
	@Override
	public Coche create(Coche c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Coche update(Coche c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Coche> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Coche> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
