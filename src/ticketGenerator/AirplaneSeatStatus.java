package ticketGenerator;

public class AirplaneSeatStatus {
	
	public AirplaneSeatStatus(boolean[] seat)
	{
		for(int i=1; i<=10; i++){
			if(seat[i]) System.out.print("T ");
			else System.out.print("F ");
		}
		
		System.out.println();
	}
	
}
