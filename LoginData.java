import java.util.HashMap;
import java.util.Scanner;

public class LoginData {
    private HashMap<String, String> login;

    public LoginData() {
        this.login = new HashMap<>();
    }

    public void setLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter username: ");
        String userName = scanner.nextLine();
        System.out.print("Please enter password: ");
        String passWord = scanner.nextLine();
        login.put(userName, passWord);
    }

    public boolean isInHashMap(String userName, String passWord) {
        return login.containsKey(userName) && login.get(userName).equals(passWord);
    }

    public void loginProcess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        if (isInHashMap(inputUsername, inputPassword)) {
            System.out.println("You are logged in.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}