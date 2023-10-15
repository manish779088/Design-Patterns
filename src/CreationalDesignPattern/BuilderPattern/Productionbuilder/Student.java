package CreationalDesignPattern.BuilderPattern.Productionbuilder;

import CreationalDesignPattern.AbstractFactoryPattern.Bike;
import CreationalDesignPattern.BuilderPattern.Builder;

public class Student {
    String name;
    int age;
    double psp;
    String universtityName;
    String batch;
    long id;
    int gradyear;
    String phonenumber;

    public static Builder getBuilder(){
        return new Builder(); // now we to make builder class static
    }
//    Student(String name,int age,double psp,String universtityName,..){
//
//    }
   private Student(Builder builder){
        //if(builder.getGradyear() > 2022){
          // throw new IllegalArgumentException("Grad year cannot be greater than 2022");
        //}
        // above validation we can use in builder build method and make this constructor private so
       // we can use builder to create this method
        this.gradyear=builder.getGradyear();
        this.age=builder.getAge();
        this.name=builder.getName();
    }

    static class Builder {
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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniverstityName() {
            return universtityName;
        }

        public Builder setUniverstityName(String universtityName) {
            this.universtityName = universtityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradyear() {
            return gradyear;
        }

        public Builder setGradyear(int gradyear) {
            this.gradyear = gradyear;
            return this;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public Builder setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public Student build(){
            // validation starts
            if(getGradyear()>2022){
                throw new IllegalArgumentException("Grad year cannot be greater than 2022");
            }
            return new Student(this);
        }
    }
}
