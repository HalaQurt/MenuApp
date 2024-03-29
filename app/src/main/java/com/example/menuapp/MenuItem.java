package com.example.menuapp;

public class MenuItem {
    private String name;
    private double price;
    private String category;

    // Constructor
    public MenuItem() {

    }
    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }
    public String toString(){
        String msg = getName () + ", Price =" + getPrice();
        return msg;
    }

    // Setter for category
    public void setCategory(String category) {
        this.category = category;
    }
}
