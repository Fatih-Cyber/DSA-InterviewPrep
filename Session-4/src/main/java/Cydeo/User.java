package Cydeo;

public class User {
    String name;
    String email;
    User next;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
