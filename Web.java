import java.util.Scanner;

 
class Shopping {
 int id;
 String name;
 double price;
 Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
}
System.out.println("Shopping:"+id+","+name","+price);
}

   
public class Web{ 
    public static void main(String args[]) {
        productdetails();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Amazon");
        while (true) {
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. place order");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> viewProducts();
                case 2 -> addToCart(sc);
                case 3 -> viewCart();
                case 4 -> checkout();
                case 5 -> 
                    System.out.println("exit");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }

     static void productdetails() {
        products.add(new Product(1, "Laptop", 800.00));
        products.add(new Product(2, "Smartphone", 500.00));
        products.add(new Product(3, "Headphones", 50.00));
        products.add(new Product(4, "Smartwatch", 150.00));
    }

    private static void viewProducts() {
        System.out.println("\nAvailable Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void addToCart(Scanner scanner) {
        System.out.print("Enter ProductName to add to cart: ");
          System.out.println(product.name + " added to cart.");
                return;
            }
        }
        System.out.println("Invalid ProductName ");
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
        } else {
            System.out.println("\nItems in your cart:");
            for (Product product : cart) {
                System.out.println(product);
            }
        }
    }

    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty. Add items before checkout.");
            return;
        }
        double total = 0;
        System.out.println("\nCheckout:");
        for (Product product : cart) {
            System.out.println(product);
            total += product.price;
        }
        System.out.println("Total Amount: $" + total);
        cart.clear();
 
    }
}