package Inheritance;

// 상속 p59

public class Coupon {

    private int discountAmount;

    public Coupon(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public int calculateDiscountedPrice(int price) {
        if (price < discountAmount) {
            return 0;
        }
        return price - discountAmount;
    }
}

// 쿠폰을 확장해서 새로운 쿠폰 기능을 제공하기.

class LimitPriceCoupon extends Coupon {
    private int limitPrice;

    public LimitPriceCoupon(int discountAmount, int limitPrice) {
        super(discountAmount);
        this.limitPrice = limitPrice;
    }
    public int getLimitPrice() {
        return limitPrice;
    }

    // 재정의
    @java.lang.Override
    public int calculateDiscountedPrice(int price) {
        if (price < limitPrice) return price;
        return super.calculateDiscountedPrice(price);
    }
}
