package ticketManagerInterface;
import classAssigner.*;
import ticketGenerator.*;

import java.util.*;

public class ManagerMain {

	
	
	public void questionClassChooser(boolean[] seat)
	{	
		
		Scanner input = new Scanner(System.in);
		
		//new AirplaneSeatStatus(seat);
		
		System.out.println("\n\nPlease Type 1 for the First Class");
		System.out.println("Please Type 2 for the Economy Class");
		
		int choice = input.nextInt();
		
		if(choice == 1) new FirstClassSeatAssigner(seat);
		
		else new EconomyClassSeatAssigner(seat);
	
		
	}
	
	
}
