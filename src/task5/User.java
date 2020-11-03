package task5;

public class User {
    //public int id;
    String name = "Inna";
    int age = 25;
    double weight = 53 ;
    String gender = "woman" ;
    private User user;

    public User(int i) {
    }

    public User() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", weight=" + weight +
            ", gender='" + gender + '\'' +
            '}';
    }

  public void testMethod(User user) {
      this.user = user;
      System.out.println(user.toString());
      user.name = "Modified name of user";
      System.out.println(user.toString());
      user.gender = "Modified gender of user";
      System.out.println(user.toString());
  }
}
