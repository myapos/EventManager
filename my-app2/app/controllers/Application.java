package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import views.html.*;

import models.User;

import models.Location;

import models.Event;

import play.data.Form;

import play.data.*;

import java.util.*;


import play.db.ebean.Model;

import com.avaje.ebean.*;

import static play.libs.Json.*;

public class Application extends Controller {

String globalusername="guest";
 /*   public Result index() {
        return ok("It works!");
    }

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
*/
/**
   * The index page.
 */  
  public Result myName(String name) {
    //return ok("Hello " + name);
    List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList(); 
     User usr =User.find.where().eq("username", globalusername).findUnique();
     
    return ok(views.html.myname.render(name,usr,events));
  }
  
  
  public Result index() {
  	
    //return ok(views.html.index.render());
    //System.out.println("user: "+User.find.byId(request().username())+" username: "+User.find.where().eq("username",User.find.byId(request().username())));
    
    //return ok(views.html.index.render(User.find.where().eq("username", User.find.byId(request().username()))));
    //return ok(views.html.index.render(User.find.byId(request().username())));
    //List<User> users = new Model.Finder(String.class, User.class).all();
    //return ok(toJson(users));
   
   //List<Event> events = new Model.Finder(String.class, Event.class).all();  
   
   //List<Event> events = Event.find.orderBy("day desc").findList();	   

	//List<Location> locations  = Location.find.where().join("Event").where().eq("location.id","event.locationid").findList(); 

	//List<Event> events = Event.find.orderBy("day desc").findList();	
	
	
	//List<Location> locations  = Location.find.findList();
	
	/*
	List<Event> events=Ebean.find(Event.class)
     .select("location.name, location.address, description, day, hours")
     //.where()
     //.eq("location.id",locationid)
     .findList();
     
     */
   
   List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();  
   /*    
   List<Location> locations=Ebean.find(Location.class)
     .select("name, address, event.description, event.day, event.hours")
     .fetch("events")
     //.where()
     //.eq("id","events.locationid")
     .findList();  
   */  
   /*  
	int test=0;
	//List<Location> myeventloclist = new ArrayList();
	//ArrayList<Location> myeventloclist = new ArrayList<Location>();
	List<List<Location>> myeventloclist = new ArrayList<List<Location>>();

	List<Location> locs;
	
	
	
	
	
	for (int i=0; i< events.size(); i++) {
   test=events.get(i).locationid;
   //for (int j=0; j< locations.size(); j++) {
    locs  = Ebean.find(Event.class)
     .select("location.name, location.address, description, day, hours")
     .where()
     .eq("location.id", s.id)
     .findList();
    //Location.find.fetch("events").where().eq("location.id",events.get(i).locationid).findList();
    //Location.find.where().eq("location.id",events.get(i).locationid).findList();
    myeventloclist.add(locs);
  		//}
   }
	*/
	//List<Location> locations  = Location.find.where().eq("events.locationid","locations.id").findList();
	
	//List<Location> locations = Location.find.fetch("events")
										//.where().eq("events.locationid",id).findList();  
	
	//List<Location> locations =  Location.find.all(); 
	
	/*
	int i = 0;
		while (i < locations.size()) {
			locations.get(i).events;
			i++;
		}
	*/	
   //User user = User.find.where().eq("email", email).findUnique();
	//List<Question> usersQuestion = user.questions;
	     
	//List<Location> locations  = Location.find.fetch("events").where().eq("events.locationid","locations.id").findList();
	
	//List<A> aList = A.find.where().join("AB").where().eq("AB.type", "3").findList();  
	//A.find.where().eq("ab.type",3).findList()
	//A.find.fetch("ab").where().eq("t1.type", 3).findList();
	/*
	List<Event> events = Ebean.find(Event.class)
   		.fetch("locationid")   
   		.findList();  */ 
   
   /*
   List<Event> events = Ebean.find(Event.class)
   		 .fetch("name")  
   		 .fetch("address")    
   		.where().eq("event.locationid", "location.id")
   		.findList();
   */   
   User usr =User.find.where().eq("username", globalusername).findUnique();
   
   if(usr==null){
   return ok(views.html.index.render(events,"",""));
   }
   else{
   	return ok(views.html.index.render(events,usr.username,usr.role)); 
   	}
   /*	
    //String test = username+" test role:"+usr.role;
    return ok(views.html.index.render(usr.username,usr.role));
    //return ok(views.html.index.render());*/
  }
  
