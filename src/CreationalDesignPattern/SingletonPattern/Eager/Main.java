package CreationalDesignPattern.SingletonPattern.Eager;

public class Main {
    public static void main(String[] args) {
        DBconnection connectionobj = DBconnection.getInstance();
    }
}
