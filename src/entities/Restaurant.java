package entities;


/**
 * Represents a restaurant in the food delivery system.
 * <p>
 * Uses the Builder pattern to simplify object construction.
 * </p>
 */

public class Restaurant {

    private final int restaurantId;
    private final String restaurantName;
    private final Address restaurantAddress;
    private final MenuItem[] menuItems;


    private Restaurant(Builder builder) {
        this.restaurantId = builder.restaurantId;
        this.restaurantName = builder.restaurantName;
        this.restaurantAddress = builder.restaurantAddress;
        this.menuItems = builder.menuItems;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public Address getRestaurantAddress() {
        return restaurantAddress;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public MenuItem getCheapestMenuItem() {
        if (menuItems == null || menuItems.length == 0) return null;

        MenuItem cheapest = menuItems[0];
        for (int i = 1; i < menuItems.length; i++) {
            if (menuItems[i].getMenuItemPrice() < cheapest.getMenuItemPrice()) {
                cheapest = menuItems[i];
            }
        }
        return cheapest;
    }

    public MenuItem getPriciestMenuItem() {
        if (menuItems == null || menuItems.length == 0) return null;

        MenuItem priciest = menuItems[0];
        for (int i = 1; i < menuItems.length; i++) {
            if (menuItems[i].getMenuItemPrice() > priciest.getMenuItemPrice()) {
                priciest = menuItems[i];
            }
        }
        return priciest;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + restaurantId +
                ", name='" + restaurantName + '\'' +
                ", address=" + restaurantAddress +
                ", menuItems=" + (menuItems != null ? menuItems.length : 0) +
                '}';
    }

    /**
     * Builder class for {@link Restaurant}.
     */
    public static class Builder {
        private int restaurantId;
        private String restaurantName;
        private Address restaurantAddress;
        private MenuItem[] menuItems;

        public Builder restaurantId(int restaurantId) {
            this.restaurantId = restaurantId;
            return this;
        }

        public Builder restaurantName(String restaurantName) {
            this.restaurantName = restaurantName;
            return this;
        }

        public Builder restaurantAddress(Address restaurantAddress) {
            this.restaurantAddress = restaurantAddress;
            return this;
        }

        public Builder menuItems(MenuItem[] menuItems) {
            this.menuItems = menuItems;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }
    }
}