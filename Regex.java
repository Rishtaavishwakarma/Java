
import java.util.regex.*;

public class Regex {

    public static void main(String[] args) {

        // 1. Basic Pattern Matching
        System.out.println("1. Basic Pattern Matching:");
        String text = "I love Java and JavaScript.";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("  Found at index: " + matcher.start());
        }

        // 2. Find All Digits
        System.out.println("\n2. Find All Digits:");
        text = "My number is 9876543210 and my friend's is 12345.";
        pattern = Pattern.compile("\\d+"); // \d = digit, + = one or more
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("  Found number: " + matcher.group());
        }

        // 3. Email Validation
        System.out.println("\n3. Email Validation:");
        String email = "test@example.com";
        boolean isEmailValid = email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
        System.out.println("  Is valid: " + isEmailValid);

        // 4. Mobile Number Validation (10-digit starting with 6-9)
        System.out.println("\n4. Mobile Number Validation:");
        String mobile = "9876543210";
        boolean isMobileValid = mobile.matches("^[6-9]\\d{9}$");
        System.out.println("  Is valid: " + isMobileValid);

        // 5. Password Validation (at least 1 digit, 1 uppercase, 6+ characters)
        System.out.println("\n5. Password Validation:");
        String password = "Passw0rd";
        boolean isPasswordValid = password.matches("^(?=.*[A-Z])(?=.*\\d).{6,}$");
        System.out.println("  Is valid: " + isPasswordValid);

        // 6. Replace All Digits with *
        System.out.println("\n6. Replace Digits:");
        String masked = text.replaceAll("\\d", "*");
        System.out.println("  Masked Text: " + masked);
    }
}
