package practice0104;

import java.util.Scanner;

public class PtTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세자리 수를 입력하시오: ");
		String num1 = sc.nextLine();
		System.out.print("세자리 수를 입력하시오: ");
		String num2 = sc.nextLine();
		
		String num3 = num2.substring(num2.length()-1,num2.length());
		String num4 = num2.substring(num2.length()-2,num2.length()-1);
		String num5 = num2.substring(num2.length()-3,num2.length()-2);
		
		int value1 = Integer.parseInt(num1);
		int value2 = Integer.parseInt(num2);
		int value3 = Integer.parseInt(num3);
		int value4 = Integer.parseInt(num4);
		int value5 = Integer.parseInt(num5);
		
		System.out.println("    "+num1);
		System.out.println(" X  "+num2);
		System.out.println("-----------------");

		System.out.println("   "+value1*value3);
		System.out.println("  "+value1*value4);
		System.out.println(" "+value1*value5);

		System.out.println("-----------------");
		System.out.println(" "+value1*value2);	
	}
}
