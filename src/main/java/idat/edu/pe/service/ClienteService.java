package idat.edu.pe.service;

import java.util.List;

import idat.edu.pe.modelo.Cliente;

public interface ClienteService {

	public void save(Cliente c);
	public void delete(Integer id);
	public void update(Cliente c);
	public List<Cliente> list();
	public Cliente productoById(Integer id);
}
