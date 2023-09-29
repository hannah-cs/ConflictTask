public class Main {
    public static void main(String[] args) {
        FoodItem item1 = new FoodItem("Burger", 9.99);
        FoodItem item2 = new FoodItem("Pizza", 12.99);
        Table table1 = new Table(1);
        Table table2 = new Table(2);
        Restaurant restaurant = new Restaurant();

        restaurant.addFoodItem(item1);
        restaurant.addFoodItem(item2);

        table1.reserve();
        table1.release();

        Order order1 = new Order(1);
        order1.addFoodItem(item1);
        order1.addFoodItem(item2);
        restaurant.placeOrder(order1);

        restaurant.listMenu();
    }
}
