import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart()
    {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<ItemToPurchase>();
    }

    public ShoppingCart(String name, String date)
    {
        customerName = name;
        currentDate = date;
        cartItems = new ArrayList<ItemToPurchase>();
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getDate()
    {
        return currentDate;
    }

    //addItem(): Adds an item to cartItems array. Has parameter ItemToPurchase. Does not return anything.
    public void addItem(ItemToPurchase item)
    {
        cartItems.add(item);
    }

    /*
     *removeItem()
     *Removes item from cartItems array. Has a string (an item's name) parameter. Does not return anything.
     *If item name cannot be found, output this message: Item not found in cart. Nothing removed.
     */
    public void removeItem(String name)
    {
        int pos = -1;
        boolean isFound = false;

        for (int i = 0; i < cartItems.size(); i++)
        {
            if (cartItems.get(i).getName().equals(name))
            {
                pos = i;
                isFound = true;
                cartItems.remove(i);
                break;
            }
        }
        if (!isFound)
        {
            System.out.println("Nothing removed.");
        }
    }

    /*
     *modifyItem()
     *Modifies an item's description, price, and/or quantity. Has parameter ItemToPurchase. Does not return anything.
     *If item can be found (by name) in cart, check if parameter has default values for description, price, and quantity. If not, modify item in cart.
     *If item cannot be found (by name) in cart, output this message: Item not found in cart. Nothing modified.
     */
    public void modifyItem(ItemToPurchase item)
    {
        int pos = -1;
        boolean isFound = false;

        for (int i = 0; i < cartItems.size(); i++)
        {
            if (cartItems.get(i).getName().equals(item.getName()))
            {
                pos = i;
                isFound = true;

                if (cartItems.get(pos).getPrice() != 0)
                {
                    cartItems.get(pos).setPrice(0);
                }

                if (cartItems.get(pos).getQuantity() != 0))
                {
                    cartItems.get(pos).setQuantity(0);
                }

                if (cartItems.get(pos).getDescription() != "none")
                {
                    cartItems.get(pos).setDescription("none");
                }
                break;
            }
        }

        if(!isFound)
        {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    //getNumItemsInCart(): Returns quantity of all items in cart. Has no parameters.
    public int getNumItemsInCart()
    {

    }

    //getCostOfCart(): Determines and returns the total cost of items in cart. Has no parameters.
    public int getCostOfCart()
    {

    }

    /*
     *printTotal()
     *Outputs total of objects in cart.
     *If cart is empty, output this message: SHOPPING CART IS EMPTY
     */
    public void printTotal()
    {

    }

    //printDescriptions(): Outputs each item's description.
    public void printDescription()
    {

    }
}
