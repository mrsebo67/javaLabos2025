package entities;

/**
 * Represents delivery of item
 */
public class Delivery {

    private int deliveryId;
    private int orderId;
    private String deliveryCompanyName;
    private int deliveryTime;
    private double deliveryPrice;

    /**
     *
     * @param deliveryId
     * @param orderId
     * @param deliveryCompanyName
     * @param deliveryTime
     * @param deliveryPrice
     */
    public Delivery(int deliveryId, int orderId, String deliveryCompanyName, int deliveryTime, double deliveryPrice) {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.deliveryCompanyName = deliveryCompanyName;
        this.deliveryTime = deliveryTime;
        this.deliveryPrice = deliveryPrice;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
}
