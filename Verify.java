package education.cursor;

public class Verify {

    static String regex = "(?=.*[\\d])(?=.*[\\w])(?=.*[_]).{0,20}[^\\t\\n\\r !#$%&'()*+,./:;<=>?@\\[\\\\`{|}~^-]";


    public static boolean verifier(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

            if (login.matches(regex) && password.matches(regex) && confirmPassword.equals(regex)) {
                return true;
            } else if (!login.matches(regex)) {
                throw new WrongLoginException();
            } else if (!password.matches(regex)) {
                throw new WrongPasswordException();
            } else if (!confirmPassword.equals(password)) {
                throw new WrongPasswordException();
            } else return false;
    }
}