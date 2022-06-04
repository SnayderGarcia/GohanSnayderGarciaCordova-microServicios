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

import idat.edu.pe.modelo.Ropa;
import idat.edu.pe.service.RopaService;

@Controller
@RequestMapping("/ropa")
public class RopaController {
	
	@Autowired
	private RopaService service;
	
	
	@GetMapping(path="/listarR")
	public @ResponseBody List<Ropa> listar(){
		return service.list();
		
	}
	
	
	@PostMapping(path="/insertarR")
	public String save(@RequestBody Ropa ropa){	
		service.save(ropa);
		return "redirect:listarR";
		
	}
	
	@DeleteMapping(path="eliminarR/{id}")
	public  ResponseEntity<Void> delete(@PathVariable Integer id){
		
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	


}
