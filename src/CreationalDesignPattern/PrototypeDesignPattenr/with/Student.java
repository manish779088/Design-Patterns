package CreationalDesignPattern.PrototypeDesignPattenr.with;

public class Student implements Prototype {
    int age;
    String rollnumber;
    String name;
    public Student(){
    }
    Student(int age,String rollnumber,String name){
        this.age=age;
        this.rollnumber=rollnumber;
        this.name=name;
    }
    @Override
    public Prototype clone(){
        return new Student(age,rollnumber,name);
    }
}
