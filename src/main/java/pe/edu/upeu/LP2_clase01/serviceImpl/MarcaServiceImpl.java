package pe.edu.upeu.LP2_clase01.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.LP2_clase01.entity.Marca;
import pe.edu.upeu.LP2_clase01.repository.MarcaRepository;
import pe.edu.upeu.LP2_clase01.service.MarcaService;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {

	@Autowired
	private MarcaRepository repository;
	
	@Override
	public Marca create(Marca c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Marca update(Marca c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Marca> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Marca> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
