package elevatorWorking;

public class Floor {
   
	// current floor Number attribute.
	private Integer floorNumber;
	Door floorDoor=new Door();
	FloorButton buttonUp=new FloorButton();
	FloorButton buttondown=new FloorButton();
	Elevator elevator;

	// getter function for CurrentFLoorNumber
	public Integer getCurrentFloorNumber() {
		return floorNumber;
	}

	// setter function for CurrentFloorNumber
	public void setCurrentFloorNumber(Integer currentFloorNumber) {
		this.floorNumber = currentFloorNumber;
	} 
}
