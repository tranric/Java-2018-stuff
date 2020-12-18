package Application.Discount;

public abstract class DiscountPolicy {
    public abstract double computeDiscount(int count, double itemCost);
}
