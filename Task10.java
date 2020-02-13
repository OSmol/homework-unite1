package by.ld.unit01.main;

public class Task10 {
	public static void main (String[] args){
		double x;
		double y;
		
		double temp1;
		double temp2;
		double temp3;
		double exp;
		
		x = 1;
		y = 1;
		
		temp1 = Math.sin(x) + Math.cos(y);
		temp2 = Math.cos(x) + Math.sin(y);
		temp3 = Math.tan(x *y);
		
		if (temp2 != 0) {
			exp = (temp1 / temp2) * temp3;
			System.out.println("expression = " + exp);
		}else {
			System.out.println("знаменатель дроби = 0");
		}
	
	}
}
