package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name= "event")
public class Event extends Model {

	@Id
	public int id;

	public String description;
	
	public String dayStart;
	
	public String dayEnd;
	
	public String hours;
	
	//public int location_id;
	
	//@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name = "location_id", referencedColumnName = "id")
	//public int location_id;
	//private Location location;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	public Location location;
	//int location_id;
  	//private Location location;
	
	public Event(String description, String dayStart, String dayEnd, String hours, Location locat){
	
	this.description=description;
	this.dayStart=dayStart;
	this.dayEnd=dayEnd;
	this.hours=hours;
	this.location=locat;
	
	
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