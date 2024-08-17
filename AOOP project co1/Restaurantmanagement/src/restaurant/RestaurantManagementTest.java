package restaurant;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaurantManagementTest {
    private Dish dish1, dish2, dish3;
    private Menu menu;
    private Staff staff;

    @BeforeEach
    void setUp() {
        dish1 = new Dish("Pasta", 12.5);
        dish2 = new Dish("Pizza", 15.0);
        dish3 = new Dish("Salad", 8.0);
        menu = new Menu(dish1, dish2, dish3);
        staff = new Staff("John Doe", "Waiter", 30000);
    }

    @Test
    void testMenuUpdate() {
        Dish newDish = new Dish("Soup", 7.0);
        menu.updateDish(dish1, newDish);
        assertEquals("Soup", menu.getDish1().getName());
    }

    @Test
    void testOrderProcessing() {
        Order order = new Order(dish2, 3);
        assertEquals(45.0, order.calculateTotal());
    }

    @Test
    void testInvalidOrderQuantity() {
        assertThrows(IllegalArgumentException.class, () -> new Order(dish3, 0));
    }

    @Test
    void testStaffManagement() {
        staff.setSalary(35000);
        assertEquals(35000, staff.getSalary());

        staff.setRole("Manager");
        assertEquals("Manager", staff.getRole());
    }

    @Test
    void testInvalidStaffSalary() {
        assertThrows(IllegalArgumentException.class, () -> staff.setSalary(-1000));
    }
}
