package module3.inheritance.multilevelinheritance;

import java.util.Scanner;

public class MultiLevelInheritance {

    private static boolean processLogin(User user, String password) {
        if (user.getPassword().equals(password)) {
            return user.login();
        }

        return false;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setUsername("abcd@example.com");
        manager.setPassword("1234");

        manager.save();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password below: ");
        String password = sc.nextLine();

        boolean login = processLogin(manager, password);

        if (login) {
            System.out.println("User is successfully logged In");
        } else {
            System.out.println("Incorrect Credentials");
        }
    }
}
