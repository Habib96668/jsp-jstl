package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.sample.model.sampleEntity;
import com.example.sample.repository.sampleRepository;

@Controller
public class sampleController {
	
	@Autowired
	private sampleRepository samplerepository;
	
	@GetMapping("/getallsamples")
	public List<sampleEntity> getAll(){		System.out.println("hello");
		System.out.println("hello 1");
		System.out.println("hello 2");
		System.out.println("hello 3");
		System.out.println("sample");
		System.out.println("sample 1");
		return samplerepository.findAll();
	}
	
	@GetMapping("/index")
	public String index1(ModelMap map){
		map.put("map", samplerepository.findAll());
//		map.put("map","hello");
		return "index";
	}
	
	@GetMapping("/status")
	public String status1() {
		return "status";
	}
	
//	@PostMapping("/savesamples")
//	public String postAll(sampleEntity sampleentity) {
//		samplerepository.save(sampleentity);
//		return "index";
//	}
	
	@PostMapping("/savesamples")
	public RedirectView postAll(sampleEntity sampleentity) {
		samplerepository.save(sampleentity);
//		return "index";
		return new RedirectView("index");
	}
	
	@PutMapping("/updatesamples")
	public void updateAll(@RequestBody sampleEntity sampleentity) {
		samplerepository.save(sampleentity);
	}
}
