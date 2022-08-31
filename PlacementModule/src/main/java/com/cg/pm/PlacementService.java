package com.cg.pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlacementService {
	
	@Autowired
	private PlacementRepository repo;
	
	public List<Placement> listAll() {
		return repo.findAll();
	}
	
	public Placement get(Integer id) {
		return repo.findById(id).get();	
	}
	
	public void save(Placement placement) {
		repo.save(placement);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
