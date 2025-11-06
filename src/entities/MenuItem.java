package entities;

/**
 * Represents a generic item available in a restaurant's menu.
 * <p>
 * This abstract class should be extended by specific item types
 * (e.g., {@code Drink}, {@code Meal}, {@code Dessert}).
 * </p>
 */

public abstract class MenuItem {

    private int menuItemId;
    private String menuItemName;
    private String menuItemDescription;
    private double menuItemPrice;

    /**
     * Constructs a {@code MenuItem}.
     *
     * @param menuItemId    Unique identifier of the item.
     * @param menuItemName  Name of the item.
     * @param menuItemDescription Description of the item.
     * @param menuItemPrice Price of the item.
     */
    public MenuItem(int menuItemId, String menuItemName, String menuItemDescription, double menuItemPrice) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.menuItemDescription = menuItemDescription;
        this.menuItemPrice = menuItemPrice;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getMenuItemDescription() {
        return menuItemDescription;
    }

    public void setMenuItemDescription(String menuItemDescription) {
        this.menuItemDescription = menuItemDescription;
    }

    public double getMenuItemPrice() {
        return menuItemPrice;
    }

    public void setMenuItemPrice(double menuItemPrice) {
        this.menuItemPrice = menuItemPrice;
    }
}
