public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O001", "Himasri", 299.99),
                new Order("O002", "Geethasri", 129.50),
                new Order("O003", "Sandhya", 512.00),
                new Order("O004", "Sindhu", 75.25)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        // Test Bubble Sort
        System.out.println("\nSorted by Bubble Sort:");
        BubbleSort.sort(orders);
        for (Order o : orders) System.out.println(o);

        // Reset orders
        orders = new Order[] {
                new Order("O001", "Himasri", 299.99),
                new Order("O002", "Geethasri", 129.50),
                new Order("O003", "Sandhya", 512.00),
                new Order("O004", "Sindhu", 75.25)
        };

        // Test Quick Sort
        System.out.println("\nSorted by Quick Sort:");
        QuickSort.sort(orders, 0, orders.length - 1);
        for (Order o : orders) System.out.println(o);
    }
}
