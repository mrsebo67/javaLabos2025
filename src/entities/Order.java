package entities;

import java.time.LocalDateTime;

/**
 * Represents whole ordere including all parties
 */
public class Order implements IsDone {

    private int orderId;
    private int customerId;
    private int restaurantId;
    private MenuItem[] menuItems;
    private double price;
    private int orderTime;
    private boolean isDone;

    /**
     *
     * @param orderId
     * @param customerId
     * @param restaurantId
     * @param menuItems
     * @param price
     * @param orderTime
     */
    public Order(int orderId, int customerId, int restaurantId, MenuItem[] menuItems, double price, int orderTime) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.menuItems = menuItems;
        this.price = price;
        this.orderTime = orderTime;
        this.isDone = false;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(int orderTime) {
        this.orderTime = orderTime;
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

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MenuItem getCheapestMenuItem() {

        MenuItem cheapest = this.menuItems[0];

        for (int i = 1; i < this.menuItems.length; i++) {

            if(this.menuItems[i].getMenuItemPrice()<cheapest.getMenuItemPrice()) {
                cheapest = this.menuItems[i];
            }
        }
        return cheapest;

    }

    public MenuItem getPriciestMenuItem() {
        MenuItem priciest = this.menuItems[0];

        for (int i = 1; i < this.menuItems.length; i++) {
            if(this.menuItems[i].getMenuItemPrice()>priciest.getMenuItemPrice()) {
                priciest = this.menuItems[i];
            }
        }
        return priciest;
    }

    @Override
    public void toggleIsDone() {
        this.isDone = !this.isDone;

    }
}
