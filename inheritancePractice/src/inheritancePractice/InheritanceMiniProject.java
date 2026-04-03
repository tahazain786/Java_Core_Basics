package inheritancePractice;

class Vehicle{
	String brand = "Standard";
	void start() {
		System.out.println("Vehicle has started");
	}
	void stop() {
		System.out.println("Vehicle has stopped");
	}
	void display() {
		System.out.println("This is a Vehicle");
	}
}
class Car extends Vehicle{
	String brand = "Toyota";
	void openDoors() {
		System.out.println("CAr doors are opening");
	}
	void playMusic() {
		System.out.println("CAr doors are closing");
	}
	@Override
	void display() {
		System.out.println("This is a Car");
	}
}
class ElectricCar extends Car {
	String brand = "Tesla";
	void chargeBattery() {
		System.out.println("CAr is charging");
	}
	void autoDrive() {
		System.out.println("CAr is on autodrive");
	}
	@Override
	void display() {
		System.out.println("This is an Electric Car");
	}
}

public class InheritanceMiniProject {
	public static void main(String[] args) {
        System.out.println("---- Creating Vehicle Object ----");
        Vehicle v = new Vehicle();
        v.start();
        v.stop();
        v.display();
        System.out.println("Brand: " + v.brand);
        Car c = new Car();
        //inherited classes
        c.start();
        c.stop();
        //its own classes
        c.openDoors();
        c.playMusic();
        //Override
        c.display();
        System.out.println("Brand: " + c.brand);
        ElectricCar ec = new ElectricCar();
        //inherited classes
        ec.openDoors();
        ec.playMusic();
        //its own classes
        ec.chargeBattery();
        ec.autoDrive();
        //Override
        ec.display();
        System.out.println("Brand: " + ec.brand);
        //Overriding the displays now (Methods are overridden)
        Vehicle ref; 
        ref = new Car();
        ref.display();
        ref = new ElectricCar();
        ref.display();
        //Polymorphism ( varaibles are not overridden)
        Vehicle rtp;
        rtp = new Car();
        System.out.println("Brand: " + rtp.brand);
        rtp = new ElectricCar();
        System.out.println("Brand: " + rtp.brand);
        
        
	}
}
