package com.example.library.controller;

import com.example.library.entity.Person;
import com.example.library.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person createController(@RequestBody Person person){
        return personService.createService(person);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Person> readController(){
        return personService.readService();
    }


}
