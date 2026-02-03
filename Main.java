import java.util.*;

// 1. Create Product class implementing Comparable 
class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Sort by price
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

// Comparator class to sort by Name
class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Books", 32.0));
        products.add(new Product("Pen", 6.0));
        products.add(new Product("Calculator", 80.0));

        Collections.sort(products);
        System.out.println("Sorted by Price (Comparable): " + products);

        Collections.sort(products, new NameComparator());
        System.out.println("Sorted by Name (Comparator): " + products);
    }
}