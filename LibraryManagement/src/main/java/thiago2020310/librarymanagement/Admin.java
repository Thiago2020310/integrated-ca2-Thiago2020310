/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thiago2020310.librarymanagement;

/**
 *
 * @author Thiago
 */
public class Admin extends User {
    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password, "Admin");
    }
    
    @Override
    public String showMenu() {
        return "Admin Menu:\n 1. Manage Books\n 2. Manage Users\n 3. View Reports";
    }
}
