package education.cursor;

import java.util.Scanner;

public class Input {

    static Scanner in = new Scanner(System.in);

    public static void logIn() {
        System.out.print("Login: ");
        String login = in.next();

        System.out.print("\nPassword: ");
        String password = in.next();

        System.out.print("\nConfirm password: ");
        String confirmPassword = in.next();

        try {
            Verify.verifier(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            System.out.println("\nEach string may contain only alphanumeric characters and underscores. " +
                    "Max 20 chars allowed, including at least one letter, number, and underscore.");
        }
    }
}