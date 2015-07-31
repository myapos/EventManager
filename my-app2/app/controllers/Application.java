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

import java.util.List;

import play.db.ebean.Model;

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
    return ok(views.html.myname.render(name));
  }
  
  
  public Result index() {
  	
    //return ok(views.html.index.render());
    //System.out.println("user: "+User.find.byId(request().username())+" username: "+User.find.where().eq("username",User.find.byId(request().username())));
    
    //return ok(views.html.index.render(User.find.where().eq("username", User.find.byId(request().username()))));
    //return ok(views.html.index.render(User.find.byId(request().username())));
    //List<User> users = new Model.Finder(String.class, User.class).all();
    //return ok(toJson(users));
    User usr =User.find.where().eq("username", globalusername).findUnique();
   
   if(usr==null){
   return ok(views.html.index.render("",""));
   }
   else{
   	return ok(views.html.index.render(usr.username,usr.role)); 
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
  List<Location> locations = new Model.Finder(String.class, Location.class).all();
    	return ok(views.html.services.render(locations,"",""));  	
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
  	 
    //return ok(views.html.admin.render());
   if(usr==null){
   return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),locations,"",""));
   }
   else{
   	return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),locations,usr.username,usr.role)); 
   }
   	
    //return ok(views.html.admin.render());
  }
  
  public Result contact() {
    return ok(views.html.contact.render());
  }
  
  public Result register() {
  	User usr =User.find.where().eq("username", globalusername).findUnique();
  	 
    //return ok(views.html.admin.render());
   if(usr==null){
   return ok(views.html.register.render(Form.form(RegisterUser.class),"",""));
   }
   else{
   	return ok(views.html.register.render(Form.form(RegisterUser.class),usr.username,usr.role)); 
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
  	
    Form<RegisterUser> registerForm = Form.form(RegisterUser.class).bindFromRequest();
    
    if (registerForm.hasErrors()) 
    {
        return badRequest(register.render(registerForm,usr.username,usr.role));
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
  	 
    //return ok(views.html.admin.render());
   if(usr==null){
   return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),null,"",""));
   }
   else{
   	return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),null,usr.username,usr.role)); 
   }
    //return ok(views.html.register.render());
  }
  
  public Result registerLocation() {
  	
  	
    String name;
    String address;
    String latitude;
    String longitude;
    
  
    User usr =User.find.where().eq("username", globalusername).findUnique();
  	
    Form<RegisterLocation> registerLocationForm = Form.form(RegisterLocation.class).bindFromRequest();
    
    if (registerLocationForm.hasErrors()) 
    {
        return badRequest(admin.render(registerLocationForm,null,null,usr.username,usr.role));
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
  	 
    //return ok(views.html.admin.render());
   if(usr==null){
   return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),locations,"",""));
   }
   else{
   	return ok(views.html.admin.render(Form.form(RegisterLocation.class),Form.form(RegisterEvent.class),locations,usr.username,usr.role)); 
   }
   
  }
  
  public Result registerEvent() {
	
	String description;
   String day;
   String hours;
   String locationid;
    
  
    User usr =User.find.where().eq("username", globalusername).findUnique();
	 List<Location> locations = new Model.Finder(String.class, Location.class).all();  	
  	
    Form<RegisterEvent> registerEventForm = Form.form(RegisterEvent.class).bindFromRequest();
    
    if (registerEventForm.hasErrors()) 
    {
        return badRequest(admin.render(null,registerEventForm,locations,usr.username,usr.role));
    } 
    else 
    {
        //session().clear();
        //session("email", loginForm.get().email);
        description = registerEventForm.get().description;
        day = registerEventForm.get().day;
        hours = registerEventForm.get().hours;
        locationid = registerEventForm.get().locationid;
        
        try{
        // Create a new user and save it
    	  new Event(description, day, hours, locationid).save();
        
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
    return ok(views.html.links.render());
  }
  
  public Result login() {
    return ok(login.render(Form.form(Login.class)));
  }
  /**/
  public Result logout() {
    session().clear();
    flash("success", "You've been logged out");
    globalusername="guest";
    return redirect(routes.Application.login());
  }
  
  public Result authenticate() {
  	
  	Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
    
    if (loginForm.hasErrors()) 
    {
        return badRequest(login.render(loginForm));
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
    public String day;
    public String hours;
    public String locationid;        

	}		
}
