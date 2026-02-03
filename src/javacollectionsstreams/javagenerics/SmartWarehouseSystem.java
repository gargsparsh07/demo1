package javacollectionsstreams.javagenerics;

import java.util.*;

// Base class
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }
}

// Item types
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

// Generic Storage
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

// Main class
public class SmartWarehouseSystem {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        for (WarehouseItem item : electronicsStorage.getItems()) {
            System.out.println(item.name);
        }
    }
}
