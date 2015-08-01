package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="event")
public class Event extends Model {

	@Id
	@Column(name="id")
	public int id;

	@Column(name="description")
	public String description;
	
	@Column(name="day")
	public String day;
	
	@Column(name="hours")
	public String hours;
	
	@ManyToOne
	public int locationid;
	
	
	public Event(String description, String day, String hours, int locationid){
	
	this.description=description;
	this.day=day;
	this.hours=hours;
	this.locationid=locationid;
	
	
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