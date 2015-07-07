package elevatorWorking;

public class FloorButton implements Button {
	Integer input;
	@Override
	public Integer setValue(Integer command) {
input=command;

return input;
	}
	
	
}
