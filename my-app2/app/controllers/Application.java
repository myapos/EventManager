package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import views.html.*;

import models.User;

import play.data.Form;

import play.data.*;

import java.util.List;

import play.db.ebean.Model;

import static play.libs.Json.*;

public class Application extends Controller {

String username="guest";
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
    User usr =User.find.where().eq("username", username).findUnique();
    //String test = username+" test role:"+usr.role;
    return ok(views.html.index.render(usr.username,usr.role));
    //return ok(views.html.index.render());
  }
  
  public Result services() {
   List<User> users = new Model.Finder(String.class, User.class).all();
    	return ok(toJson(users));
  }
  /*
  public Result services() {
    return ok(views.html.services.render());
  }
  */
  @Security.Authenticated(Secured.class)
  public Result admin() {
    return ok(views.html.admin.render());
  }
  
  public Result contact() {
    return ok(views.html.contact.render());
  }
  
  public Result register() {
    return ok(views.html.register.render());
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
        username = loginForm.get().username;
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
}
