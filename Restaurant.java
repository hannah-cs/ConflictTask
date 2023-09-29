import java.util.ArrayList;
import java.util.List;

public class Restaurant {
        private List<FoodItem> foodMenu;
        private List<Table> tables;
        private List<Order> orders;
        public Library() {
            this.foodMenu = new ArrayList<>();
            this.tables = new ArrayList<>();
            this.orders = new ArrayList<>();
        }
        public void addFoodItem(FoodItem food){
            foodMenu.add(food);
        }
        public void addTable(Table table){
            tables.add(table);
        }
        public void placeOrder(Order order){
            orders.add(order);
        }
}
