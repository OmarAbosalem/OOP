import java.util.Scanner;


class User {


protected String username;


protected String password;


public User(String username, String password) {


this.username = username;


this.password = password;


}


public boolean authenticate(String inputUsername, String inputPassword) {


return this.username.equals(inputUsername) && this.password.equals(inputPassword);


}


}


class Admin extends User {


public Admin(String username, String password) {


super(username, password);


}


}


public class Main {


public static void main(String[] args) {


Admin admin = new Admin("admin", "bestproject");


Scanner scanner = new Scanner(System.in);


System.out.print("Enter username: ");


String inputUsername = scanner.nextLine();


System.out.print("Enter password: ");


String inputPassword = scanner.nextLine();


if (admin.authenticate(inputUsername, inputPassword)) {


System.out.println("Welcome Admin ,Logged in ");


} else {


System.out.println("Sorry, try again");


}


}


}