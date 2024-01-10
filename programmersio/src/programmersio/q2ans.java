package programmersio;
import java.util.Scanner;
import java.util.regex.Pattern;

public class q2ans {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        String regex = "^[a-zA-Z0-9@$#]{6,12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}

