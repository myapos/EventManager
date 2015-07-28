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
	
	public static Model.Finder<String, User> find = new Model.Finder(String.class, User.class);

	public static User authenticate(String email, String password) {
   return find.where().eq("email", email).eq("password", password).findUnique();
	}
}