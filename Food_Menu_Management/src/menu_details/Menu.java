package menu_details;

public class Menu 
{
	private String itemCategory;
	private String itemName;
	private String itemQuantity;
	private int noOfItems;
	
	public Menu(String itemCategory, String itemName, String itemQuantity, int noOfItems) 
	{
		this.itemCategory = itemCategory;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.noOfItems = noOfItems;
	}
	
	public Menu()
	{
		
	}
	
	public String getItemCategory() 
	{
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) 
	{
		this.itemCategory = itemCategory;
	}

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}

	public String getItemQuantity() 
	{
		return itemQuantity;
	}

	public void setItemQuantity(String itemQuantity) 
	{
		this.itemQuantity = itemQuantity;
	}

	public int getNoOfItems() 
	{
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) 
	{
		this.noOfItems = noOfItems;
	}
	
}
