package com.cg.pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacementController {
	
	@Autowired
	private PlacementService service; 
	
	//retrieve all
	@GetMapping("/placements")
	public List<Placement> list() {
		return service.listAll();	
	}
	
	@GetMapping("/placements/{id}")
	public ResponseEntity<Placement> get(@PathVariable Integer id) {
		try{
			Placement placement = service.get(id);
		    return new ResponseEntity<Placement> (placement,HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<Placement> (HttpStatus.NOT_FOUND);
		}	
	}
    
	@PostMapping("/placements")
	public void add(@RequestBody Placement placement) {
		service.save(placement);
	}
	
	@PutMapping("/placements/{id}")
	public ResponseEntity<?> update(@RequestBody Placement placement,@PathVariable Integer id) {
		try{
			Placement existplacement = service.get(id);
		    service.save(placement);
		    return new ResponseEntity<>(HttpStatus.OK);
		   } catch(Exception e) {
			   
			   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		   }
	}
	
	@DeleteMapping("/placements/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
