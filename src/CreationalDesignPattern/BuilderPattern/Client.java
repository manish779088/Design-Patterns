package CreationalDesignPattern.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(21);
        builder.setName("Manish");
        builder.setGradyear(2023);

        Student st = new Student(builder);
        System.out.println("Debug");
    }
}
