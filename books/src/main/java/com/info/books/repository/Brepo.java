package com.info.books.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.info.books.model.book;

public interface Brepo extends MongoRepository<book, Integer>{

}
