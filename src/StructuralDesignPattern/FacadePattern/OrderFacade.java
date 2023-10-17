package StructuralDesignPattern.FacadePattern;

public class OrderFacade {
    ProductDAO productDAO;
    Invoice invoice;
    Payment payment;
    SendNotification notification;

    public OrderFacade(){
        productDAO= new ProductDAO();
        invoice = new Invoice();
        payment = new Payment();
       notification= new SendNotification();
    }

    public void  createOrder(){
        Product product= productDAO.getProduct(122);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();

    }
}
