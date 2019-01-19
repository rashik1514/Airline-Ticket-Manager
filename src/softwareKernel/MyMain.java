package softwareKernel;

//import classAssigner.*;
//import ticketGenerator.*;
import ticketManagerInterface.*;



public class MyMain {
	
	static boolean seat[] = {false,false,false,false,false,false,false,false,false,false,false};
	
	

	public static void main(String[] args) {
		int planeIsFull=0;
		
		while(planeIsFull<=10)
		{	
			ManagerMain mm = new ManagerMain();
			mm.questionClassChooser(seat);
			planeIsFull++;
		}

	}

}
