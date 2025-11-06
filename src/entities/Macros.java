package entities;

public sealed interface Macros permits Food, Drink{

    int getCaloricValue();

}
