package com.scm;

public class ShoppingFacade {
    private InventoryService inventoryService;
    private NotificationService notificationService;
    private ShippingService shippingService;
    private PaymentService paymentService;

    ShoppingFacade(){
        this.inventoryService = new InventoryService();
        this.notificationService = new NotificationService();
        this.shippingService = new ShippingService();
        this.paymentService = new PaymentService();
    }

    public void order(String productId,int amount){
        if(inventoryService.checkStock(productId)){
            notificationService.sendNotification("Product ordered");
            shippingService.shipProject("Order shipped");
            paymentService.sendPayment(100);
        }
    }
}
