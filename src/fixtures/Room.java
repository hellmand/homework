package fixtures;
//import Class Main;


public class Room extends Fixture {
	

	Room eastRoom;
	Room westRoom;
	Room northRoom;
	Room southRoom;

	
//	public Room(String name, String shortDescription, String longDescription) {
//		this.setName(name);
//		this.setShortDescription(shortDescription);
//		this.setLongDescription(longDescription);
//	}
//	

	/**
	 * @return the eastRoom
	 */
	public Room getEastRoom() {
		return eastRoom;
	}

	/**
	 * @param eastRoom the eastRoom to set
	 */
	public void setEastRoom(Room eastRoom) {
		this.eastRoom = eastRoom;
	}

	/**
	 * @return the westRoom
	 */
	public Room getWestRoom() {
		return westRoom;
	}

	/**
	 * @param westRoom the westRoom to set
	 */
	public void setWestRoom(Room westRoom) {
		this.westRoom = westRoom;
	}

	/**
	 * @return the northRoom
	 */
	public Room getNorthRoom() {
		return northRoom;
	}

	/**
	 * @param northRoom the northRoom to set
	 */
	public void setNorthRoom(Room northRoom) {
		this.northRoom = northRoom;
	}

	/**
	 * @return the southRoom
	 */
	public Room getSouthRoom() {
		return southRoom;
	}

	/**
	 * @param southRoom the southRoom to set
	 */
	public void setSouthRoom(Room southRoom) {
		this.southRoom = southRoom;
	}

	public Room getRoom(String direction) {

		if (direction.equalsIgnoreCase("n")) {
			return northRoom;
		} else if (direction.equalsIgnoreCase("s")) {
			return southRoom;
		} else if (direction.equalsIgnoreCase("e")) {
			return eastRoom;
		} else if (direction.equalsIgnoreCase("w")) {
			return westRoom;
		} else {
			return null;
		}

	}

	public Room(String name, String shortDescription, String longDescription, 
			Room northRoom, Room eastRoom,
			Room westRoom, Room southRoom) {
		super(name, shortDescription, longDescription);
		this.eastRoom = eastRoom;
		this.westRoom = westRoom;
		this.northRoom = northRoom;
		this.southRoom = southRoom;
	}

}

//public static void main(String[] args) {
//	
//	int menuSelection = 0;//playArray;
//
//	try (Scanner in = new Scanner(System.in)) {
//		System.out.println("Please select your direction. Type n for north, s for south, e for east, or w for west: ");
//		int currentRoom;
//		while (menuSelection != currentRoom) {
//			 
//				if(menuSelection == 1) {
//				System.out.println("Proceed to the kitchen."); 
//				switch(menuSelection) {
//				case 1:
//					System.out.println("1 Cup = 48 Teaspoons\r\n");
//				break;
//				}	
//				System.out.println("Please select an option: ");
//				 menuSelection = in.nextInt();		
//				}
//			 else if(menuSelection == 2) {
//				 System.out.println("Miles to Kilometers ");
//				 switch(menuSelection) {
//					case 2:
//						System.out.println("1 Mile = 1.61 Kilometers\r\n");
//					break;
//					}
//				 System.out.println("Please select an option: ");
//				 menuSelection = in.nextInt();
//			 	}
//			 else if(menuSelection == 3) {
//				 System.out.println("US Gallons to Imperial Gallons");
//				 switch(menuSelection) {
//					case 3:
//						System.out.println("1 US Gallon to 1.2 Imperial Gallons\r\n");
//					break;
//					}
//				 System.out.println("Please select an option: ");
//				 menuSelection = in.nextInt();
//				}
//			 else {
//				 System.out.println("1. Cups to Teaspoons\r\n" + 
//						"2. Kilometers to Miles \r\n" +
//				 		"3. US Gallons to Imperial Gallons\r\n" + 
//				 		"4. Quit");
//	 				menuSelection = in.nextInt();
//			 	}
//			 if(menuSelection == 4) {
//				  System.out.println("All done!");
//					
//			 }
//		}
//			
//		}
//}

//public class <get> { 
//	
//	 get Exits();
//	
//	"North" : 0
//	"Sourth": 1
//	"East"  : 2
//	"West"  : 3
//	
//	
//	
//	
//}

/*
 * public static void main(String[] args) { ArrayList<Item> items = new
 * ArrayList<Item>(); items.add(new Item(1, "This is North")); items.add(new
 * Item(2, "This is South")); items.add(new Item(3, "This is East"));
 * items.add(new Item(4, "This is South")); items.add(new Item(5,
 * "This is item 5"));
 * 
 * //print the third item System.out.println(items.get(2));
 * 
 * //remove the last item Item removed = items.remove(items.size()-1);
 * System.out.println(removed);
 * 
 * //iterating over a list Iterator<Item> iter = items.iterator();
 * 
 * while (iter.hasNext()) { Item item = iter.next();
 * System.out.println("removing item: " + item); iter.remove();
 * //iter.remove();; items.add(new Item(6, "This is a new item")); }
 * 
 * //confirm the size is 0 System.out.println(items.size()); }
 * 
 * /*public Room(String name, String shortDescription, String longDescription) {
 */
