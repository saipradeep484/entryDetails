package com.example.entryDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entryDetails.model.Students;
import com.example.entryDetails.repository.repo;

@Service
public class service {
    public repo rp ;
    @Autowired public service(repo rp )
    {
        this.rp=rp;
    }
    public List<Students> getAllPatientDetails() {
        return rp.findAll();
    }
    public Students createPatientDetails(Students std) {
        return rp.save(std);
    }
    public void deletePatientDetails(Long id) {
        rp.deleteById(id);
    }
}
