package inheritance;

public class Speciality extends Student {
    private String technical;
    private String humanitar;
    private String sociologist;

    public Speciality() {
    }

    public Speciality(String name, String address, String universityName, int credits, String technical, String humanitar, String sociologist) {
        super(name, address, universityName, credits);
        this.technical = technical;
        this.humanitar = humanitar;
        this.sociologist = sociologist;
    }

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    public String getHumanitar() {
        return humanitar;
    }

    public void setHumanitar(String humanitar) {
        this.humanitar = humanitar;
    }

    public String getSociologist() {
        return sociologist;
    }

    public void setSociologist(String sociologist) {
        this.sociologist = sociologist;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "technical='" + technical + '\'' +
                ", humanitar='" + humanitar + '\'' +
                ", sociologist='" + sociologist + '\'' +
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

    @Override
    public void nameYear() {
        super.nameYear();
    }

    @Override
    public String activity() {
        super.activity();
        return " Student always active";
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
