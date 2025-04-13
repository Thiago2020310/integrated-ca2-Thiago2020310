/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thiago2020310.librarymanagement;

/**
 *
 * @author Thiago
 * 
 * Member subclass from User. The role is set by default as "Member" since it never going to change. 
 * Menu overrides the User showMenu method with valid options for the members.
 */
public class Member extends User {
    public Member(int id, String name, String email, String password) {
        super(id, name, email, password, "Member");
    }
    
    @Override
    public String showMenu() {
        return "Member Menu: \n1. Borrow Book \n2. Return Book \n3. View Issued Books";
    }
}
