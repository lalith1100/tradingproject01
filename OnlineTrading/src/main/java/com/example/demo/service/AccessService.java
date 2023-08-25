package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Access;
import com.example.demo.repository.AccessRepository;
import java.util.List;

@Service
public class AccessService {
	@Autowired
	AccessRepository stRepo;
	
	public Access saveDetails(Access e)
	{
		return stRepo.save(e);
	}
	
	public List<Access> getDetails(){
		return stRepo.findAll();
	}
	
	public Access updateDetails(Access e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails(long Id)
	{
		stRepo.deleteById(Id);
	}

	
}
