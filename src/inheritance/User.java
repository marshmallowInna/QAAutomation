package inheritance;

public class User extends Student {
    private String password;
    private String email;

    public User() {
    }

    public User(String name, String gender, String address, String universityName, int credits, String password, String email) {
        super(name, gender, address, universityName, credits);
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void greeting(){
        System.out.println(" Welcome and Hello");
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void study() {
        super.study();
    }

  /*  @Override
    public void nameYear() {
        super.nameYear();
    }*/

    @Override
    public int activity(int m) {
        return super.activity(m);
    }
}
