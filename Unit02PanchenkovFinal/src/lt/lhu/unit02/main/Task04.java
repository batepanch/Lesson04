package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Vvedite znachnie pervogo chisla:");
		int a = in.nextInt();

		System.out.println("Vvedite znachnie vtororo chisla:");
		int b = in.nextInt();

		System.out.println("Vvedite znach4nie tret'ego chisla:");
		int c = in.nextInt();

		int d = a + b + c;
		System.out.println("Summa vvedennblh znacheniy = " + d);

	}

}
