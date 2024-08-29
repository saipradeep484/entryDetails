package com.example.entryDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entryDetails.model.Students;

public interface repo extends JpaRepository<Students,Long>{
    
}
