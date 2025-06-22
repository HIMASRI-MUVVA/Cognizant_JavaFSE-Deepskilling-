import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined product list
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mouse", "Electronics"),
                new Product(3, "Shoes", "Footwear"),
                new Product(4, "Watch", "Accessories"),
                new Product(5, "Book", "Stationery")
        };

        // Take user input for search
        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();

        System.out.print("Choose search method (1: Linear, 2: Binary): ");
        int choice = scanner.nextInt();

        Product result = null;

        if (choice == 1) {
            result = LinearSearch.linearSearch(products, searchName);
        } else if (choice == 2) {
            BinarySearch.sortByName(products);
            result = BinarySearch.binarySearch(products, searchName);
        } else {
            System.out.println("Invalid option. Please enter 1 or 2.");
            scanner.close();
            return;
        }

        // Show result
        System.out.println("\nSearch Result:");
        if (result != null) {
            System.out.println("Found!!"+result);
        } else {
            System.out.println("Product not found.");
        }

        scanner.close();
    }
}
