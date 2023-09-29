public class Order extends FoodItem{
//Order Class
//Attributes: orderID, foodItems, totalPrice
//Methods: addFoodItem(), calculateTotal()
import java.util.ArrayList;

    private int orderId;
    private ArrayList<FoodItem> foodItems = new ArrayList<>();

    private double totalPrice;

    public void addFoodItem(FoodItem... items) {
        for (FoodItem item : items) {
            foodItems.add(item);
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (FoodItem item : foodItems) {
            total += item.getPrice();
        }
        return total;
    }