package menu_details;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import java.util.Scanner;

public class HotelFactory 
{
	
	public static int generateOTP()
	{
		Random random = new Random();
		int otp = random.nextInt(1000, 9999);
		return otp;
	}
	
	public static void displayMenu() 
	{
		System.out.println("Select a below Option..");
		System.out.println("1. Add an item to the cart 👜");
		System.out.println("2. Remove an item from the cart 👜");
		System.out.println("3. Update the items details");
		System.out.println("4. Display all items details");
		System.out.println("5. Exit");
	}
	
	public static Menu addItem()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Item category");
		String category = s.next();
		System.out.println("Enter the Item Name");
		String name = s.next();
		System.out.println("Enter the Item Quantity");
		String quantity = s.next();
		System.out.println("Enter the No of Items");
		int items = s.nextInt();
		
		return new Menu(category, name, quantity, items);
	}
	
	public static void displayCart(Menu m)
	{
		System.out.println(m.getItemCategory()+" "+m.getItemName()+" "+m.getItemQuantity()+" "+m.getNoOfItems());
	}
	
	public static void removeItem(List<Menu> menuList, String itemName) 
	{
		boolean condn = true;
		Iterator<Menu> itr = menuList.iterator();
		while(itr.hasNext())
		{
			Menu menu = itr.next();
			if(menu.getItemName().equalsIgnoreCase(itemName)) 
			{
				itr.remove();
				condn = false;
			}
		}
		if(condn)
			System.out.println("Item Not Found");
		else
			System.out.println("Item Removed Successfully");
	}
	
	public static void updateItem(List<Menu> menuList) 
	{
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the item name you want to update:");
	    String itemName = s.next();
	    boolean condn = true;
	    for(Menu menu : menuList)
	    {
	    	if(menu.getItemName().equalsIgnoreCase(itemName))
	    	{
	    		System.out.println("Enter the new Item Name");
	    		menu.setItemName(s.next());
	    		condn = false;
//	    		System.out.println("Enter the new Item Quantity");
//	    		menu.setItemQuantity(s.next());
//	    		System.out.println("Enter the No of Items");
//	    		menu.setNoOfItems(s.nextInt());
//	    		System.out.println("Items updated successfully");
	    	}
	    }
	    if(condn)
	    	System.out.println("Item name is not found");
	}
	
}









