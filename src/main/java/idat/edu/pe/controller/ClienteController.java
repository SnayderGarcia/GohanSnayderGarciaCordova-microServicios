package idat.edu.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import idat.edu.pe.modelo.Cliente;
import idat.edu.pe.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	
	@GetMapping(path="/listarCli")
	public @ResponseBody List<Cliente> listar(){
		return service.list();
		
	}
	
	
	@PostMapping(path="/insertarCli")
	public String save(@RequestBody Cliente cliente){	
		service.save(cliente);
		return "redirect:listarCli";
		
	}
	
	@DeleteMapping(path="eliminarCli/{id}")
	public  ResponseEntity<Void> delete(@PathVariable Integer id){
		
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);

	}
	

	
	

}
