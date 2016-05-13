package models;

import javax.persistence.Entity;
import play.db.ebean.Model;

@Entity
public class User extends Model {

	public String username;
	public String firstname;
	public String lastname;
	public String address;

	public User(String un, String fn, String ln, String addr) {
		this.username = un;
		this.firstname = fn;
		this.lastname = ln;
		this.address = addr;
	}
}
