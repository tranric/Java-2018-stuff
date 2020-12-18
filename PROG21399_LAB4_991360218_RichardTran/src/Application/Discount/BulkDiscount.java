package Application.Discount;

public class BulkDiscount extends DiscountPolicy {
    private double minimum;
    private double percent;

    public BulkDiscount(double minimum, double percent) {
        this.minimum = minimum;
        this.percent = percent;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        if (count >= minimum){
            // ie. 20% == .2 or 21% == .21 and 100% is 1.0
            return (itemCost*count)*percent;
        }
        return 0;
    }
}
