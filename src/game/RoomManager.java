package game;

import fixtures.Room;

public class RoomManager {

		
	private static Room diningRoom = new Room("diningRoom", "", "", null, null, null, null);
	private static Room kitchenRoom = new Room("kitchenRoom", "", "", null, null, null, null);
	private static Room livingRoom = new Room("livingRoom", "", "", null, null, null, null); 
	private static Room denRoom = new Room("denRoom", "", "", null, null, null, null);
	private static Room exitRoom = new Room("exitRoom", "", "", null, null, null, null);
	static Room foyer = new Room("foyerRoom", "", "", null, null, null, null);

	public static void setRooms () {
		
		RoomManager.diningRoom.setNorthRoom(null);
		RoomManager.diningRoom.setEastRoom(kitchenRoom);
		RoomManager.diningRoom.setWestRoom(null);
		RoomManager.diningRoom.setSouthRoom(livingRoom);
		
//		this.kitchenRoom.setNorthRoom(null);
//		this.kitchenRoom.setEastRoom(denRoom);
//		this.kitchenRoom.setWestRoom(diningRoom);
//		this.kitchenRoom.setSouthRoom(foyer);
//		
//		this.livingRoom.setNorthRoom(diningRoom);
//		this.livingRoom.setEastRoom(kitchenRoom);
//		this.livingRoom.setWestRoom(null);
//		this.livingRoom.setSouthRoom(null);
//		
//		this.denRoom.setNorthRoom(kitchenRoom);
//		this.denRoom.setEastRoom(null);
//		this.denRoom.setWestRoom(foyer);
//		this.denRoom.setSouthRoom(null);
//		
//		this.foyer.setNorthRoom(kitchenRoom);
//		this.foyer.setEastRoom(denRoom);
//		this.foyer.setWestRoom(diningRoom);
//		this.foyer.setSouthRoom(null);
//		
	
		
	}
//	Room[] exits = { 
//			new Room("livingRoom", "", ""), 
//			new Room("foyerRoom", "", ""), 
//			new Room("diningRoom", "", ""), 
//			new Room("kitchenRoom", "", ""), 
//			new Room("denRoom", "", ""), 
//			new Room("bathroomn", "", "")
//	};

	/**
	 * @return the diningRoom
	 */
	public static Room getDiningRoom() {
		return diningRoom;
	}

	/**
	 * @param diningRoom the diningRoom to set
	 */
	public static void setDiningRoom(Room diningRoom) {
		RoomManager.diningRoom = diningRoom;
	}

	/**
	 * @return the kitchenRoom
	 */
	public static Room getKitchenRoom() {
		return kitchenRoom;
	}

	/**
	 * @param kitchenRoom the kitchenRoom to set
	 */
	public static void setKitchenRoom(Room kitchenRoom) {
		RoomManager.kitchenRoom = kitchenRoom;
	}

	/**
	 * @return the livingRoom
	 */
	public static Room getLivingRoom() {
		return livingRoom;
	}

	/**
	 * @param livingRoom the livingRoom to set
	 */
	public static void setLivingRoom(Room livingRoom) {
		RoomManager.livingRoom = livingRoom;
	}

	/**
	 * @return the denRoom
	 */
	public static Room getDenRoom() {
		return denRoom;
	}

	/**
	 * @param denRoom the denRoom to set
	 */
	public static void setDenRoom(Room denRoom) {
		RoomManager.denRoom = denRoom;
	}

	/**
	 * @return the exitRoom
	 */
	public static Room getExitRoom() {
		return exitRoom;
	}

	/**
	 * @param exitRoom the exitRoom to set
	 */
	public static void setExitRoom(Room exitRoom) {
		RoomManager.exitRoom = exitRoom;
	}

	/**
	 * @return the foyer
	 */
	public static Room getFoyer() {
		return foyer;
	}

	/**
	 * @param foyer the foyer to set
	 */
	public static void setFoyer(Room foyer) {
		RoomManager.foyer = foyer;
	}
	
	
			//scanner.in room  currentRoom=foyer (Main) 
//			: the rooms adjacent to this one.
	
//	livingRoom,foyerRoomw,diningRoomn
//	diningRoom,livingRoomn,kitchenRoome
//	kitchenRoom diningRoomw,foyerRooms
//	foyerRoom,livingRoomw,denRoome,kitchenroomn
//	denRoom foyerRoome,bathroomn
//	bathroom-denRooms, kitchenRoom
//	(shortDescriptionshortDescription)
//
//	rshortDesc
//	rlongDesc

//}
//public Room(String name, String shortDescription, String longDescription) {
//	super(name, shortDescription, longDescription);
//	this.exits = new Room[?]; // size is your choice
//}
//	
//public Room[] getExits() {
//	
//}
	
//
//public Room getExit(String direction) {
	
}