package Day4;

public class InheritanceP {
	int speed = 0;
	int maxSpeed = 100;
	int minSpeed = 0;
	String engine = "V1";
	String color = "Black";
	
	void accelrateSpeed() {
		speed = speed + 1;
		System.out.println("Accelerated Speed: "+speed);
	}

	void breakcar() {
		speed--;
		System.out.println("Break Speed: "+speed);
	}

	void stopcar() {
		speed = 0;
		System.out.println("bike Stopped & speed is "+speed);
	}
}
	
	