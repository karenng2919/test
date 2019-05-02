public class LandVille {

		private int[][] land;
		int row, column;
		// you will need to add the variable 'hasHouse'
		public boolean hasHouse;
		int[][] house;
		
		// Constructor...
		// Assumption - rows and columns has been validated beforehand.
		// Create the array that the land variable above will reference (using the 'new' operator)
		// Initialise the land so that each cell is set to the character '0' (hint: use one of your// methods!).
		// Set the value of any other variables
		public LandVille(int maxRows, int maxColumns) {
			land = new int [maxRows][maxColumns];
			clearLand();
			}
		
		
		// Display the land grid
		public void displayLand() {
			for (int i = 0; i < land.length; i++) {
				for (int j = 0; j < land[i].length; j++) {
					// print each cell of land
					System.out.print(land[i][j] + " ");
				}
				// break the line
				System.out.println();
			}
		}
			
			
		// Clear out the land. This involves setting each cell to be the character '0'
		public void clearLand() {
			for (int i = 0; i < land.length; i++) {
				for (int j = 0; j < land[i].length; j++) {
					land[i][j] = 0;
				}
			}
				hasHouse = false;
		}

		
		// Build a house
		public void buildHouse(int rows, int columns) {
			int maxRow = land.length;
			int maxCol = land[0].length;
			
			// Validate the inputs to ensure they make sense for the size of the land
			// 		- display an error message and return if they don't.
			// Ensure none of the other rules are violated
			//		- again display an error message and return if they are violated
			if (rows < 0 || rows >= (maxRow - 1)) {
				System.out.println("Invalid input. Row of house needs to be greater than 0 and less than or equal to " + (maxRow - 2));
				System.out.println("No house is built.");
				}	
			
				else	if	(columns < 0 || columns >= (maxCol - 1)) {
				System.out.println("Invalid input. Column of house needsto be greater than 0 and less than or equal to " + (maxCol - 2));
				System.out.println("No house is built.");
				}
			
			// If all is ok "build" the house on the land (using the character '8') surrounded
			// by a pretty little fence of '1' characters.	
				// Build the land
				else { for (int i = 0; i < land.length; i++) {
					int c = 0;
					for (i = 0; i < land.length; i++) {
						c = 0;
						
						// Build the border
						for (int j = 0; j < land[i].length; j++) {
							if (((i == 0 || i == rows + 1) && j <= columns) || ((j == 0 || j == columns + 1) && i <= rows + 1)) {
								c = 1;
							
							// Build the house
							} else {
								if (i <= rows && j <= columns) {
									c = 8;
								}
							}
							
							land[i][j] = c;
							c = 0;
						}
					}
					
					hasHouse = true;

					displayLand();
				}
			}
		}
}


