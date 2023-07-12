package com.example.library.service;

import com.example.library.entity.Person;
import com.example.library.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createService(Person person) {
        return personRepository.save(person);
    }

    public List<Person> readService() {
        return personRepository.findAll();
    }

    public Optional<Person> readIdService(int id) {
        return personRepository.findById(id);
    }

    public Optional<Person> updateService(int id, Person person) {
        return personRepository.findById(id).map(
                record -> {
                    record.setName(person.getName());
                    return record;
                }
        );
    }
    public Optional<Person> deleteService(int id) {
        return personRepository.findById(id).map(
                record -> {
                    personRepository.deleteById(id);
                    return record;
                }
        );
    }
}
