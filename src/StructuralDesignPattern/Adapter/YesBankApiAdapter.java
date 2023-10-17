package StructuralDesignPattern.Adapter;

import StructuralDesignPattern.Adapter.Thirdparty.YesBank;

public class YesBankApiAdapter implements BankApiAdapter{
    private YesBank yesBank = new YesBank();
    @Override
    public double getbalance(String accountnumbrt) {
        //yesbank.getbalance
        return 0;
    }

    @Override
    public boolean sendMoney(String fromaccount, String toaccount, double amount) {
        //yesbank.sendMoney
        return false;
    }
}
