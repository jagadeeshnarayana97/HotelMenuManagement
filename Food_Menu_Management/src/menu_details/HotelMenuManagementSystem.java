package menu_details;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HotelMenuManagementSystem 
{
	
	public static void main(String[] args) 
	{
		System.out.println("🍗🍽️ Welcome to Hotel Management System 🍝🍴");
		System.out.println("Please Login to the Application ");
		System.out.println("Enter Your Mobile Number 📱");
		Scanner s = new Scanner(System.in);
		long mobileNumber = s.nextLong();
		
		if((mobileNumber>999999999l && mobileNumber<9999999999l)&&(mobileNumber>6000000000l || mobileNumber>7000000000l || mobileNumber>8000000000l || mobileNumber>9000000000l))
		{
			int otp = HotelFactory.generateOTP();
			System.out.println("Your OTP is : "+otp);
			
			System.out.println("Enter the OTP");
			int inputOTP = s.nextInt();
			
			if(inputOTP == otp)
			{
				System.out.println("Login Successful ✔️");
				
				List<Menu> menuList = new ArrayList();
				boolean condn = true;
				
				while(condn)
				{
					HotelFactory.displayMenu();
					int option = s.nextInt();
					
					switch(option)
					{
						case 1 : {
							Menu menu = HotelFactory.addItem();
							menuList.add(menu);
							System.out.println("Item successfully added into the cart 👜");
						} 
						break;
						case 2 : {	
							if(menuList.isEmpty())
							{
								System.err.println("No items are present in cart 👜👜");
							} 
							else
							{
								System.out.println("Enter the Item Name");
								String itemName = s.next();
								HotelFactory.removeItem(menuList, itemName);
							}
						} 
						break;
						case 3 : {
							if(menuList.isEmpty())
							{
								System.err.println("No items are present in cart 👜👜");
							}
							else
							{
								HotelFactory.updateItem(menuList);
								System.out.println("Item updated successfully");
							}
						} 
						break;
						case 4 : {
							if(menuList.isEmpty())
							{
								System.err.println("No items are present in cart 👜👜");
							}
							else
							{
								System.out.format("%-12s %-15s %-8s %-5s","Category","ItemName","Quantity","NoOfItems");
								System.out.println();
								System.out.println("------------------------------------------");
								for(Menu m : menuList)
								{
									//HotelFactory.displayCart(m);
									System.out.format("%-12s %-15s %-8s %-5s",m.getItemCategory(),m.getItemName(),m.getItemQuantity(),m.getNoOfItems());
									System.out.println();
									System.out.println("--------------------------------------------------");
								}
							}
						} 
						break;
						case 5 : {
							condn = false;
							System.out.println("Logout Successful\nVisit Again");
						} 
						break;
					
						default : {
							System.err.println("Invalid Option\nPlease enter valid Option");
						}
					}
				}
			}
			else
			{
				System.err.println("Invalid OTP ❌❌\nPlease enter valid OTP");
			}
		
		}
		else
		{
			System.err.println("Invalid Mobile Number ❌❌");
		}
	}
}
