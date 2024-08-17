package restaurant;

public class Menu {
    private Dish dish1;
    private Dish dish2;
    private Dish dish3;

    public Menu(Dish dish1, Dish dish2, Dish dish3) {
        this.dish1 = dish1;
        this.dish2 = dish2;
        this.dish3 = dish3;
    }

    public Dish getDish1() {
        return dish1;
    }

    public Dish getDish2() {
        return dish2;
    }

    public Dish getDish3() {
        return dish3;
    }

    public void updateDish(Dish oldDish, Dish newDish) {
        if (oldDish.equals(dish1)) {
            dish1 = newDish;
        } else if (oldDish.equals(dish2)) {
            dish2 = newDish;
        } else if (oldDish.equals(dish3)) {
            dish3 = newDish;
        } else {
            throw new IllegalArgumentException("Dish not found in menu");
        }
    }
}
