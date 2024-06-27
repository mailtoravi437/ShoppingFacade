package com.scm;

public class InventoryService {
    public boolean checkStock(String productId){
        System.out.println("Checking Product -:"+productId);
        return true;
    }

    public void updateStock(String product){
        System.out.println("Updating Stock -:"+product);
    }
}
