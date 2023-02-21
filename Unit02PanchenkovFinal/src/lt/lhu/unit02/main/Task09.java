package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		double fx;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Vvedite znachenie x: ");
		double x = in.nextDouble();
		
		if (x <= -3) {
			fx = 9.0;
			System.out.println("Znachenie funkcii F(x) = " + fx);
		} else if (x > 3) {
			fx = 1 / (Math.pow(x, 2) + 1);
			System.out.println("Znachenie funkcii F(x) = " + fx);
		} else if ((x < 3) || (x >= -3)) {
			System.out.println("Vi vveli nevernor znachenie funkcii");
		}
		

	}

}
