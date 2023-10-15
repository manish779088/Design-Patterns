package CreationalDesignPattern.SingletonPattern.Lazy;

public class DBconnection {
    private static DBconnection conobject;
    private DBconnection(){}

    public static DBconnection getInstance(){
        if(conobject==null){
            conobject= new DBconnection();
        }
        return conobject;
    }
    // now we are creating object only when i require but problem here is this is not thread safe
}
