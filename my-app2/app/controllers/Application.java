package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import models.User;

import play.data.Form;

import play.data.*;

import java.util.List;

import play.db.ebean.Model;

import static play.libs.Json.*;

public class Application extends Controller {

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
  
  @Security.Authenticated(Secured.class)
  public Result index() {
    return ok(views.html.index.render(User.find.byId(request().username())));
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
        session("username", loginForm.get().username);
        return redirect(routes.Application.index());
    }
  	
  }
  
  
  /*inner class*/
  public static class Login {

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
