package ticketGenerator;

public class TicketGenerator {
	
	public TicketGenerator(int seatNumber, int classNumber)
	{	
		String className;
		if(classNumber == 1) className = "First";
		else className = "Economy";
		System.out.println("\n*****John F Kennedy International Airport*****\n");
		
		System.out.println("                Boarding Pass                      ");
		
		System.out.printf("Class Type: %s                      Destination: USA\n",className);
		
		System.out.printf("Seat No. : %d                       From: BGD\n",seatNumber);
		
		System.out.printf("Boarding Time: 05:00                 Date: 20th DEC, 2016\n");
	}

	



}
