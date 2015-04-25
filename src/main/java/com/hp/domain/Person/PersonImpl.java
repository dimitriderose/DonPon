package com.hp.domain.Person;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class PersonImpl implements Person  {
	
	@GraphId
	private Long id;

	@Indexed(unique=true)
	private String emailAddress;
	
	private String firstName;
	private String lastName;	
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName= firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName= lastName;
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		this.emailAddress= emailAddress;
	}
	
	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	@Override
	public Long getId(){
		return this.id;
	}


}
