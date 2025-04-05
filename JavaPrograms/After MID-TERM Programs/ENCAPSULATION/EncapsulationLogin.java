class User {
    private String username;
    private String password;

    public void setCredentials(String u, String p) {
        username = u;
        password = p;
    }

    public boolean login(String inputUser, String inputPass) {
        return username.equals(inputUser) && password.equals(inputPass);
    }
}

public class EncapsulationLogin {
    public static void main(String[] args) {
        User user = new User();
        user.setCredentials("admin", "1234");

        System.out.println("Login success: " + user.login("admin", "1234"));
        System.out.println("Login failed: " + user.login("admin", "wrong"));
    }
}
