package inheritance;

public class Student extends Person {
    // Uncomment, fix and expand the class

    private String universityName;
    private int credits;

    public Student() {

    }

    public Student(String name, String address, String universityName, int credits) {
        super(name, address);
        this.universityName = " KPI";
        this.credits = 1000;
    }

    public String getUniversityName() {
        return universityName ;
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
    public void work(double a, double b) {
        System.out.println("Student earn money");
    }

    public void study() {
        credits += 1;
        System.out.println(" student credits " + this.getCredits());
    }
    public void  nameYear(){

        System.out.println(" student nameYear :" );

    }
    public int activity(int m){
        System.out.println(" student activity :");
        if (m > 5) {
            System.out.println("Nice activity");
        } else {
            System.out.println("You shoud study better");
        }
        return m;
    }
}


