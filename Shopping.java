package assignment12;

import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private String description;
    private double price;

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    
    public abstract double calculateTotalPrice();
}

class ElectronicsProduct extends Product {
    public ElectronicsProduct(String description, double price) {
        super(description, price);
    }

    @Override
    public double calculateTotalPrice() {
       
        return getPrice();
    }
}

class ClothingProduct extends Product {
    public ClothingProduct(String description, double price) {
        super(description, price);
    }

    @Override
    public double calculateTotalPrice() {
        
        return getPrice();
    }
}

class BookProduct extends Product {
    public BookProduct(String description, double price) {
        super(description, price);
    }

    @Override
    public double calculateTotalPrice() {
       
        return getPrice();
    }
}

class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void displayCartDetails() {
        System.out.println("Shopping Cart Details:");
        double totalPrice = 0.0;
        for (Product product : cartItems) {
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
            totalPrice += product.calculateTotalPrice();
        }
        System.out.println("Total Price: " + totalPrice);
    }
}

public class Shopping {
    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart();

       
        Product electronicsProduct = new ElectronicsProduct("Smartphone", 7000);
        Product clothingProduct = new ClothingProduct("T-shirt", 500);
        Product bookProduct = new BookProduct("Java Programming Book", 1500);

        cart.addProduct(electronicsProduct);
        cart.addProduct(clothingProduct);
        cart.addProduct(bookProduct);

        
        cart.displayCartDetails();
    }
}