package com.example.library.service;

import com.example.library.entity.Person;
import com.example.library.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public Person createService(Person person){
        return personRepository.save(person);
    }
    public List<Person> readService(){
        return personRepository.findAll();
    }


}
