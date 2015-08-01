package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Location extends Model {

	@Id
	@OneToOne
   @JoinColumn(table = "event", referencedColumnName = "locationid")
	public String id;

	public String name;
	
	public String address;
	
	public String latitude;
	
	public String longitude;
	
	
	
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