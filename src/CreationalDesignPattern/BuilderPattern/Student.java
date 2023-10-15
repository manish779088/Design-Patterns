package CreationalDesignPattern.BuilderPattern;

public class Student {
    String name;
    int age;
    double psp;
    String universtityName;
    String batch;
    long id;
    int gradyear;
    String phonenumber;

//    Student(String name,int age,double psp,String universtityName,..){
//
//    }

    Student(Builder builder){
        if(builder.getGradyear() > 2022){
            throw new IllegalArgumentException("Grad year cannot be greater than 2022");
        }
        this.gradyear=builder.getGradyear();
        this.age=builder.getAge();
        this.name=builder.getName();
    }
}
