package com.example.WithoutApi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.WithoutApi.Entity.People;
import com.example.WithoutApi.Repository.Reppo;

@SpringBootTest
class WithoutApiApplicationTests {
	@Autowired
	
	Reppo repo;

	@Test
	public void testcreate()
	{
		People pp=new People();
		pp.setId(1);
		pp.setName("shravani");
		repo.save(pp);
	}
	@Test
	public void testReadall()
	{
		Iterable<People> List=repo.findAll();
	}
	@Test
	public void testDelete()
	{
		repo.deleteById(1);
	}
	@Test
	public void testupdate()
	{
		People pp=repo.findById(1).get();
		pp.setName("dhanya");
		repo.save(pp);
	}

	
	
}
