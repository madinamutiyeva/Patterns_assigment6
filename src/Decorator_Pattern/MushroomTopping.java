package Decorator_Pattern;

public class MushroomTopping extends PizzaDecorator {
    private static final double MUSHROOM_PRICE = 1.5;

    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + MUSHROOM_PRICE;
    }
}