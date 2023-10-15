package CreationalDesignPattern.SingletonPattern.DoubleLocking;

public class DBconnection {
    private static DBconnection conObject;
    private DBconnection(){
    }

    public static DBconnection getInstance(){
        if(conObject==null){
            synchronized (DBconnection.class){
                if(conObject==null){
                    conObject= new DBconnection();
                }
            }
        }
        return conObject;
    }
    // doublelocking more like anti-pattern
    //The double checked locking is now considered an antipattern and its utility has largely passed away as JVM startup times have sped up over the years.

}
