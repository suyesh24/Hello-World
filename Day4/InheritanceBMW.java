package Day4;

public class InheritanceBMW extends InheritanceP{

	boolean autoGearBox = true;
	
	public static void main(String[] args) {
		InheritanceBMW bmwCar = new InheritanceBMW();
		bmwCar.color = "red";
		bmwCar.accelrateSpeed();
		bmwCar.breakcar();
		System.out.println("Is Auto Car: "+ bmwCar.autoGearBox);
	}
	//Overiding - happens inheritance. method should have sam return type, same parameters and same method name
	void accelrateSpeed() {
		speed = speed + 2;
		System.out.println("Accelerated Speed: "+speed);
	}
}
  