package CreationalDesignPattern.PrototypeDesignPattenr.with;

import CreationalDesignPattern.PrototypeDesignPattenr.with.Student;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(30,"30","manish");
        Student cloneobj = (Student) obj.clone();
        //now in cloneobj we can modify anything
    }
}
