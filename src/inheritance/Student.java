package inheritance;

public class Student extends Person {
    // Uncomment, fix and expand the class

    private String universityName;
    private int credits ;

    public Student() {

    }

    public Student(String name, String gender, String address, String universityName, int credits) {
        super(name, gender, address);
        this.universityName = universityName;
        this.credits = credits;
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
    public void work() {
        System.out.println("Student earn money");
    }

    public void study() {
        credits += 1;
        System.out.println(" student credits " + this.getCredits());
    }
    public final void  nameYear(){  // не будет переопределяться
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


