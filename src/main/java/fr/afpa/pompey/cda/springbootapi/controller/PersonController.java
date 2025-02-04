package fr.afpa.pompey.cda.springbootapi.controller;

import fr.afpa.pompey.cda.springbootapi.entities.Person;
import fr.afpa.pompey.cda.springbootapi.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/persons")
    public Iterable<Person> getAllPersons() {
        return personService.getPersons();
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable("id") Integer id) {
        Optional<Person> person = personService.getPerson(id);
        return person.orElse(null);
    }

    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable("id") Integer id, @RequestBody Person person) {
        Optional<Person> personOptional = personService.getPerson(id);
        if (personOptional.isPresent()) {
            Person personToUpdate = personOptional.get();

            String firstName = person.getFirstName();
            if (firstName != null) {
                personToUpdate.setFirstName(firstName);
            }

            String lastName = person.getLastName();
            if (lastName != null) {
                personToUpdate.setLastName(lastName);
            }

            personService.savePerson(personToUpdate);
            return personToUpdate;
        } else {
            return null;
        }
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") Integer id) {
        personService.deletePerson(id);
    }

}
