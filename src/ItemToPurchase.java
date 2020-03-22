public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase()
    {
        itemName = "None";
        itemDescription = "None";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public ItemToPurchase(String name, String description, int price, int quantity)
    {
        itemName = name;
        itemDescription = description;
        itemPrice = price;
        itemQuantity = quantity;
    }

    public void setName(String name)
    {
        itemName = name;
    }

    public void setPrice(int price)
    {
        itemPrice = price;
    }

    public void setQuantity(int quantity)
    {
        itemQuantity = quantity;
    }

    public void setDescription(String description)
    {
        itemDescription = description;
    }

    public String getName()
    {
        return itemName;
    }

    public int getPrice()
    {
        return itemPrice;
    }

    public int getQuantity()
    {
        return itemQuantity;
    }

    public String getDescription()
    {
        return itemDescription;
    }

    public void printItemCost()
    {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
    }

    public void printItemDescription()
    {
        System.out.println(itemName + ": " + itemDescription);
    }
}