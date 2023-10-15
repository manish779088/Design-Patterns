package CreationalDesignPattern.SingletonPattern.Eager;

public class DBconnection {
    private static DBconnection conobject = new DBconnection();
    // in above if we are not using this object still we have to create this everytime
    private DBconnection(){

    }

    public static DBconnection getInstance(){
        if(conobject==null){
            conobject= new DBconnection();
        }
        return conobject;
    }
}
