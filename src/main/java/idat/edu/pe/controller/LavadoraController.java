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

import idat.edu.pe.modelo.Lavadora;
import idat.edu.pe.service.LavadoraService;

@Controller
@RequestMapping("/lavadora")
public class LavadoraController {
	
	@Autowired
	private LavadoraService service;
	
	
	@GetMapping(path="/listarL")
	public @ResponseBody List<Lavadora> listar(){
		return service.list();
		
	}
	
	
	@PostMapping(path="/insertarL")
	public String save(@RequestBody Lavadora Lavadora){	
		service.save(Lavadora);
		return "redirect:listarR";
		
	}
	
	@DeleteMapping(path="eliminarL/{id}")
	public  ResponseEntity<Void> delete(@PathVariable Integer id){
		
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	

}
