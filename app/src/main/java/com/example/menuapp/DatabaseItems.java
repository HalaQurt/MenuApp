package com.example.menuapp;

import java.util.ArrayList;
import java.util.List;

public class DatabaseItems {
    private List<MenuItem> items = new ArrayList<MenuItem>(); // Corrected variable declaration

    public DatabaseItems() {
        items.add(new MenuItem("Coffee", 10, "Hot Drinks"));
        items.add(new MenuItem("Tea", 6, "Hot Drinks"));
        items.add(new MenuItem("HotSpanish", 14, "Hot Drinks"));
        items.add(new MenuItem("HotChocolate", 15, "Hot Drinks"));
        items.add(new MenuItem("HotVanilla", 16, "Hot Drinks"));
        items.add(new MenuItem("Iced Coffee", 13, "Cold Drinks"));
        items.add(new MenuItem("Iced Tea", 5, "Cold Drinks"));
        items.add(new MenuItem("Iced Spanish", 10, "Cold Drinks"));
        items.add(new MenuItem("Juice", 3, "Cold Drinks"));
        items.add(new MenuItem("Chicken Sandwich", 25, "Sandwiches"));
        items.add(new MenuItem("Stack", 40, "Meals"));
        items.add(new MenuItem("nuggets Sandwiches", 20, "Sandwiches"));
        items.add(new MenuItem("Latte", 12, "Hot Drinks"));
        items.add(new MenuItem("Espresso", 8, "Hot Drinks"));
        items.add(new MenuItem("Cappuccino", 11, "Hot Drinks"));
        items.add(new MenuItem("Iced Latte", 14, "Cold Drinks"));
        items.add(new MenuItem("Iced Mocha", 16, "Cold Drinks"));
        items.add(new MenuItem("Iced Americano", 10, "Cold Drinks"));
        items.add(new MenuItem("Vegetarian Sandwich", 22, "Sandwiches"));
        items.add(new MenuItem("Turkey Sandwich", 24, "Sandwiches"));
        items.add(new MenuItem("Grilled Cheese", 18, "Sandwiches"));
        items.add(new MenuItem("Salad", 30, "Meals"));
        items.add(new MenuItem("Burger", 35, "Meals"));
        items.add(new MenuItem("Pasta", 28, "Meals"));
        items.add(new MenuItem("Mocha", 13, "Hot Drinks"));
        items.add(new MenuItem("Chai Latte", 10, "Hot Drinks"));
        items.add(new MenuItem("Iced Chai", 9, "Cold Drinks"));
        items.add(new MenuItem("Smoothie", 12, "Cold Drinks"));
        items.add(new MenuItem("Lemonade", 4, "Cold Drinks"));
        items.add(new MenuItem("Turkey Club Sandwich", 26, "Sandwiches"));
        items.add(new MenuItem("BLT Sandwich", 23, "Sandwiches"));
        items.add(new MenuItem("Veggie Wrap", 20, "Sandwiches"));
        items.add(new MenuItem("Fish and Chips", 32, "Meals"));
        items.add(new MenuItem("Vegetable Stir-Fry", 27, "Meals"));


    }

    // learn how to do it for each
//public List<MenuItem> getMenuItems (String Categories){
//   List<MenuItem> result = new ArrayList<>();
//   for(MenuItem m : items ){
//       if (m.getCategory().equals(Categories)){
//           result.add(m);
//       }
//    }
//   return result ;
//}
    public List<MenuItem> getMenuItems(String Categories) {
        List<MenuItem> result = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            // actualy the m is an extra step just for short cut
            MenuItem m = items.get(i);
            if (m.getCategory().equals(Categories)) {
                result.add(m);
            }
        }
        return result;
    }

    public String[] getCategories() {
        String[] categories = {"Hot Drinks", "Cold Drinks", "Sandwiches", "Meals"}; // Corrected category names
        return categories;
    }












}
















