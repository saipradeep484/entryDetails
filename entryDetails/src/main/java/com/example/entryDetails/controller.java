package com.example.entryDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entryDetails.model.Students;
import com.example.entryDetails.service.service;

@RestController
@RequestMapping("endpoint")
public class controller {
    public service ser;
    @Autowired public controller (service ser){
        this.ser=ser;
    }
    @GetMapping
    public List<Students> method1()
    {
        return ser.getAllPatientDetails();
    }
     @PostMapping
    public Students method2(@RequestBody Students book) {
        return ser.createPatientDetails(book);
    }

    // @PutMapping("/{id}")
    // public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
    //     return bookService.updateBook(id, book);
    // }

    @DeleteMapping({"id"})
    public void method2(@PathVariable long id)
    {
         ser.deletePatientDetails(id);
    }

}
