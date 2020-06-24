package by.ld.unit01.main;

public class Task15 {

	public static void main(String[] args) {
		
		double a;
		double n2; //для возведения в степень
		double n3;
		double n4;
		
		n2 = 2;
		n3 = 3;
		n4 = 4;
		
		a = Math.PI *10000;
		
		int b = (int)Math.floor(a);
		
		double c = (double) b / 10000;
		
		double pi1;
		double pi2;
		double pi3;
		double pi4;
		
		pi1 = c;
		pi2 = Math.pow(c, n2);
		pi3 = Math.pow(c, n3);
		pi4 = Math.pow(c, n4);
		
		System.out.println("1 степень числа pi = " + pi1);
		System.out.println("2 степень числа pi = " + pi2);
		System.out.println("3 степень числа pi = " + pi3);
		System.out.println("4 степень числа pi = " + pi4);

	}

}

// Замечаний по задачам первого юнита нет. Молодец!
