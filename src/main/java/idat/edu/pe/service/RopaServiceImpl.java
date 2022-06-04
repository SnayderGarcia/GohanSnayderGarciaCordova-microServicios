package idat.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Repository.RopaRepository;
import idat.edu.pe.modelo.Ropa;

@Service
public class RopaServiceImpl implements RopaService{

	@Autowired
	private RopaRepository repository;

	@Override
	public void save(Ropa c) {
		Ropa Ropa = new Ropa();
		Ropa.setIdRopa(c.getIdRopa());
		Ropa.setDescripcion(c.getDescripcion());
		Ropa.setTipoRopa(c.getTipoRopa());
		
		repository.saveAndFlush(Ropa);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void update(Ropa c) {
		
	}

	@Override
	public List<Ropa> list() {
		return repository.findAll();
	}

	@Override
	public Ropa productoById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
