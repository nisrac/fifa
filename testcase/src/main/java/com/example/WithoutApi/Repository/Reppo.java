package com.example.WithoutApi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.WithoutApi.Entity.People;

public interface Reppo extends CrudRepository<People, Integer>{

}