  public Result services() {
  	/*
   List<User> users = new Model.Finder(String.class, User.class).all();
    	return ok(toJson(users));*/
  /*
  List<Event> events = new Model.Finder(String.class, Event.class).all();
    	return ok(views.html.services.render(events,"",""));
  */  	
   List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList(); 
  List<Location> locations = new Model.Finder(String.class, Location.class).all();
    	return ok(views.html.services.render(locations,"","",events));  	
  }
  /*
  public Result services() {
    return ok(views.html.services.render());
  }
  */
  @Security.Authenticated(Secured.class)
  public Result admin() {
  	User usr =User.find.where().eq("username", globalusername).findUnique();
  	List<Location> locations = new Model.Finder(String.class, Location.class).all();
  	List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();  
    //return ok(views.html.admin.render());
   if(usr==null){
   return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),locations,"","",usr,events));
   }
   else{
   	return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),locations,usr.username,usr.role,usr,events)); 
   }
   	
    //return ok(views.html.admin.render());
  }
  
  public Result contact() {
  	List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList(); 
     User usr =User.find.where().eq("username", globalusername).findUnique();
    return ok(views.html.contact.render(usr,events));
  }
  
  public Result register() {
  	User usr =User.find.where().eq("username", globalusername).findUnique();
  	 
  	List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList(); 
     
    //return ok(views.html.admin.render());
   if(usr==null){
   return ok(views.html.register.render(Form.form(RegisterUser.class),"","",usr,events));
   }
   else{
   	return ok(views.html.register.render(Form.form(RegisterUser.class),usr.username,usr.role,usr,events)); 
   }
    //return ok(views.html.register.render());
  }
  
  public Result registerUser() {
  	
  	
    String name;
    String username;
    String password;
    String email;
    String role="user";
  
    User usr =User.find.where().eq("username", globalusername).findUnique();
    List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();   	 
  	 
    Form<RegisterUser> registerForm = Form.form(RegisterUser.class).bindFromRequest();
    
    if (registerForm.hasErrors()) 
    {
        return badRequest(register.render(registerForm,usr.username,usr.role,usr,events));
    } 
    else 
    {
        //session().clear();
        //session("email", loginForm.get().email);
        name = registerForm.get().name;
        username = registerForm.get().username;
        password = registerForm.get().password;
        email = registerForm.get().email;
        
        try{
        // Create a new user and save it
    	  new User(name, username, email, password, role).save();
        
        /*session("username", loginForm.get().username);*/
        //return redirect(routes.Application.register(Form.form(RegisterUser.class), usr.username,usr.role));
        //return ok(views.html.register.render(Form.form(RegisterUser.class),usr.username,usr.role)); 
        flash("success", "You've registered!");
        return redirect(routes.Application.register());
     	  }
     	  catch(Exception e){
     	  flash("error", "Somethinq is wrong!"+e.toString());
        return redirect(routes.Application.register());
     	  }
    }
    
  }
  
  
  public Result location() {
  	User usr =User.find.where().eq("username", globalusername).findUnique();
   List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();   	   	
  	 
    //return ok(views.html.admin.render());
   if(usr==null){
   return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),null,"","",usr,events));
   }
   else{
   	return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),null,usr.username,usr.role,usr,events)); 
   }
    //return ok(views.html.register.render());
  }
  
  public Result registerLocation() {
  	
  	
    String name;
    String address;
    String latitude;
    String longitude;
    
  
    User usr =User.find.where().eq("username", globalusername).findUnique();
  	 List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();   	 
    Form<RegisterLocation> registerLocationForm = Form.form(RegisterLocation.class).bindFromRequest();
    
    if (registerLocationForm.hasErrors()) 
    {
        return badRequest(admin.render(registerLocationForm,null,null,usr.username,usr.role,usr,events));
    } 
    else 
    {
        //session().clear();
        //session("email", loginForm.get().email);
        name = registerLocationForm.get().name;
        address = registerLocationForm.get().address;
        latitude = registerLocationForm.get().latitude;
        longitude = registerLocationForm.get().longitude;
        
        try{
        // Create a new user and save it
    	  new Location(name, address, latitude, longitude).save();
        
        /*session("username", loginForm.get().username);*/
        //return redirect(routes.Application.register(Form.form(RegisterUser.class), usr.username,usr.role));
        //return ok(views.html.register.render(Form.form(RegisterUser.class),usr.username,usr.role)); 
        flash("successlocation", "You've saved location!");
        return redirect(routes.Application.admin());
     	  }
     	  catch(Exception e){
     	  flash("errorlocation", "Somethinq is wrong!"+e.toString());
        return redirect(routes.Application.admin());
     	  }
    }
    
  }
  
  
  public Result event() {
  	
  	User usr =User.find.where().eq("username", globalusername).findUnique();
  	List<Location> locations = new Model.Finder(String.class, Location.class).all();
  	List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();   	  
    //return ok(views.html.admin.render());
   if(usr==null){
   return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),locations,"","",usr,events));
   }
   else{
   	return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),locations,usr.username,usr.role,usr,events)); 
   }
   
  }
  
  public Result registerEvent() {
	
	String description;
   String day_start;
   String day_end;
   String hours;
   int location_id;
    
  
    User usr =User.find.where().eq("username", globalusername).findUnique();
	 List<Location> locations = new Model.Finder(String.class, Location.class).all();  	
  	 List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();   	  
     
    Form<RegisterEvent> registerEventForm = Form.form(RegisterEvent.class).bindFromRequest();
    
    if (registerEventForm.hasErrors()) 
    {
        return badRequest(admin.render(null,registerEventForm,locations,usr.username,usr.role,usr,events));
    } 
    else 
    {
        //session().clear();
        //session("email", loginForm.get().email);
        description = registerEventForm.get().description;
        day_start = registerEventForm.get().day_start;
        day_end = registerEventForm.get().day_end;
        hours = registerEventForm.get().hours;
        location_id = registerEventForm.get().location_id;
        Location locat = Location.find.where().eq("id", location_id).findUnique();
        
        try{
        	
        // Create a new user and save it
    	  Event event = new Event(description, day_start, day_end, hours,locat);//, location_id);
    	  
    	  //event.setLocation(locat);
    	  //locations.get(locations.size() - 1).events.add(event);
        //Ebean.save(locations); 
        Ebean.save(event); 
        /*session("username", loginForm.get().username);*/
        //return redirect(routes.Application.register(Form.form(RegisterUser.class), usr.username,usr.role));
        //return ok(views.html.register.render(Form.form(RegisterUser.class),usr.username,usr.role)); 
        flash("successevent", "You've saved event!");
        return redirect(routes.Application.admin());
     	  }
     	  catch(Exception e){
     	  flash("errorevent", "Somethinq is wrong!"+e.toString());
        return redirect(routes.Application.admin());
     	  }
    }   
   //return redirect(routes.Application.admin());	
	}   	
   	
  public Result links() {
  		List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList(); 
     User usr =User.find.where().eq("username", globalusername).findUnique();
     
    return ok(views.html.links.render(usr,events));
  }
  
  public Result login() {
  	List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();  
     User usr =User.find.where().eq("username", globalusername).findUnique();
     
    return ok(login.render(Form.form(Login.class),usr,events));
  }
  /**/
  public Result logout() {
    session().clear();
    flash("success", "You've been logged out");
    globalusername="guest";
    return redirect(routes.Application.login());
  }
  
  public Result authenticate() {
  	List<Event> events=Ebean.find(Event.class)
     .select("description, day_start, day_start, hours")
     .fetch("location")
     //.where()
     //.eq("id","events.locationid")
     .findList();  
     User usr =User.find.where().eq("username", globalusername).findUnique();
     
  	Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
    
    if (loginForm.hasErrors()) 
    {
        return badRequest(login.render(loginForm,usr,events));
    } 
    else 
    {
        session().clear();
        //session("email", loginForm.get().email);
        globalusername = loginForm.get().username;
        session("username", loginForm.get().username);
        return redirect(routes.Application.index());
    }
  	
  }
  
  
  /*inner class*/
  public static class Login {

    //public String email;
    public String username;
    public String password;
            
    public String validate() {
        
    if (User.authenticate(username, password) == null) 
    {
      return "Invalid user or password";
    }
    return null;
	}

	}	
	
  /*inner class*/
  public static class RegisterUser {

    public String name;
    public String username;
    public String password;
    public String email;        

	}		
	
  /*inner class*/
  public static class RegisterLocation {

    public String name;
    public String address;
    public String latitude;
    public String longitude;        

	}		
	
	 /*inner class*/
  public static class RegisterEvent {

    public String description;
    public String day_start;
    public String day_end;
    public String hours;
    public int location_id;        

	}		
}
