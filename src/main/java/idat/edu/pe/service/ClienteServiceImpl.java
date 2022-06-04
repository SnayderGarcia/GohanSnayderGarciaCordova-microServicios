package idat.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Repository.ClienteRepository;
import idat.edu.pe.modelo.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public void save(Cliente c) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(c.getIdCliente());
		cliente.setNombreCliente(c.getNombreCliente());
		cliente.setApellidoCliente(c.getApellidoCliente());
		cliente.setNroCelular(c.getNroCelular());
		cliente.setDireccion(c.getDireccion());		
		
		repository.saveAndFlush(cliente);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void update(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> list() {
		return repository.findAll();
	}

	@Override
	public Cliente productoById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
