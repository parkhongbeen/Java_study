import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 1004";
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		
		// Security off
		Security mySerSecurity = new Security(id);
		mySerSecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+"/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+"/ floorLamp");
		floorLamp.on();

	}

}
