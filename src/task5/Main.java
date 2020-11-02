package task5;

public class Main {
    public static void main(String[] args) {
        User user = new User ("Inna", 25, 53,"woman");
        user.getAge();
        user.setAge(20);
        user.getGender();

        User user2 = new User("Anton", 26,75,"man");
        System.out.println(user);
        System.out.println(user2);
    }

}

