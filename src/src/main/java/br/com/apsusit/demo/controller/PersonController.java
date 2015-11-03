package br.com.apsusit.demo.controller;

import br.com.apsusit.demo.model.Person;
import br.com.apsusit.demo.repository.ContactRepository;
import br.com.apsusit.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;

/**
 * Created by wesley on 26/10/15.
 */
@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    ContactRepository contactRepository;

    @RequestMapping("/all")
    public Hashtable<String, Person> getAll() {
        return personService.getAll();
    }

    @RequestMapping("{id}")
    public Person getPerson(@PathVariable("id") String id) {
        return personService.getPerson(id);
    }
}
