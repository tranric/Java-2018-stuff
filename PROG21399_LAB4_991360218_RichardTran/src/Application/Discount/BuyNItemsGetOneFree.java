package Application.Discount;

public class BuyNItemsGetOneFree extends DiscountPolicy {
    private int n;

    public BuyNItemsGetOneFree(int x) {
        this.n = x;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        if (count >= n && n > 0) {
            int times = count / n;
            return itemCost*times;
        }
        return 0;
    }
}
