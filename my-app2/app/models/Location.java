package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import models.Event;
import java.util.List;

@Entity
public class Location extends Model {

	@Id
	public int id;

	public String name;
	
	public String address;
	
	public String latitude;
	
	public String longitude;
	
	//@OneToMany(cascade=CascadeType.ALL, mappedBy = "location_id")
   //public List<Event> events;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
  	private List<Event> events;	
	
	public Location(String name, String address, String latitude, String longitude){
	
	this.name=name;
	this.address=address;
	this.latitude=latitude;
	this.longitude=longitude;
	
	
	}
	
	public Location(String name, String address, String latitude, String longitude,List<Event> events){
	
	this.name=name;
	this.address=address;
	this.latitude=latitude;
	this.longitude=longitude;
	this.events=events;
	
	}
	
	
	public static Model.Finder<String, Location> find = new Model.Finder(String.class, Location.class);
	
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