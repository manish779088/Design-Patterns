package CreationalDesignPattern.BuilderPattern.Productionbuilder;

public class Client {
    public static void main(String[] args) {
        //        Builder builder = Student.getBuilder();
//        builder.setAge(12);
//        builder.setName("Naman");
//        builder.setGradYear(2023);
//        Student st = builder.build();

//        Student st = new Student(null);

        Student st1 = Student.getBuilder().setAge(21).setName("Manish").setUniverstityName("Uniname").build();
    }
}
