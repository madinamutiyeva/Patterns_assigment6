package Decorator_Pattern;

public interface Pizza {
    double getPrice();
}

class BasicPizza implements Pizza {
    private double price;

    public BasicPizza(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}