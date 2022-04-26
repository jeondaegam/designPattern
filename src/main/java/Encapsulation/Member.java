package Encapsulation;

public class Member {

    private Date expiryDate;
    private boolean male;
    private static final long Day30 = 1000 * 60 * 60 * 24 * 30;

    public boolean isExpired() {
        if (male) {
            return expiryDate != null && expiryDate.getDate() < System.currentTimeMillis();
        }
        return expiryDate != null && expiryDate.getDate() < System.currentTimeMillis() - Day30;
    }


    public Date getExpiryDate() {
        return expiryDate;
    }
}
