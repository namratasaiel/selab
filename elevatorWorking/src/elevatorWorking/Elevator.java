package elevatorWorking;

import java.util.ArrayList;

public class Elevator {
Door door =new Door();
int current_floor;
boolean elevatorState;
Floor floor;
String output="true";
ArrayList <Button> floorPanel=new ArrayList<>();



public Door OpenDoor() {
	return door;
}


public boolean getElevatorState() {
	return elevatorState;
}


public void setElevatorState(boolean elevatorState) {
	this.elevatorState = elevatorState;
}


		public String  move(Integer input){
		if(!elevatorState)	{	

		if(floor.getCurrentFloorNumber()< input)
			output="up";
		else
			if(floor.getCurrentFloorNumber()>input)
				output="down";
			
		floor.setCurrentFloorNumber(input);
		
        output=door.opendoor();
		}
		return output;
	}
	
	
}
