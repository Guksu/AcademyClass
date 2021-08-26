package Ex;

class Vehicle{
	int speed = 3;
	
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
}

class Bus extends Vehicle{
	void printspd() {
		System.out.println(speed);
	}
}

public class Ex07_methode_override2 {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		
		bus.setSpeed(4);
		bus.printspd();
	}
}
