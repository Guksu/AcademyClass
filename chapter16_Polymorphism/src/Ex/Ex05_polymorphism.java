package Ex;

class Car{
	
	public void drive(){
		System.out.println("run run run !!");
	}
}

class Ev extends Car{
	
	public void charging() {
		System.out.println("Ev charg charg charg !!");
	}
}

class Hybri extends Ev{
	public void addOil() {
		System.out.println("Hb Oil Oil Oil !!");
	}
}

public class Ex05_polymorphism {
	public static void main(String[] args) {

		Car[] car = new Car[2]; 
		car[0] = new Ev();
		car[1] = new Hybri();
		
		if( car[0] instanceof Ev) {
			((Ev)car[0]).charging();
		}
		System.out.println("============");
		if( car[1] instanceof Hybri) {
			((Hybri)car[1]).addOil();
		}
		
	}
}
