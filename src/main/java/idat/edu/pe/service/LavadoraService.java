package idat.edu.pe.service;

import java.util.List;

import idat.edu.pe.modelo.Lavadora;

public interface LavadoraService {
	
	public void save(Lavadora c);
	public void delete(Integer id);
	public void update(Lavadora c);
	public List<Lavadora> list();
	public Lavadora productoById(Integer id);

}
