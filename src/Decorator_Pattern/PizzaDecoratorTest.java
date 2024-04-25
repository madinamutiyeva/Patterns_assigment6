package Decorator_Pattern;

public class PizzaDecoratorTest {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza(21.0);

        Pizza pepperoniPizza = new PepperoniTopping(basicPizza);

        Pizza deluxePizza = new MushroomTopping(pepperoniPizza);

        double totalPrice = deluxePizza.getPrice();

        System.out.println("The total price of the deluxe pizza is: $" + totalPrice);
    }
}