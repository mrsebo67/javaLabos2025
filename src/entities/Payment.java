package entities;

import java.time.LocalDateTime;

/**
 * Represents transaction between all three parties
 */
public class Payment {

    private int paymentId;
    private int orderId;
    private int customerId;
    private int restaurantId;
    private double paymentAmount;
    private LocalDateTime paymentDate;

    /**
     *
     * @param paymentId
     * @param orderId
     * @param customerId
     * @param restaurantId
     * @param paymentAmount
     * @param paymentDate
     */
    public Payment(int paymentId, int orderId, int customerId, int restaurantId, double paymentAmount, LocalDateTime paymentDate) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
