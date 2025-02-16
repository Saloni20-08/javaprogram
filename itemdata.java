import java.util.*;

class Item {
    int code;
    String name;
    double price;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.println("Enter the Item Code:");
        code = sc.nextInt();
        System.out.println("Enter the Item Name:");
        name = sc.next();
        System.out.println("Enter the Item Price:");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("Item Code: " + code);
        System.out.println("Item Name: " + name);
        System.out.println("Item Price: " + price);
    }
}
class itemdata
 {
    public static void main(String[] args) {
        Item[] items = new Item[2];

        for (int i = 0; i < items.length; i++) {
            items[i] = new Item();
            System.out.println("Enter details for item " + (i + 1) + ":");
            items[i].getData();
        }

        for (int i = 0; i <items.length ; i++) {
            System.out.println("Details of item " + (i + 1) + ":");
            items[i].display();
        }
    }
}
