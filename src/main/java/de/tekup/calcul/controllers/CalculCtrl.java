package de.tekup.calcul.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.calcul.models.Data;
import de.tekup.calcul.services.CalculService;

@RestController
public class CalculCtrl {

	private CalculService service;

	public CalculCtrl(CalculService service) {
		super();
		this.service = service;
	}

	@RequestMapping(path = "/add/{v1}/{v2}")
	public int addCalc(@PathVariable("v1") int a, @PathVariable("v2") int b) {
		return service.sum(a, b);
	}
	
	@PostMapping("/add")
	public List<Integer> addBatchCalc(@RequestBody Data data){
		return service.sumBatch(data);
	}

}
