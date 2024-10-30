import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        User user = new User("Pavel", "12345678");

        while (true) {
            System.out.print("Input login: ");
            String log = in.nextLine();
            System.out.print("Input password: ");
            String pass = in.nextLine();

            if (user.getLogin().equals(log) && user.getPassword().equals(pass)) {
                System.out.println("Successfully logged in!");
                break;
            }
            else {
                System.out.println("Try again");
            }
        }
    }
}

