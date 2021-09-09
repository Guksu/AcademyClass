package Test;

interface Car{
	 void info();
}

class Bus<T> implements Car{
	String name;
	int num;
	
	@SuppressWarnings("hiding")
	public <T>void info(T obj) {
		System.out.println(obj);
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

}

@SuppressWarnings("rawtypes")
class CityTourBus extends Bus{
	
	@SuppressWarnings("unchecked")
	public CityTourBus(int num, String name) {
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Number:"+num+","+" Bus Name: "+name;
	}
	
}

@SuppressWarnings("rawtypes")
class SeoulBus extends Bus{
	@SuppressWarnings("unchecked")
	public SeoulBus(int num,String name) {
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Number:"+num+","+" Bus Name: "+name;
	}
	
}

class Taxi implements Car{
	public void info(int num, String name) {
		System.out.println("Taxi Number:"+num+","+" Taxi Name: "+name);
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}	
}

class Bicycle{
	
}

public class Test04 {
	public static void main(String[] args) {
//		Q4. Test04.java
//		interface Car					메소드 : info();
//		class Bus implements Car
//		class CityTourBus extends Bus
//		class SeoulBus extends Bus
//		class Taxi implements Car
//		Class Bicycle
//		Class Test04					메소드 : static <T extends Car> onlyCar(T car)
//		 - CityTourBus, SeoulBus, Taxi 정보 출력
		Bus<CityTourBus> bus1 = new Bus<CityTourBus>();
		Bus<SeoulBus> bus2 = new Bus<SeoulBus>();
		Taxi taxi = new Taxi();
		bus1.info(new CityTourBus(1234,"관광버스"));
		bus2.info(new SeoulBus(4321,"시내버스"));
		taxi.info(7777, "서울택시");
	}
}

