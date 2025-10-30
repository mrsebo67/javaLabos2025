package entities;

import java.awt.*;

public class Restaurant {

    private int restaurantId;
    private String restaurantName;
    private Address restaurantAddress;
    private MenuItem[]  menuItems;

    public Restaurant(int restaurantId, String restaurantName, Address restaurantAddress, MenuItem[] menuItems) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.menuItems = menuItems;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Address getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(Address restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
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
}
