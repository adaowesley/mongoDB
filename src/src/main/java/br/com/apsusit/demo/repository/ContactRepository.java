package br.com.apsusit.demo.repository;

/**
 * Created by wesley on 26/10/15.
 */

import br.com.apsusit.demo.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends MongoRepository<Contact, String> {

    /**
     * @param name
     * @return
     */
    List<Contact> findByLastName(@Param("name") String name);

    /**
     * @param lastName
     * @return
     */
    @Query("{lastName : ?0}")
    List<Contact> findByLastNameQuery(String lastName);

    /**
     * @param email
     * @return
     */
    List<Contact> findByEmailLike(String email);

    /**
     * @param address
     * @return
     */
    List<Contact> findByAddressLike(String address);


}
