package inheritance;

public  class Professor extends Person {

    // Uncomment, fix and expand the class
    private String universityName;
    private String degree;
    private String course;


    public Professor() {

    }

    public Professor(String name, String address, String universityName, String degree, String course) {
        super(name = "Kolya", address = "Ahmatova st.5");
        this.universityName = universityName;
        this.degree = degree;
        this.course = course;
        System.out.println(" Professor student: " + getName() + getAddress());
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
     void studentGroup(){
        System.out.println(" Student group number ");
    }
    void numberCourse(){
        System.out.println(" Student course number ");

    }

    @Override
    public String toString() {
        return "Professor{" +
                "universityName='" + universityName + '\'' +
                ", degree='" + degree + '\'' +
                ", course='" + course + '\'' +
                "} " + super.toString();
    }

    @Override
    public void work(double a, double b) {
        System.out.println(" Proffesor earn money");
    }
}


