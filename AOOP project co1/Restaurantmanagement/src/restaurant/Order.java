package restaurant;

public class Order {
    private Dish dish;
    private int quantity;

    public Order(Dish dish, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        this.dish = dish;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return dish.getPrice() * quantity;
    }

    public Dish getDish() {
        return dish;
    }

    public int getQuantity() {
        return quantity;
    }
}
