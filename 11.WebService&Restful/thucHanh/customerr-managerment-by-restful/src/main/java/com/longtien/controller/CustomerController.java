package com.longtien.controller;

import com.longtien.model.Customer;
import com.longtien.repository.ICustomerRepository;
import com.longtien.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {
     @Autowired
    private ICustomerService customerService;

     @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomer(){
         List<Customer> customerList = customerService.findAll();
         if(customerList.isEmpty()){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         } else {
             return new ResponseEntity<>(HttpStatus.OK);
         }
     }

     @GetMapping("/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable  Long id){
         Optional<Customer> customerOptional = customerService.findById(id);
        if(!customerOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
     }

     @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
         return new ResponseEntity<>(customerService.save(customer),HttpStatus.CREATED);
     }

     @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id , @RequestBody Customer customer){
         Optional<Customer> customerOptional = customerService.findById(id);
         if(!customerOptional.isPresent()){
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
             customer.setId(customerOptional.get().getId());
                return new ResponseEntity<>(customerService.save(customer), HttpStatus.OK);
         }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable Long id) {
        Optional<Customer> customerOptional = customerService.findById(id);
        if (!customerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.remove(id);
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.NO_CONTENT);
    }
}
