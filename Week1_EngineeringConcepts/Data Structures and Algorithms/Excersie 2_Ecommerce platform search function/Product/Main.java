
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Fashion"),
            new Product(102, "Book", "Education"),
            new Product(104, "Phone", "Electronics")
        };

        System.out.println(" Linear Search:");
        Product result1 = Search.linearSearch(products, 102);
        System.out.println(result1 != null ? result1 : "Product not found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println(" Binary Search:");
        Product result2 = Search.binarySearch(products, 102);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
