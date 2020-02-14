package by.ld.unit01.main;

public class Task01 {

	public static void main(String[] args) {
		
		double x; 
		double y;
		
		double sum;
		double raz;
		double pro;
		double cha;
		
		x = 1;
		y = 0;
		
		sum = x + y;
		System.out.println("сумма = " + sum);
		
		raz = x - y;
		System.out.println("разность = " + raz);
		
		pro = x * y;
		System.out.println("произведение = " + pro); 
		
		cha = x / y;
		if (y == 0) {
			System.out.println("деление на ноль, y = " + y);
		}else System.out.println("частное = " + cha);
		
	}

}
