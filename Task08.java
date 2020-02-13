package by.ld.unit01.main;

public class Task08 {
	public static void main (String [] args) {
		
		double a;
		double b;
		double c;
		
		a = 2;
		b = 1;
		c = 1;
		
		double temp1;
		double temp2;
		double temp3;
		double temp4;
		double exp;
		double n2;
		double n3;
		double nt;
		
		n2 = 2;
		n3 = 3;
		nt = -2;
		
		temp1 = Math.pow(b, n2) + (4 * a * c);
		temp2 = b + Math.sqrt(temp1);
		temp3 = 2 * a;
		temp4 = Math.pow(a, n3) * c + Math.pow(b, nt);
		exp = temp2 / temp3 - temp4;
		if (temp3 == 0) {
			System.out.println("деление на ноль");
		}else {
			
			System.out.println("выражение = " + exp);
			
		}
	}
}