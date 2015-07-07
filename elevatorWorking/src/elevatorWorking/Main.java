package elevatorWorking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String status;
		
    Elevator elevatorcontrol=new Elevator();
    FloorButton floorbutton=new FloorButton();
    Floor floor=new Floor();
    floor.setCurrentFloorNumber(5);
    elevatorcontrol.setElevatorState(true);
   status=elevatorcontrol.move(floorbutton.setValue(10));
    System.out.println(status);
	}

}
