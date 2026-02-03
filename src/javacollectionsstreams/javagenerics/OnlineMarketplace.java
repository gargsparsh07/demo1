package javacollectionsstreams.javagenerics;

// Category interface
interface Category {
    String getCategoryName();
}

// Category types
class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

// Generic Product
class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void applyDiscount(double percentage) {
        price -= price * percentage / 100;
    }

    void display() {
        System.out.println(name + " | " + category.getCategoryName() + " | ₹" + price);
    }
}

// Main class
public class OnlineMarketplace {
    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Generics", 500, new BookCategory());

        book.applyDiscount(10);
        book.display();
    }
}
