package StructuralDesignPattern.Adapter;

import StructuralDesignPattern.Adapter.BankApiAdapter;
import StructuralDesignPattern.Adapter.Thirdparty.IciciBank;

public class ICICiApiAdapter implements BankApiAdapter {
    private IciciBank icicbank = new IciciBank();
    @Override
    public double getbalance(String accountnumbrt) {
        //return icicbank.getbalacne;
        return 0;
    }

    @Override
    public boolean sendMoney(String fromaccount, String toaccount, double amount) {
        //icicbank.sendmoney
        return false;
    }
}
