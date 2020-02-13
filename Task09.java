package by.ld.unit01.main;

public class Task09 {
	public static void main (String [] args) {
		
		double a;
		double b;
		double c;
		double d;
		
		double temp1;
		double temp2;
		double temp3;
		double temp4;
		double temp5;
		double exp;
		
		a = 1;
		b = 1;
		c = 1;
		d = 1;
		
		if ((c == 0) || (d == 0)) {
			System.out.println("деление на ноль");
		}else {
			temp1 = a / c;
			temp2 = b / d;
			temp3 = a * b - c;
			temp4 = c * d;
			temp5 = temp3 / temp4;
			
			exp = temp1 * temp2 - temp5;
			System.out.println(exp);	
		}
		
	}
	
}
