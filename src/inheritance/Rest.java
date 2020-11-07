package inheritance;

public class Rest extends Student {
    private String swim;
    protected String run;

    public Rest() {
    }

    public Rest(String name, String gender, String address, String universityName, int credits, String swim, String run) {
        super(name, gender, address, universityName, credits);
        this.swim = swim;
        this.run = run;
    }

    public String getSwim() {
        return swim;
    }

    public void setSwim(String swim) {
        this.swim = swim;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
    public void dance(){
        System.out.println(" Say hello and rest" + this.swim);

    }

    @Override
    public String toString() {
        return "Rest{" +
                "swim='" + swim + '\'' +
                ", run='" + run + '\'' +
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
