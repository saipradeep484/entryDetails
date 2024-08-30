package com.example.entryDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entryDetails.model.Students;

public interface repo extends MongoRepository<Students,Long>{
    
}
