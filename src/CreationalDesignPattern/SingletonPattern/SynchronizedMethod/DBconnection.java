package CreationalDesignPattern.SingletonPattern.SynchronizedMethod;

public class DBconnection {
    private static DBconnection conobject;
    private DBconnection(){

    }

    synchronized public static DBconnection getInstance(){
        if(conobject==null){
            conobject= new DBconnection();
        }
        return conobject;
    }
    // here this is thread safe but operation is costly if we have so many thread then we to wait for each thread
}
