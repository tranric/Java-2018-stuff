package Application;

import Application.Discount.BulkDiscount;
import Application.Discount.BuyNItemsGetOneFree;
import Application.Discount.DiscountPolicy;

public class Tester {
    public static void main(String[] args){
    	//BulkDiscount bulky = new BulkDiscount(5, 0.4);
        DiscountPolicy bulk = new BulkDiscount(4, .5); // 50% off for buying 4
        DiscountPolicy bnigof = new BuyNItemsGetOneFree(3);

        // buying 16 of x at $5 each, bulk minimum is 4 and rate is 50% off
        double discountAmount1 = bulk.computeDiscount(16, 5);

        // buying 20 of x at $5 each, every 3rd item is free
        double discountAmount2 = bnigof.computeDiscount(20, 5);

        System.out.println("discounted amount 1: $" + discountAmount1);
        System.out.println("discounted amount 2: $" +  discountAmount2);
    }
}
