package StructuralDesignPattern.Adapter;

public interface BankApiAdapter {

        double getbalance(String accountnumbrt);
        boolean sendMoney(String fromaccount, String toaccount, double amount);
}
