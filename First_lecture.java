package dip107;

import java.util.Scanner;

public class First_lecture {

	public static void main(String[] args) {
		System.out.print("KrisU\n");
		System.out.println("2*2=" + (2 + 2));

		byte a;
		a = 3 * 3;
		System.out.println("3*3=" + a);

		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
			System.out.println("You entered: " + x);
			System.out.println("x^2=" + x * x);
			if (x < 0) {
				x = -x;
			}
			System.out.println("|x|=" + x);
		} else {
			System.out.println("Please enter a number!");
			sc.close();
			return;
		}

		
	}

}
