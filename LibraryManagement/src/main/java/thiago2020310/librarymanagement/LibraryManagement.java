/*

*/

package thiago2020310.librarymanagement;

/**
 *
 * @author Thiago
 *
 */
public class LibraryManagement {

    public static void main(String[] args) {
        //Creates Admin and Member objects using subclasses.
        User admin = new Admin(1, "Thiago", "thiago@gmail.com", "admin");
        User member = new Member(2, "Luiza", "luiza@gmail.com", "member");

        //Displaying menus
        System.out.println("Welcome, " + admin.getName() + "(admin)");
        System.out.println(admin.showMenu());
        
        System.out.println("Welcome, " + member.getName() + "(member)");
        System.out.println(member.showMenu());
        
    }
}
