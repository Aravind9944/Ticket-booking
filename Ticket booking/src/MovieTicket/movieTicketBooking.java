package MovieTicket;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class movieTicketBooking {
	static int count = 0;
	public static void BookingTicketsolt1(int time, LinkedList A)
	{
		int price=300;
		int flag=0;
		int f=0;
		Scanner sc=new Scanner(System.in);
	    if(time==1)
		System.out.println(A);
	 
	    switch (time)
	    {
	        case 1:
	        {
	        	f=1;
	        	while(true){
	        	if(flag==1)break;
	        	System.out.println("Please select a seat from seat1 to seat18");
	        	String seat=sc.next();
	        	if(A.contains(seat))
	        	{
	        		count=count+1;
	        		System.out.println("Do you want to add another Please press Yes or No");
	        		String c=sc.next();
	        		if(c.equalsIgnoreCase("Yes"))
	        		{
	        			if(A.contains(seat))
	        			{
	        				flag=1;
		        			
	        			if(seat.equalsIgnoreCase("seat1"))A.remove("seat1");
	        			if(seat.equalsIgnoreCase("seat2"))A.remove("seat2");
	        			if(seat.equalsIgnoreCase("seat3"))A.remove("seat3");
	        			if(seat.equalsIgnoreCase("seat4"))A.remove("seat4");
	        			if(seat.equalsIgnoreCase("seat5"))A.remove("seat5");
	        			if(seat.equalsIgnoreCase("seat6"))A.remove("seat6");
	        			if(seat.equalsIgnoreCase("seat7"))A.remove("seat7");
	        			if(seat.equalsIgnoreCase("seat8"))A.remove("seat8");
	        			if(seat.equalsIgnoreCase("seat9"))A.remove("seat9");
	        			if(seat.equalsIgnoreCase("seat10"))A.remove("seat10");
	        			if(seat.equalsIgnoreCase("seat11"))A.remove("seat11");
	        			if(seat.equalsIgnoreCase("seat12"))A.remove("seat12");
	        			if(seat.equalsIgnoreCase("seat13"))A.remove("seat13");
	        			if(seat.equalsIgnoreCase("seat14"))A.remove("seat14");
	        			if(seat.equalsIgnoreCase("seat15"))A.remove("seat15");
	        			if(seat.equalsIgnoreCase("seat16"))A.remove("seat16");
	        			if(seat.equalsIgnoreCase("seat17"))A.remove("seat17");
	        			if(seat.equalsIgnoreCase("seat18"))A.remove("seat18");
	        					
	        		    gettheshowtime(A);
	        			}
	        			else
    	        			System.out.println("Please select number between seat1 - seat10");
	        		}
	        		else
	        		{
	        			System.out.println("Seats booked"+count);
	        			System.out.println("Total amount you have to paid is "+(count*price));
	        			break;
	        		}
	        	}
	        	else
        			System.out.println("Seat is Not available, Please select the another seat");  	
	        }
	        }
	        break;     
	    default : 
	    	System.out.println("select the seat from showing display");
	    	gettheshowtime(A);
	        }
	        }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> A = new LinkedList<String>();                  
		for(int i=1;i<=18;i++)
		{
			A.add("seat"+i);
		}
		
		int flag=0;
		int flag1=0;
		System.out.println("Are you an User or Admin? ");
		String info1=sc.nextLine();
		if(info1.equalsIgnoreCase("Admin"))
		{
			while(flag1==0)
			{
		    System.out.println("Proceed Login....");
			System.out.print("Please enter the username : ");
			String username=sc.next();
			System.out.print("Please enter the password : ");
			String password=sc.next();
			if(username.equals("username")&&password.equals("123456"))
			{
				flag1=1;
			System.out.println("Do you want to change or update your password? Please type Yes or No");
			String info2=sc.next();
			if(info2.equalsIgnoreCase("Yes"))
			{
				
				while(flag==0)
				{
				System.out.println("Old Password ?");
				String info3=sc.next();
				if(info3.equals("123456"))
				{
					while(true)
					{
				    System.out.println("New password ?");
					String info5=sc.next();
					if(!(info5.equals("123456")))
					{
						System.out.println("Password changes");
						flag=1;
						break;
					}else
					{
						System.out.println("Password is same as Old Password Enter the New Password ");
					}
					}
				}else
				{
					System.out.println("Enter the correct password");
				}
				}
			
			}
			else
			{
				System.out.println("Thank you");
			}
			}
			else
			{
				System.out.println("Please enter the correct password");
			}
		}
		}
		else if(info1.equalsIgnoreCase("User"))
		{

			System.out.println("Ticket Booking");
		   gettheshowtime(A);
		}
	}
    
	public static void gettheshowtime(LinkedList A)
	{
		Scanner scan=new Scanner(System.in);
			System.out.println("ShowTimings is 2PM - 4PM");
		    	BookingTicketsolt1(1,A);
		    
		}
}