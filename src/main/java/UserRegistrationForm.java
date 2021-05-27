import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationForm registrationform = new UserRegistrationForm();
        boolean isValidName;

        System.out.println("--++-- User Registration --++--");
        System.out.println("Enter your Details below:");

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        isValidName = registrationform.usersValidFirstName(firstName);
        System.out.println(isValidName);

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        isValidName = registrationform.usersValidLastName(lastName);
        System.out.println(isValidName);

        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        boolean isValidEmail = registrationform.usersValidEmail(email);
        System.out.println(isValidEmail);

    }

    private static boolean usersValidFirstName(String firstName){
        String regEx = "^[A-Z][a-z]{3,16}";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    private static boolean usersValidLastName(String lastName){
        String regEx = "^[A-Z][a-z]{3,16}";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    private static boolean usersValidEmail(String email){
        String regEx = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}