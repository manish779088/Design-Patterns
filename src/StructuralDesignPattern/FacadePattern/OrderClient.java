package StructuralDesignPattern.FacadePattern;

public class OrderClient {
    public static void main(String[] args) {
        OrderFacade orderFacade= new OrderFacade();
        orderFacade.createOrder();
    }
}
