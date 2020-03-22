import java.net.SocketOption;
import java.util.Scanner;

public class ShoppingCartManager
{
    public static void printMenu(ShoppingCart cart)
    {
        char userOption;
        String tempName;
        String tempDescription;
        int tempPrice;
        int tempQuantity;
        char tempNewLine;
        ItemToPurchase tempItem;

        while (true)
        {
            System.out.println("MENU");
            System.out.println("a - Add item to cart");
            System.out.println("d - Remove item from cart");
            System.out.println("c - Change item quantity");
            System.out.println("i - Output items' descriptions");
            System.out.println("o - Output shopping cart");
            System.out.println("q - Quit");
            System.out.println("");
            System.out.println("Choose an option:");

            userOption = scnr.nextChar();

            if (userOption == 'q')
            {
                break;
            }

            switch (userOption)
            {
                case 'a':
                    System.out.println("ADD ITEM TO CART");
                    System.out.println("Enter the item name:");
                    tempName = scnr.nextLine();

                    System.out.println("Enter the item description:");
                    tempDescription = scnr.nextLine();

                    System.out.println("Enter the item price:");
                    tempPrice = scnr.nextInt();

                    System.out.println("Enter the item quantity:");
                    tempQuantity = scnr.nextInt();

                    tempNewLine = scnr.nextLine();

                    tempItem = new ItemToPurchase(tempName, tempPrice, tempQuantity, tempDescription);

                    cart.addItem(tempItem);

                    break;

                case 'd':
                    System.out.println("REMOVE ITEM FROM CART");
                    System.out.println("Enter name of item to remove:");

                    tempName = scnr.nextLine();
                    cart.removeItem(tempName);

                    break;

                case 'c':
                    System.out.println("CHANGE ITEM QUANTITY");
                    System.out.println("Enter the item name:");

                    break;

                case 'i':
                    System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                    cart.printDescription();
                    break;

                case 'o':
                    System.out.println("OUTPUT SHOPPING CART");
                    cart.printTotal();
                    break;

                default:
                    break;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String userName;
        String todayDate;

        System.out.println("Enter Customer's Name:");
        userName = scnr.nextLine();

        System.out.println("Enter Today's Date:");
        todayDate = scnr.nextLine();

        ShoppingCart cart = new ShoppingCart(userName, todayDate);

        System.out.println("Customer Name: " + cart.getCustomerName());
        System.out.println("Today's Date: " + cart.getDate());

        printMenu(cart);

    }
}


