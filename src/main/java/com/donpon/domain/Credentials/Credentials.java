package com.donpon.domain.Credentials;

import com.donpon.domain.Person.Person;

public interface Credentials 
{
	public void setLoginName(String loginName);
	
	public void setPassword(String password);
	
	public void setPerson(Person person);
	
	
	public String getLoginName();
	
	public String getPassword();
	
	public Person getPerson();
	
}
