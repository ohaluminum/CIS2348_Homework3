import java.net.SocketOption;
import java.util.Scanner;

public class ShoppingCartManager
{
    public static void printMenu(ShoppingCart cart)
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


    }




    /*
     Implement the printMenu() method.
     printMenu() has a ShoppingCart parameter,
     and outputs a menu of options to manipulate the shopping cart.
     Each option is represented by a single character.
     Build and output the menu within the method.

If the an invalid character is entered,
continue to prompt for a valid choice.
Hint: Implement Quit before implementing other options.
Call printMenu() in the main() method.
Continue to execute the menu until the user enters q to Quit. (3 pts)
*/


    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String userName = "";
        String todayDate = "";

        System.out.println("Enter Customer's Name:");
        userName = scnr.nextLine();

        System.out.println("Enter Today's Date:");
        todayDate = scnr.nextLine();

        ShoppingCart cart = new ShoppingCart(userName, todayDate);

        System.out.println("Customer Name: " + cart.getCustomerName());
        System.out.println("Today's Date: " + cart.getDate());



    }
}


