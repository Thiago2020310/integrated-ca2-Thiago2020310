/*

 */
package thiago2020310.librarymanagement;

/**
 *
 * @author 2020310 
 * Abstract class that will be used to create common user 
 */
public abstract class User {
    
    //Protected variables that will be used by subclasses
    protected int id;
    protected String name;
    protected String email;
    protected String password;
    protected String role;
    
    //User Constructor to be used on the subclasses.
    public User(int id, String name, String email, String password, String role) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.role = role;
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    //An abstract method this will be used to show specific menu for specific users.
    public abstract String showMenu();
    
}



