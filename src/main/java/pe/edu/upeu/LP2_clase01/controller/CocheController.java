package pe.edu.upeu.LP2_clase01.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.LP2_clase01.entity.Coche;
import pe.edu.upeu.LP2_clase01.service.CocheService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/coches")
@CrossOrigin(origins = "http://localhost:4200")
public class CocheController {

	@Autowired
	private CocheService Service;
	
	@GetMapping
	public ResponseEntity<List<Coche>> readAll(){
		try {
			List<Coche> Coche = Service.readAll();
			if(Coche.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Coche, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Coche> crear(@Valid @RequestBody Coche cat){
		try {
			Coche c = Service.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Coche> getCocheId(@PathVariable("id") Long id){
		try {
			Coche c = Service.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Coche> delCoche(@PathVariable("id") Long id){
		try {
			Service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCoche(@PathVariable("id") Long id, @Valid @RequestBody Coche cat){

			Optional<Coche> c = Service.read(id);
			if(!c.isEmpty()) {
				return new ResponseEntity<>(Service.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}
