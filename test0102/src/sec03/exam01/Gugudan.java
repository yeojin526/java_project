package sec03.exam01;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("구구단 몇단?");
		int num1 = sc.nextInt();
		
		for (int i= num1 ; i<=num1; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
		}
	}

}