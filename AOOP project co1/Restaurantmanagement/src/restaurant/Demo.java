package restaurant;

public class Demo {
    public static void main(String[] args) {
        // Create some dishes
        Dish dish1 = new Dish("Pasta", 12.5);
        Dish dish2 = new Dish("Pizza", 15.0);
        Dish dish3 = new Dish("Salad", 8.0);

        // Create a menu with the dishes
        Menu menu = new Menu(dish1, dish2, dish3);

        // Print initial menu
        System.out.println("Initial Menu:");
        System.out.println("Dish 1: " + menu.getDish1().getName() + " - $" + menu.getDish1().getPrice());
        System.out.println("Dish 2: " + menu.getDish2().getName() + " - $" + menu.getDish2().getPrice());
        System.out.println("Dish 3: " + menu.getDish3().getName() + " - $" + menu.getDish3().getPrice());

        // Update a dish in the menu
        Dish newDish = new Dish("Soup", 7.0);
        menu.updateDish(dish1, newDish);

        // Print updated menu
        System.out.println("\nUpdated Menu:");
        System.out.println("Dish 1: " + menu.getDish1().getName() + " - $" + menu.getDish1().getPrice());
        System.out.println("Dish 2: " + menu.getDish2().getName() + " - $" + menu.getDish2().getPrice());
        System.out.println("Dish 3: " + menu.getDish3().getName() + " - $" + menu.getDish3().getPrice());

        // Create an order
        Order order = new Order(menu.getDish2(), 3);

        // Print order details
        System.out.println("\nOrder Details:");
        System.out.println("Ordered Dish: " + order.getDish().getName());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Total Cost: $" + order.calculateTotal());

        // Create a staff member
        Staff staff = new Staff("John Doe", "Waiter", 30000);

        // Print staff details
        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Role: " + staff.getRole());
        System.out.println("Salary: $" + staff.getSalary());

        // Update staff role and salary
        staff.setRole("Manager");
        staff.setSalary(35000);

        // Print updated staff details
        System.out.println("\nUpdated Staff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Role: " + staff.getRole());
        System.out.println("Salary: $" + staff.getSalary());
    }
}
