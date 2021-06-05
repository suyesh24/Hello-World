package Day4;

public class Car {
	
	String carcolor = "gray";
	
	static String engine = "V1";
	Car () {}
	
	Car (String color) {
		this.carcolor = color;
	}
	
	public static void main (String[] args) {
	
	Car newCar = new Car();
	newCar.printCarColor ();  
	Car.printCarEngine();
	
	Car newCar2 = new Car("Red");
	newCar2.printCarColor ();
	Car.printCarEngine();
	
	Car newCar3 = new Car("Red");
	newCar3.printCarColor ();
	Car.printCarEngine();
	
	
	}
	
	void printCarColor () {
		System.out.println("Car color: " + carcolor);
		}
	
	static void printCarEngine() {
		System.out.println("Engine " + engine);
		}
	}
