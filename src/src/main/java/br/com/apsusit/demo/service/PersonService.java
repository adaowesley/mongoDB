package br.com.apsusit.demo.service;

import br.com.apsusit.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

/**
 * Created by wesley on 26/10/15.
 */
@Service
public class PersonService {

    Hashtable<String, Person> hashtable = new Hashtable<>();

    public PersonService() {
        Person p1 = new Person();
        p1.setAge(22);
        p1.setFirstName("Wesley");
        p1.setLastName("Santos");
        p1.setId("1");

        hashtable.put(p1.getId(), p1);

        Person p2 = new Person();
        p2.setAge(22);
        p2.setFirstName("Fulano");
        p2.setLastName("de Tal");
        p2.setId("2");

        hashtable.put(p2.getId(), p2);
    }

    public Person getPerson(String id) {
        if (hashtable.containsKey(id))
            return hashtable.get(id);
        else
            return null;
    }

    public Hashtable<String, Person> getAll() {
        return hashtable;
    }
}
