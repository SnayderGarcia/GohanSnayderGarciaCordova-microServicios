package idat.edu.pe.service;

import java.util.List;

import idat.edu.pe.modelo.Ropa;

public interface RopaService {
	
	public void save(Ropa c);
	public void delete(Integer id);
	public void update(Ropa c);
	public List<Ropa> list();
	public Ropa productoById(Integer id);

}
