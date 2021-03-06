package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User extends Model {

	@Id
	public String id;

	public String name;
	
	public String username;
	
	public String email;
	
	public String password;
	
	public String role;
	
	public User(String name, String username, String email, String password, String role){
	
	this.name=name;
	this.username=username;
	this.email=email;
	this.password=password;
	this.role=role;
	
	}
	
	public static Model.Finder<String, User> find = new Model.Finder(String.class, User.class);
	
	public static User authenticate(String username, String password) {
   return find.where().eq("username", username).eq("password", password).findUnique();
	}
/*
	public static User authenticate(String email, String password) {
   return find.where().eq("email", email).eq("password", password).findUnique();
	}
	*/
}