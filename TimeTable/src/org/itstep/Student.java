package org.itstep;

public class Student extends User{

	public Student (){
		
	}
	public Student (String login, String pass, String name, String city){
		this.setLogin(login);
		this.setCity(city);
		this.setName(name);
		this.setPass(pass);
		
	}
}
