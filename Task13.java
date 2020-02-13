package by.ld.unit01.main;

public class Task13 {
	public static void main(String[] args) {
		
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
	
		double a; //сторона
		double b; //сторона
		double c; //сторона
		double p; //периметр
		double s; //площадь
		
		x1 = 1;
		y1 = 1;
		
		x2 = 3;
		y2 = 3;
		
		x3 = 4;
		y3 = 1;
		
		double n;
		double t1;
		double t2;
		
		n = 2; //возведение в степень
		
		t1 = Math.pow((x2 - x1), n);
		t2 = Math.pow((y2 - y1), n);
		a = Math.sqrt(t1 + t2);
		System.out.println("сторона a " + a);
		
		double t3;
		double t4;
		
		t3 = Math.pow((x3 - x2), n);
		t4 = Math.pow((y3 - y2), n);
		b = Math.sqrt(t3 + t4);
		System.out.println("сторона b " + b);
		
		double t5;
		double t6;
		
		t5 = Math.pow((x3 - x1), n);
		t6 = Math.pow((y3 - y1), n);
		c = Math.sqrt(t5 + t6);
		System.out.println("сторона c " + c);
		System.out.println();

		p = a + b + c;
		System.out.println("периметр " + p);
		
		double pt;
		
		pt = p / 2;
		
		s = Math.sqrt(pt * (pt - a) * (pt - b) * (pt - c));
		System.out.println("площадь треугольника " + s);
	}

}