package education.cursor;

import java.util.Scanner;

public class Input {

    private static String login;
    private static String password;
    private static String confirmPassword;

    static Scanner in = new Scanner(System.in);

    public static void logIn() {
        System.out.print("Login: ");
        login = in.nextLine();

        System.out.print("\nPassword: ");
        password = in.nextLine();

        System.out.print("\nConfirm password: ");
        confirmPassword = in.nextLine();

        try {
            Verify.verifier(Input.getLogin(), Input.getPassword(), Input.getConfirmPassword());
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            System.out.println("\nEach string may contain only alphanumeric characters and underscores. " +
                    "Max 20 chars allowed, including at least one letter, number, and underscore.");
        }
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public static String getConfirmPassword() {
        return confirmPassword;
    }
}
