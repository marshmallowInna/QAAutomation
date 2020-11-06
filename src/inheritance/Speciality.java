package inheritance;

public class Speciality extends Student {
    private String technical;


    public Speciality() {
    }

    public Speciality(String name, String gender, String address, String universityName, int credits, String technical) {
        super(name, gender, address, universityName, credits);
        this.technical = technical;
    }

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "technical='" + technical + '\'' +
                "} " + super.toString();
    }


    @Override
    public void study() {
        super.study();
    }


    @Override
    public int activity(int m) {
        return super.activity(m);
    }

    @Override
    public void work() {
        super.work();
    }

    public void description(){
        System.out.println(" speciality description : ");
    }
    public void rating(){
        System.out.println(" speciality rating : ");
    }
    public void nameCity(){
        System.out.println(" speciality nameCity");
    }

}
