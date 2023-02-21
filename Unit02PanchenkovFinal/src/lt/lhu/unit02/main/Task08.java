package lt.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		double a = 4;
		double b = 15;
		double h = 2;
		double fx;
		double x;
		System.out.println("*********************************************************");
		System.out.println("*  Znachenie argumenta  * \t Znachenie Funkcii \t*");
		System.out.println("*********************************************************");
		for (x = a; x < b; x = x + h) {
			fx = 2 * Math.tan(x / 2) + 1;
			System.out.println("*\t" + x + "\t\t*\t" + fx + "\t*");
		}
		System.out.println("*********************************************************");

	}
}
