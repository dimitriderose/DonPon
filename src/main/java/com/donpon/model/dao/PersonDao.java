package com.donpon.model.dao;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.donpon.model.Person.Person;

public interface PersonDao extends GraphRepository<Person> {
	
	Person findOne(Long id);
	Person findByEmailAddress(String emailAddress);
	<Donor extends Person> Donor save (Donor person);
	
}
