package idat.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Repository.LavadoraRepository;
import idat.edu.pe.modelo.Lavadora;


@Service
public class LavadoraServiceImpl implements LavadoraService{
	
	@Autowired
	private LavadoraRepository repository;

	@Override
	public void save(Lavadora c) {
		Lavadora lavadora = new Lavadora();
		lavadora.setIdLavadora(c.getIdLavadora());
		lavadora.setDescripcion(c.getDescripcion());
		lavadora.setMarca(c.getMarca());
		lavadora.setVoltaje(c.getVoltaje());
		
		repository.saveAndFlush(lavadora);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void update(Lavadora c) {
		
	}

	@Override
	public List<Lavadora> list() {
		return repository.findAll();
	}

	@Override
	public Lavadora productoById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
