import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        String tempName;
        int tempPrice;
        int tempQuantity;
        String newline;
        int item1Price;
        int item2Price;
        int totalPrice;

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        tempName = scnr.nextLine();
        item1.setName(tempName);

        System.out.println("Enter the item price:");
        tempPrice = scnr.nextInt();
        item1.setPrice(tempPrice);

        System.out.println("Enter the item quantity:");
        tempQuantity = scnr.nextInt();
        item1.setQuantity(tempQuantity);

        System.out.println();

        /*
         *Before prompting for the second item
         *Call scnr.nextLine()
         *to allow the user to input a new string.
         */
        newline = scnr.nextLine();

        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        tempName = scnr.nextLine();
        item2.setName(tempName);

        System.out.println("Enter the item price:");
        tempPrice = scnr.nextInt();
        item2.setPrice(tempPrice);

        System.out.println("Enter the item quantity:");
        tempQuantity = scnr.nextInt();
        item2.setQuantity(tempQuantity);

        System.out.println();

        item1Price = item1.getQuantity() * item1.getPrice();
        item2Price = item2.getQuantity() * item2.getPrice();
        totalPrice = item1Price + item2Price;

        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1Price);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2Price);
        System.out.println();
        System.out.println("Total: $" + totalPrice);
    }
}
