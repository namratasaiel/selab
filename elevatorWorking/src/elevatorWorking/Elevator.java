package elevatorWorking;

import java.util.ArrayList;

public class Elevator {
Door door =new Door();
int current_floor;
boolean elevatorState;
ArrayList <Button> floorPanel=new ArrayList<>();



public Door OpenDoor() {
	return door;
}


public void setDoor(Door door) {
	this.door = door;
}


public boolean isElevatorState() {
	return elevatorState;
}


public void setElevatorState(boolean elevatorState) {
	this.elevatorState = elevatorState;
}


	public int getCurrent_pos() {
		return current_floor;
	}
	

	public void setCurrent_pos(int current_pos) {
		this.current_floor = current_pos;
	} 
     
	
	
}
