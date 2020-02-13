package by.ld.unit01.main;

public class Task12 {
	public static void main (String[] args) {
		
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double temp1;
		double temp2;
		double tempn;
		double d;
		
		tempn = 2;
		
		x1 = 1;
		y1 = 1;
		
		x2 = 1;
		y2 = 4;
		
		temp1 = Math.pow((x2 - x1), tempn);
		temp2 = Math.pow((y2 - y1), tempn);
		
		d = Math.sqrt(temp1 + temp2);
		
		System.out.println("расстояние между двумя точками " + d);
		
	}

}
