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
        public void addBook(FoodItem food){
            foodMenu.add(food);
        }
        public void registerMember(Table table){
            tables.add(table);
        }
        public void issueLoan(Order order){
            orders.add(order);
        }
}
