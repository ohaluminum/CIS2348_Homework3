import java.util.Scanner;

public class ShoppingCartManager
{
    /*
     *Note: Creating multiple Scanner objects for the same input stream yields unexpected behavior.
     *Thus, good practice is to use a single Scanner object for reading input from System.in.
     *That Scanner object can be passed as an argument to any methods that read input.
     */
    public static void printMenu(ShoppingCart cart, Scanner scanner)
    {
        char userOption;
        String tempName;
        String tempDescription;
        int tempPrice;
        int tempQuantity;
        String tempNewLine;
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

            userOption = scanner.next().charAt(0);

            if (userOption == 'q')
            {
                break;
            }

            switch (userOption)
            {
                case 'a':
                    System.out.println("ADD ITEM TO CART");
                    System.out.println("Enter the item name:");
                    tempName = scanner.nextLine();

                    System.out.println("Enter the item description:");
                    tempDescription = scanner.nextLine();

                    System.out.println("Enter the item price:");
                    tempPrice = scanner.nextInt();

                    System.out.println("Enter the item quantity:");
                    tempQuantity = scanner.nextInt();

                    tempNewLine = scanner.nextLine();

                    tempItem = new ItemToPurchase(tempName, tempDescription, tempPrice, tempQuantity);

                    cart.addItem(tempItem);

                    break;

                case 'd':
                    System.out.println("REMOVE ITEM FROM CART");
                    System.out.println("Enter name of item to remove:");

                    tempName = scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        String userName;
        String todayDate;

        System.out.println("Enter Customer's Name:");
        userName = scanner.nextLine();

        System.out.println("Enter Today's Date:");
        todayDate = scanner.nextLine();

        System.out.println();

        ShoppingCart cart = new ShoppingCart(userName, todayDate);

        System.out.println("Customer Name: " + cart.getCustomerName());
        System.out.println("Today's Date: " + cart.getDate());

        printMenu(cart, scanner);
    }
}


