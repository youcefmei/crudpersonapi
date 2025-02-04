package fr.afpa.pompey.cda.springbootapi.repository;

import fr.afpa.pompey.cda.springbootapi.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
