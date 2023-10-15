package CreationalDesignPattern.BuilderPattern;

public class Builder {
    private String name;
    private int age;
    private double psp;
    private String universtityName;
    private String batch;
    private long id;
    private int gradyear;
    private String phonenumber;
// this builder we can use in director to create object 
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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUniverstityName() {
        return universtityName;
    }

    public void setUniverstityName(String universtityName) {
        this.universtityName = universtityName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGradyear() {
        return gradyear;
    }

    public void setGradyear(int gradyear) {
        this.gradyear = gradyear;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
