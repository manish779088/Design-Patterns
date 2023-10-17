package StructuralDesignPattern.Adapter;

public class Phonepe {
    private BankApiAdapter bankApiAdapter;

    public Phonepe(BankApiAdapter bankApiAdapter){
        this.bankApiAdapter=bankApiAdapter;
    }

    double doSomething() throws InterruptedException{
      double currentbalance  = bankApiAdapter.getbalance("accountnumber");
      return currentbalance;
    }

}
