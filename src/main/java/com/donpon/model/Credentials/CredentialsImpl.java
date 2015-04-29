package com.donpon.model.Credentials;

import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import com.donpon.model.Person.Person;

@NodeEntity
public class CredentialsImpl implements Credentials {

	@GraphId
	private Long id;
	
	private String loginName;
	private String password;
	
	
	@Fetch
	@RelatedTo(type="Person")
	private Person person;
	
	@Override
	public void setLoginName(String loginName) {
		this.loginName= loginName;
	}

	@Override
	public void setPassword(String password) {
		this.password= password;
	}

	@Override
	public void setPerson(Person person){
		this.person= person;
	}

	@Override
	public String getLoginName() {
		return this.loginName;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public Person getPerson() {
		return this.person;
	}
	
	@Override
	public Long getId(){
		return this.id;
	}


}
