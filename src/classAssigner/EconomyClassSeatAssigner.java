package classAssigner;

import java.util.Scanner;
import ticketGenerator.*;

public class EconomyClassSeatAssigner {

	
	
	public EconomyClassSeatAssigner(boolean[] seat)
	{	
		if(!isEconomyClassFull(seat)){
			System.out.println("Which seat you want to assign in Economy class(5-10)");
			Scanner input = new Scanner(System.in);
			System.out.println("****AIRPLANE SEAT STATUS*****");
			new AirplaneSeatStatus(seat);
			int choice = input.nextInt();
			
			seatBooked SB = new seatBooked();
			if(!SB.SeatBooked(seat,choice) && choice>5){
				seat[choice] = true;
				new TicketGenerator(choice,2);
			}
		}
		
		
		else whenEconomyClassFull(seat);
	

	}
	
	public boolean isEconomyClassFull(boolean[] seat)
	{
		boolean economyClassFull = true;
		for(int i=6; i<=10; i++)
		{
			if(!seat[i])  economyClassFull = false;
		}
	
		return economyClassFull;
	}
	
	
	public void whenEconomyClassFull(boolean[] seat)
	{	
		
		System.out.println("Economy class full. Do you want to assign sit in First class(Y/N)");
		Scanner input = new Scanner(System.in);
		char choice = input.next().charAt(0);
		if(choice == 'Y' || choice == 'y') new FirstClassSeatAssigner(seat);
		
		else System.out.println("The next flight leaves in 3 hours");
		
		//input.close();
	}
	
}
