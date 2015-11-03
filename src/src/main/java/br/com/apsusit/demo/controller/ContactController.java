package br.com.apsusit.demo.controller;

/**
 * Created by wesley on 26/10/15.
 */

import br.com.apsusit.demo.model.Contact;
import br.com.apsusit.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Contact> getAll() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{contactId}")
    public Contact getContactById(@PathVariable("contactId") String contactId) {
        return repo.findOne(contactId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/address/{address}")
    public List<Contact> getContactByAddress(@PathVariable("address") String address) {
        return repo.findByAddressLike(address);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/name/{name}")
    public List<Contact> selectByLastName(@PathVariable String name) {
        //return repo.findByLastName(name);
        return repo.findByLastNameQuery(name);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Contact create(@RequestBody Contact contact) {
        return repo.save(contact);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable String id) {
        repo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Contact update(@PathVariable String id, @RequestBody Contact contact) {
        Contact update = repo.findOne(id);
        update.setAddress(contact.getAddress());
        update.setEmail(contact.getEmail());
        update.setFacebookProfile(contact.getFacebookProfile());
        update.setFirstName(contact.getFirstName());
        update.setGooglePlusProfile(contact.getGooglePlusProfile());
        update.setLastName(contact.getLastName());
        update.setLinkedInProfile(contact.getLinkedInProfile());
        update.setPhoneNumber(contact.getPhoneNumber());
        update.setTwitterHandle(contact.getTwitterHandle());
        return repo.save(update);
    }
}
