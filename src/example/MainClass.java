package example;

public class MainClass {
	
	public static void main(String[] args) {

		Comparable circ1 = new Circle(10);
		Comparable circ2 = new Circle(20);
		
		System.out.println("circ1 == circ2 " + circ1.equals(circ2));
		System.out.println("circ1 < circ2 ? Should return -1: " + circ1.compareTo(circ2));
		System.out.println("circ2 < circ1 ? Should return 1: " + circ2.compareTo(circ1));
		System.out.println("Test is done");
	}

}
