package entities;

/**
 * Food item that represents solids
 */
public non-sealed class Food extends MenuItem implements Macros {

    private final int weight;
    private final int kcalPer100g;

    /**
     *
     * @param id
     * @param name
     * @param description
     * @param price
     * @param weight
     * @param kcalPer100g
     */
    public Food(int id, String name, String description, double price, int weight, int kcalPer100g) {
        super(id, name, description, price);
        this.weight = weight;
        this.kcalPer100g = kcalPer100g;

    }

    @Override
    public int getCaloricValue() {
        return kcalPer100g * weight;
    }
}
