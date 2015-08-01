package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Event extends Model {

	@Id
	public int id;

	public String description;
	
	public String day;
	
	public String hours;
	
	@ManyToOne(cascade=CascadeType.ALL)
	public int location_id;
	
	
	public Event(String description, String day, String hours, int location_id){
	
	this.description=description;
	this.day=day;
	this.hours=hours;
	this.location_id=location_id;
	
	
	}
	
	public static Model.Finder<String, Event> find = new Model.Finder(String.class, Event.class);
	
	/*
	public static Location authenticate(String username, String password) {
   return find.where().eq("username", username).eq("password", password).findUnique();
	}*/
/*
	public static User authenticate(String email, String password) {
   return find.where().eq("email", email).eq("password", password).findUnique();
	}
	*/
}