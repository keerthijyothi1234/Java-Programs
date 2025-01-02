 
import java.util.ArrayList;
import java.util.Scanner;

// Product Class
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ": " + name + " - $" + price;
    }
}

// Main Class
public class Shop {
private static ArrayList<Product> products = new ArrayList<>();
private static ArrayList<Product> cart = new ArrayList<>();
public static void main(String[] args) {
ProductDetails();
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to Online Shopping!");
 while (true) {
       System.out.println("\n1. View Products");
       System.out.println("2. Add to Cart");
       System.out.println("3. View Cart");
       System.out.println("4. order");
       System.out.println("5. Exit");
       System.out.print("Enter your choice: ");
       int choice = scanner.nextInt();

switch (choice) {
         case 1 : viewProducts();
         break;
         case 2 : addToCart(scanner);
         break;
         case 3 : viewCart();
         break;
         case 4 :order();
         break;
         case 5 : 
                    System.out.println("Thank you for shopping with us!");
                    scanner.close();
                    return;
              
            }
        }
    }

    static void ProductDetails() {
        products.add(new Product(1, "Dresses", 800.00));
        products.add(new Product(2, "Kitchenset", 500.00));
        products.add(new Product(3, "Groceries", 50.00));
        products.add(new Product(4, "Electronic items", 150.00));
    }

    static void viewProducts() {
        System.out.println("\nAvailable Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    static void addToCart(Scanner scanner) {
        System.out.print("Enter Product ID to add to cart: ");
        int productId = scanner.nextInt();
        for (Product product : products) {
            if (product.id == productId) {
                cart.add(product);
                System.out.println(product.name + " added to cart.");
                return;
            }
        }
        System.out.println("Invalid Product ID.");
    }

    static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
        } else {
            System.out.println("\nItems in your cart:");
            for (Product product : cart) {
                System.out.println(product);
            }
        }
    }

     static void order() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.place order");
            return;
        }
        double total = 0;
        System.out.println("\norder:");
        for (Product product : cart) {
            System.out.println(product);
            total += product.price;
        }
        System.out.println("Total Amount: $" + total);
        cart.clear();
        System.out.println("Thank you for your purchase!");
    }
}