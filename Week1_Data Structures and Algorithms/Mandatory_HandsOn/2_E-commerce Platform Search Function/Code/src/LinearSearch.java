public class LinearSearch {
    public static Product linearSearch(Product[] products, String productName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(productName)) {
                return p;
            }
        }
        return null;
    }
}