package sec03.exam01;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요>");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력하세요>");
		int num2 = sc.nextInt();
		
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
				sum+=i;				
		}
		System.out.println(num1 +"부터"+ num2 +"까지의 모든 숫자들의 합은: "+ sum + "입니다.");
		
	}

}