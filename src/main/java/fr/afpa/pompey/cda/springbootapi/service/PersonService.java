package fr.afpa.pompey.cda.springbootapi.service;


import fr.afpa.pompey.cda.springbootapi.entities.Person;
import fr.afpa.pompey.cda.springbootapi.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Optional<Person> getPerson(int id) {
        return personRepository.findById(id);
    }

    public Iterable<Person> getPersons() {
        return personRepository.findAll();
    }

    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }

    public Person savePerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return savedPerson;
    }

}
