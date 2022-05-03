import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

class Regex {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        System.out.println("Input: ");
        String input = reader.readLine();

        // Define regex pattern for email
        String pattern = "\\w+\\.\\w+@hf-ict\\.(ch|info)";

        // Define regex pattern for password
        // String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";

        // Match the pattern
        if (Pattern.matches(pattern, input)) {
            System.out.println("valid");
        } else {
            System.out.println("NOT valid");
        }
    }
}
