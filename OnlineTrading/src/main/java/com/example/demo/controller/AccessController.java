package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Access;
import com.example.demo.service.AccessService;

import java.util.List;

@RestController
public class AccessController {

	@Autowired
	AccessService stuService;
	@PostMapping("/addDetails")
	public Access addinfo(@RequestBody Access st) {
		return stuService.saveDetails(st);
	}
	
	@GetMapping("/showDetails")
	public List<Access> fetchDetails(){
		return stuService.getDetails();
	}
	
	@PutMapping("/updateDetails")
	public Access updateInfo(@RequestBody Access st1) {
		return stuService.updateDetails(st1);
	}
	
	@DeleteMapping("/deleteDetails/{sid}")
	public String deleteInfo(@PathVariable("sid") int sid) {
		stuService.deleteDetails(sid);

		return "Details is Deleted Successfully";
		//return stuService.getDetails();
		
	}
	
	
	
}