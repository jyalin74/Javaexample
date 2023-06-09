package java0425;

public class CustomerVip extends Customer {
    private int agentId;
    double saleRatio;
    public CustomerVip() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    public CustomerVip(int customerId, String customerName, int agentId){
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
    public int getAgneId() {
        return agentId;
    }
}
