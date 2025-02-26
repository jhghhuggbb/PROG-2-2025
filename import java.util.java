import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PizzaShop{
    private String shopName;
    private String address;
    private String email;
    private String phone;
    private Map<String, Double> menu;
    private List<String> toppings;
    private List<String> sideDishes;
    private List<String> beverages;
    private int orderIdCounter;
    public PizzaShop(String shopName, String address, String email, String phone){
        this.shopName = shopName;
        tihs.address = address;
        this.email = email;
        this.phone = phone;
        this.menu = new HashMap<>();
        this.toppings = new ArrayList<>();
        this.sideDishes = new ArrayList<>();
        this.beverages = new ArrayList<>();
        this.orderIdCounter = 1;
    }
    public void addPizzaToMenu(String pizzaName, double price){
        menu.put(pizzaName, price);
    }
    public void addTopping(Syring topping){
        toppings.add(topping);
    }
    public void addSideDish(String sideDish){
        sideDishes.add(sideDish);
    }
    public void addBeverage(String beverage){
        beverage.add(beverage);
    }
    public Order takeOrder(List<String> pizzas, List<String> sides, List<String> drinks){
        int orderId = orderIdCounter++;
        double totalPrice = 0;
        for (String pizza : pizzas){
            if (menu.containsKey(pizza)){
                totalPrice += menu.get(pizza);
            }
        }
        totalPrice += sides.size() * 5;
        totalPrice += drinks.size() * 3;
        return new Order(orderId, pizzas, sides, drinks, totalPrice);
    }
    public void makePizza(List<String> pizzas){
        System.out.println("Making the following pizzas:");
        for (String pizza : pizzas){
            System.out.println("- " + pizza);
        }
    }
    public void printReceipt(Order order){
        System.out.println("--- " + shopName + " Receipt ---");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Pizzas:");
        for (String pizza : order.getPizzas()){
            System.out.println("- " + pizza + ": $" + menu.get(pizza));
        } 
        System.out.println("Side Dishes:");
        for (String side : order.getSideDishes()){
            System.out.println("- " + side + ": $5");
        }
        System.out.println("Beverages:");
        for (String drink : order.getBeverages()){
            System.out.println("- " + drink + ": $3");
        }
        System.out.println("Total Price: $" + order.getTotalPrice());
    }
}
class Order{
    private int orderId;
    private List<String> pizzas;
    private List<String> sideDishes;
    private List<String> beverages;
    private double totalPrice;
    public Order(int orderId, List<String> pizzas, List<String> sideDishes, List<String> beverages, double totalPrice){
        this.orderId = orderId;
        this.pizzas = pizzas;
        this.sideDishes = sideDishes;
        this.beverages = beverages;
        this.totalPrice = totalPrice;
    }
    public int getOrderId(){
        return orderId;
    }
    public List<String> getPizzas(){
        return pizzas;
    }
    public List<String> getSideDishes(){
        return sideDishes;
    }
    public List<String> getBeverages(){
        return beverages;
    }
    public double getTotalPrice(){
        return totalPrice;
    }    
}
public class Main{
    public static void main(String[] args){
        PizzaShop pizzaShop = new PizzaShop("Slice-o-Heaven", "123 Pizza St", info@sliceoheaven.com", "555 - 1234");
        pizzaSHop.addPizzaToMenu("Cheese Pizza", 10.0);
        pizzaSHop.addPizzaToMenu("Ham Pizza", 12.0);
        pizzaShop.addTopping("Mushrooms");
        pizzaShop.addTopping("Green Peppers");
        pizzaShop.addSideDish("French Fries");
        pizzaShop.addSideDish("Chicken Wings");
        pizzaShop.addBeverage("Coke");
        pizzashop.addBeverage("Sprite");
        List<String> pizzas = new ArrayList<>();
        pizzas.add("Cheese Pizza");
        pizzas.add("Ham Pizza");
        List<String> sides = new ArrayList<>();
        sides.add("French Fries");
        List<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        Order order = pizzaShop.takeOrder(pizzas, sides, drinkls);
        pizzaShop.makePizza(pizzas);
        pizzaShop.printReceipt(order);
    }
}

