package com.hp.domain.Credentials;

import com.hp.domain.Person.Person;

public interface Credentials 
{
	public void setLoginName(String loginName);
	
	public void setPassword(String password);
	
	public void setPerson(Person person);
	
	
	public String getLoginName();
	
	public String getPassword();
	
	public Person getPerson();
	
}
