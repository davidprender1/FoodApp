package ie.week.week.sem2;

import java.util.ArrayList;

public class FoodApp {

    public static void main(String[] args) {
        ArrayList<Food> items = new ArrayList<>();
        double totalCost = 0;
        System.out.println("***Welcome to Just App***");
        System.out.println("This is your order.....");
        //Create an order
        Burger cheeseBurger = new Burger ("Cheeseburger", 1.99,"Tasty");
        Burger veggie = new Burger ("Veggie Burger", 2.99, "Very Tasty");
        Pizza tuna = new Pizza("Tuna Pizza", 8.99, "Surprisingly nice");
        Fries curry = new Fries("Curry Fries",2.99, "Again very tasty");
        Dessert appleTart = new Dessert("Apple Tart",5.00,"Ten out of Ten");


        //List all of the food items burgers, pizzas ,fries, etc
        items.add(cheeseBurger);
        items.add(veggie);
        items.add(tuna);
        items.add(curry);
        items.add(appleTart);

        //Display Order of user
        for(Food item: items)
        {
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
            totalCost += item.getPrice();
        }
        System.out.println("Total cost: " + totalCost);
    }
}
