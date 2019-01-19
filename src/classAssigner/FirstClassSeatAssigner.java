package classAssigner;

import java.util.Scanner;
import ticketGenerator.*;

public class FirstClassSeatAssigner {
	
	
	public FirstClassSeatAssigner(boolean[] seat)
	{	
		if(!isFirstClassFull(seat)){
			System.out.println("Which seat you want to assign in First class(1-5)");
			Scanner input = new Scanner(System.in);
			System.out.println("****AIRPLANE SEAT STATUS*****");
			new AirplaneSeatStatus(seat);
			int choice = input.nextInt();
			
			seatBooked SB = new seatBooked();
			if(!SB.SeatBooked(seat,choice) && choice<5){
				seat[choice] = true;
				new TicketGenerator(choice,1);
			}
		}
		
		
		else whenFirstClassFull(seat);
	

	}
	
	
	
	public boolean isFirstClassFull(boolean[] seat)
	{
		boolean firstClassFull = true;
		for(int i=1; i<=5; i++)
		{
			if(!seat[i])  firstClassFull = false;
		}
	
		return firstClassFull;
	}
	
	public void whenFirstClassFull(boolean[] seat)
	{	
		
		System.out.println("First class full. Do you want to assign sit in Economy class(Y/N)");
		Scanner input = new Scanner(System.in);
		char choice = input.next().charAt(0);
		if(choice == 'Y' || choice == 'y') new EconomyClassSeatAssigner(seat);
		
		else System.out.println("The next flight leaves in 3 hours");
		
		//input.close();
	}


}
