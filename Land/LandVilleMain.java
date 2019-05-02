import java.util.*;
	
public class LandVilleMain {
	
public static void main(String[] args) {
		
		// Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
           
	
        // Input # of rows, # of columns for the land size, check for valid input.
        // If the either input is too small replace it with the smallest feasible size the land could be.
        int r, l, rs, ls;
		
        // Input number of row
		System.out.println("Enter row number of the land:");
		r = sc.nextInt();
		
		// Validate row input
		while (r < 0 || r > 10) {
			System.out.println("Row should be greater than 0 and less than or equal to 10.");
			System.out.println("Enter row number of the land:");
			r = sc.nextInt();
		}
		
		// Input number of column
		System.out.println("Enter column number of the land:");
		l =  sc.nextInt();
		
		// Validate column input
		while (l < 0 || l > 10) {
		System.out.println("Column should be greater than 0 and less than or equal to 10.");
		System.out.println("Enter column number of the land:");
		l =  sc.nextInt();
		}
		
		// Create an object of class LandVille using the 'new' operator, calling on the LandVille constructor.
		LandVille lv = new LandVille(r, l);   
		
      	// Display menu
      	int option;
	  	String menu[] = {"\n Select an option",
                             "\n (1) Build a house",
                             "\n (2) Display land",
                             "\n (3) Clear land",
                             "\n (4) Quit"};

		do {
			System.out.println(String.join("", menu));
			option = sc.nextInt();
			
			if (option < 1 || option >= menu.length) {
				continue;
			}
			
		System.out.println(menu[option]);
		
		// Set the cases
		switch (option) {
		case 1:
			if(lv.hasHouse)  {
			System.out.println("House already exists.");
			}	
			else 
			{
						System.out.print("Enter house rows:");
						rs = sc.nextInt();

						System.out.print("Enter house column:");
						ls = sc.nextInt();
						
						lv.buildHouse(rs, ls);
			}
			break;
			
		case 2:
			lv.displayLand();
			break;
			
		case 3:
			lv.clearLand();
			break;
			
		case 4:
			System.exit(1);

			}
		
		}	while (true);
		
	}
	
}