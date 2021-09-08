package Ex;

class Room<T1, T2>{
	
	private T1 furniture1;
	private T2 furniture2;
	
	
	@Override
	public String toString() {
		StringBuffer sb =new StringBuffer();
		sb.append("첫번째 가구: ").append(furniture1).append("\n");
		sb.append("두번째 가구: ").append(furniture2);
		return sb.toString();
	}
	
	public void setFurniture1(T1 furniture1) {
		this.furniture1 = furniture1;
	}
	public void setFurniture2(T2 furniture2) {
		this.furniture2 = furniture2;
	}
	
	
	
}

class Chair{
	@Override
	public String toString() {
		return "의자";
	}
}

class Table{
	@Override
	public String toString() {
		return "테이블";
	}
}

class Bed{
	@Override
	public String toString() {
		return "침대";
	}
}

class DressTable{
	@Override
	public String toString() {
		return "드레스테이블";
	}
}
public class Ex04_generic {
	public static void main(String[] args) {

		Room<Table, Bed> r1 = new Room<>();
		r1.setFurniture1(new Table());
		r1.setFurniture2(new Bed());
		System.out.println(r1.toString());
	}
}
