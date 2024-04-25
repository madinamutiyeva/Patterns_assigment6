package Decorator_Pattern;

public class PepperoniTopping extends PizzaDecorator {
    private static final double PEPPERONI_PRICE = 2.0;

    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + PEPPERONI_PRICE;
    }
}