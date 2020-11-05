package inheritance;

public class Student extends Person {
    // Uncomment, fix and expand the class

    private String universityName;
    private int credits;

    public Student() {

    }

    public Student(String name, String address, String universityName, int credits) {
        super(name, address);
        this.universityName = universityName;
        this.credits = credits;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "universityName='" + universityName + '\'' +
                ", credits=" + credits +
                "} " + super.toString();
    }

    @Override
    public void work() {
        System.out.println(" working student");
    }

    public void study() {
        credits += 1;
        System.out.println(" student credits ");
    }
    public void  nameYear(){

        System.out.println(" student nameYear :");
    }
    public String activity(){
        System.out.println(" student activity :");
        return null;
    }
}

