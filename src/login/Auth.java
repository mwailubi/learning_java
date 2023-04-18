package login;

import java.util.Objects;

public class Auth {

    public String username;
    public String password;

    public Auth(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        return Objects.equals(this.username, "eric") && Objects.equals(this.password, "test");
    }
}
