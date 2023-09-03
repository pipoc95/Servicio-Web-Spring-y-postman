package co.edu.sena.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.User;
import co.edu.sena.models.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
@GetMapping("/{id}")	
public Optional<User> buscarPorId(@PathVariable Integer id) {
		
		return userService.findById(id);
	}

@GetMapping("/listar")
public List<User> listarTodos() {
	
	return userService.findAll();
	
}	
@PostMapping
public User guardar(@RequestBody User e) {
	
	return userService.save(e);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Integer id) {
	userService.deletById(id);
	
}

@PutMapping("/actualizar/{id}")
public User actualizar(@RequestBody User e, @PathVariable Integer id ) {
	
	User eEnBD= userService.findById(id).get();
	eEnBD.setId(e.getId());
	eEnBD.setEmail(e.getEmail());
	eEnBD.setNombre(e.getNombre());
	eEnBD.setApellido(e.getApellido());
	eEnBD.setFechaContratacion(e.getFechaContratacion());
	eEnBD.setRol(e.getRol());
	
	userService.save(eEnBD);
	
	return e;
	
}
}
