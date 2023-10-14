package CreationalDesignPattern.PrototypeDesignPattenr.without;

public class Main{
    public static void main(String[] args) {
        Student obj = new Student(26,"23","manish");

        //creating clone object
        Student cloneobj = new Student();
        cloneobj.name=obj.name;
        cloneobj.age=obj.age;
        cloneobj.rollnumber="34";
        //here problem is we need to add fix value to clone object ,what if 100 fix attributes
        //client should have access of original attributes what if some attributes is private

    }
}
