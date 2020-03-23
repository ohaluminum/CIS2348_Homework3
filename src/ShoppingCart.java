import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart()
    {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<>();
    }

    public ShoppingCart(String name, String date)
    {
        customerName = name;
        currentDate = date;
        cartItems = new ArrayList<>();
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
            System.out.println("Item not found in cart. Nothing removed.");
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
        int pos;
        boolean isFound = false;
        int itemPrice;
        String itemDescription;

        for (int i = 0; i < cartItems.size(); i++)
        {
            if (cartItems.get(i).getName().equals(item.getName()))
            {
                pos = i;
                isFound = true;
                itemPrice = cartItems.get(i).getPrice();
                item.setPrice(itemPrice);

                itemDescription = cartItems.get(i).getDescription();
                item.setDescription(itemDescription);

                cartItems.set(pos, item);
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
        int totalQuantity = 0;

        for (int i = 0; i < cartItems.size(); i++)
        {
            totalQuantity += cartItems.get(i).getQuantity();
        }
        return totalQuantity;
    }

    //getCostOfCart(): Determines and returns the total cost of items in cart. Has no parameters.
    public int getCostOfCart()
    {
        int totalCost = 0;
        int subCost;

        for(int i = 0; i < cartItems.size(); i++)
        {
            subCost = cartItems.get(i).getPrice() * cartItems.get(i).getQuantity();
            totalCost += subCost;
        }
        return totalCost;
    }

    /*
     *printTotal()
     *Outputs total of objects in cart.
     *If cart is empty, output this message: SHOPPING CART IS EMPTY
     */
    public void printTotal()
    {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + getNumItemsInCart());
        System.out.println();

        if (cartItems.isEmpty())
        {
            System.out.println("SHOPPING CART IS EMPTY");
        }
        else
        {
            for (int i = 0; i < cartItems.size(); i++)
            {
                cartItems.get(i).printItemCost();
            }
        }
        System.out.println();
        System.out.println("Total: $" + getCostOfCart());
    }

    //printDescriptions(): Outputs each item's description.
    public void printDescription()
    {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println();
        System.out.println("Item Descriptions");

        for (int i = 0; i < cartItems.size(); i++)
        {
            cartItems.get(i).printItemDescription();
        }
    }
}
