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

	public static User authenticate(String username, String password) {
   return find.where().eq("username", username).eq("password", password).findUnique();
	}
}