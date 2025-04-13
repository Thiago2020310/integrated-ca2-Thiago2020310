/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thiago2020310.librarymanagement;

/**
 *
 * @author Thiago
 */
public class Member extends User {
    public Member(int id, String name, String email, String password) {
        super(id, name, email, password, "Member");
    }
    
    @Override
    public String showMenu() {
        return "Menu: \n1. Borrow Book \n2. Return Book \n3. View Issued Books";
    }
}
