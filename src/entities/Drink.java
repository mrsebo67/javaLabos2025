package entities;

/**
 * Food item that represents liquid
 */
public non-sealed class Drink extends MenuItem implements Macros{

    private int volume;
    private int kcalPer100ml;

    /**
     *
     * @param id
     * @param name
     * @param description
     * @param price
     * @param volume
     * @param kcalPer100ml
     */
    public Drink(int id, String name, String description, double price, int volume, int kcalPer100ml) {
        super(id, name, description, price);

    }

    @Override
    public int getCaloricValue() {
        return volume * kcalPer100ml;
    }

}
