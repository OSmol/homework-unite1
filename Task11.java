package by.ld.unit01.main;

public class Task11 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double s;
		double p;
		
		double n;
		double temp1;
		
		a = 4;
		b = 2;
		
		n = 2;
		
		temp1 = Math.pow(a, n) + Math.pow(b, n);
		
		c = Math.sqrt(temp1);
		s = (a * b) / 2;
		p = a + b + c;
		
		System.out.println("площадь прямоугольного треугольника = " + s);
		System.out.println("периметр прямоугольного треугольника = " + p);
	}

}
