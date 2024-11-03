import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        User user = new User("Pavel", "12345678", 100.0); // Инициируем пользователю начальный баланс

        while (true) {
            System.out.print("Input login: ");
            String log = in.nextLine();
            System.out.print("Input password: ");
            String pass = in.nextLine();

            if (user.authorize(log, pass)) {
                System.out.println("Successfully logged in!");

                user.getAccount().deposit(50.0);
                System.out.println("Current balance: " + user.getAccount().getBalance());
                user.getAccount().withdraw(20.0);
                System.out.println("Current balance: " + user.getAccount().getBalance());
                break;
            } else {
                System.out.println("Try again");
            }
        }

        in.close();
    }
}
