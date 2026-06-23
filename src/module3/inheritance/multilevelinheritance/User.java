package module3.inheritance.multilevelinheritance;

public class User extends BaseEntity {

    private String username;
    private String password;

    @Override
    public void validate() {
        if (this.username != null && this.password != null) {
            System.out.println("User details are valid...");
        }
    }

    public boolean login() {
        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
