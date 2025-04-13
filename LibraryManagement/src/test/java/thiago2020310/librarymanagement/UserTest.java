/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package thiago2020310.librarymanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Thiago
 */
public class UserTest {
    
    public UserTest() {
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
    }

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
    }

    /**
     * Test of setRole method, of class User.
     */
    @Test
    public void testSetRole() {
    }

    /**
     * Test of showMenu method, of class User.
     */
    @Test
    public void testShowMenu() {
    }

    public class UserImpl extends User {

        public UserImpl() {
            super(0, "", "", "", "");
        }

        public String showMenu() {
            return "";
        }
    }
    
    
    //Test creating an admin object using User and Admin subclasses.
    @Test
    public void testAdminCreation() {
        Admin admin = new Admin(1, "Thiago", "thiago@gmail.com", "admin123");

        assertEquals(1, admin.getId());
        assertEquals("Thiago", admin.getName());
        assertEquals("thiago@gmail.com", admin.getEmail());
        assertEquals("admin123", admin.getPassword());
        assertEquals("Admin", admin.getRole());
        
        assertEquals("Admin Menu:\n 1. Manage Books\n 2. Manage Users\n 3. View Reports", admin.showMenu());
        
    }
    
}
