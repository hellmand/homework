package game;


import fixtures.Room;

import java.util.Scanner;

/*Set up your declarations 1. Greet your customer. 2. Describe your game. 3. Input their choice of traveling direction 4. call in the appropriate case from Rooms. Repeat. Catch errors, Provide Game termination after each case. Provide closing message.*/

//declarations

public class Main {
	private static final String inputPrompt = "Please select your direction. Type n for north, s for south, e for east, or w for west, x to exit: ";

	public static void main(String[] args) {

try (//create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in)) {
			RoomManager.setRooms();
			Room currentRoom = RoomManager.foyer;
			System.out.println(currentRoom.getName());

			int menuSelection = 0;
			//	int[] currentRoom = new int[0];
			System.out.println(
					"Welcome to our home! We are so glad you are interested in purchasing our 1965 fixer-upper!  With a 2-car garage, 1/3/ of an acre bordering Middle Patuxent State Park, we think you will find 4 bedrooms, 2.5 baths, and a full (unfinished) walk-out basement, just what you were looking for! \r\n");

			System.out.println(
					"I am unable to take you on a personal tour of the first floor as originally promised (due our nation's current lockdown,) however, I was able to devise a quick text-tour of our main floor living space, if you will kindly choose which direction you would like to travel, beginning with the foyer entrance.\r\n");

			try (Scanner in = new Scanner(System.in)) {

				while (menuSelection != 4) {

					// menuSelection = in.nextInt();
					// prompt for the user's name

					System.out.print(inputPrompt);

					// get their input as a String
					String direction = scanner.next();
					System.out.println(String.format("You typed %s\r\n", direction));


					if (direction.equalsIgnoreCase("n")) {
						menuSelection = 0;
					} else if (direction.equalsIgnoreCase("e")) {
						menuSelection = 1;
					} else if (direction.equalsIgnoreCase("w")) {
						menuSelection = 2;
					} else if (direction.equalsIgnoreCase("s")) {
						menuSelection = 3;
					} else if (direction.equalsIgnoreCase("x")) {
						menuSelection = 4;
					} else {
						System.out.println("Invalid option");
					}

					if (currentRoom.getRoom(direction)!= null) {
						currentRoom = currentRoom.getRoom(direction);
					} else {
						System.out.println("No room that direction.");
					}
							
					switch (menuSelection) {
					
					case 0:
						System.out.println(currentRoom.getRoom("n").getName());
					
						currentRoom = currentRoom.getRoom("n");
						break;
					case 1:
						currentRoom = currentRoom.getRoom("e");
						break;

					case 2:
						currentRoom = currentRoom.getRoom("w");
						break;

					case 3:
						currentRoom = currentRoom.getRoom("s");
						break;

					case 4:
						System.out.println("All done!");
						return;

					}
					System.out.println(currentRoom.getName());
					System.out.println("Please select an option: ");
				}

			}
		}
	}
//	System.out.println("Please select your direction. Type n for north, s for south, e for east, or w for west: ");
//	int currentRoom;
//	while (menuSelection != currentRoom)

	/*
	 * //Go to Roommanager.java to execute each case. //currentRoom.toString//(Go to
	 * Scanner.in.) String("n = int[0] ");
	 * 
	 * 
	 * 
	 * Scanner.in new Scanner = n, s, e, w; "North" : 0 "South" : 1 "East" : 2
	 * "West" : 3
	 * 
	 * 
	 * if playArray = 1 //execute Roommanager case// //playArray1 = in.nextLine();
	 */

}

// TODO Auto-generated constructor stub

/*
 * public static void main(String[] args) {
 * 
 * }
 * 
 * private static void printRoom(Player player) {
 * 
 * }
 * 
 * private static String[] collectInput() {
 * 
 * }
 * 
 * private static void parse(String[] command, Player player) {
 * 
 * 
 * /*super(name, shortDescription, longDescription); this.exits = new Room[?];
 * // size is your choice }
 * 
 * public Room[] getExits() {
 * 
 * }
 * 
 * public Room getExit(String direction) {
 * 
 * } }
 */
/*
 * } }
 * 
 * 
 * }
 */
