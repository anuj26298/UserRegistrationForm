import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationForm registrationform = new UserRegistrationForm();

        System.out.println("--++-- User Registration --++--");
        System.out.println("Enter your Details below:");

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();

        boolean isValidName = registrationform.usersValidFirstName(firstName);
        System.out.println(isValidName);

    }

    private static boolean usersValidFirstName(String firstName){
        String regEx = "^[A-Z][a-z]{3,16}";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
