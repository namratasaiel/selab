package elevatorWorking;
//panel class
public class PanelButton implements Button {
Integer input;


	@Override
	public Integer setValue(Integer command) {
         input=command;
        return input;
	}
	
}
