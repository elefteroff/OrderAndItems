import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
            item1.name = "mocha";
            item1.price = 4.00;

        Item item2 = new Item();
            item2.name = "latte";
            item2.price = 3.50;

        Item item3 = new Item();
            item3.name = "drip coffee";
            item3.price = 1.50;

        Item item4 = new Item();
            item4.name = "capuccino";
            item4.price = 2.75;
    
        // Order variables -- order1, order2 etc.
    
        Order order1 = new Order();
            order1.name = "Cindhuri";

        Order order2 = new Order();
            order2.name = "Jimmy";

        Order order3 = new Order();
            order3.name = "Noah";

        Order order4 = new Order();
            order4.name = "Sam";

        order2.items.add(item1);
        order2.total += item1.price;
        order3.total += item4.price;
        order4.total += item2.price;
        order1.total += item3.price;
        order1.ready = true;
        order4.total += item2.price * 2;
        order4.ready = true;
        order2.ready = true;

        // Application Simulations
        System.out.printf("Item: %s\n", item1.name);
        System.out.printf("Your order total is: %s\n", order2.total);
        System.out.printf("Item: %s\n", item4.name);
        System.out.printf("Your order total is: %s\n", order3.total);
        System.out.printf("Item: %s\n", item2.name);
        System.out.printf("Your order total is: %s\n", order4.total);

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
    }
}
