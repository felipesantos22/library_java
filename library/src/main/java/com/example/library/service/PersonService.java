package com.example.library.service;

import com.example.library.entity.Person;
import com.example.library.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public List<Person> readService(){
        return personRepository.findAll();
    }


}
