package pe.edu.upeu.LP2_clase01.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.LP2_clase01.entity.Tipo;
import pe.edu.upeu.LP2_clase01.repository.TipoRepository;
import pe.edu.upeu.LP2_clase01.service.TipoService;

import java.util.List;
import java.util.Optional;

@Service
public class TipoServiceImpl implements TipoService {

	@Autowired
	private TipoRepository repository;
	
	@Override
	public Tipo create(Tipo c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Tipo update(Tipo c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Tipo> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Tipo> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
