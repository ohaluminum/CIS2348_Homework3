import java.net.SocketOption;
import java.util.Scanner;

public class ShoppingCartManager
{
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


