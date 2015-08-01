package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import models.Event;
import java.util.List;

@Entity
@Table(name="location")
public class Location extends Model {

	@Id
	@Column(name="id")
	public int id;

	@Column(name="name")
	public String name;
	
	@Column(name="address")
	public String address;
	
	@Column(name="latitude")
	public String latitude;

	@Column(name="longitude")
	public String longitude;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="locationid", referencedColumnName = "event.locationid") 
   public List<Event> events;
	
	public Location(String name, String address, String latitude, String longitude){
	
	this.name=name;
	this.address=address;
	this.latitude=latitude;
	this.longitude=longitude;
	
	
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