package sec02.exam01;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String A = sc.nextLine();
		System.out.print("주민번호 앞 6자리를 입력하시오: ");
		String B = sc.nextLine();
		System.out.print("휴대폰 번호를 입력하시오: ");
		String C = sc.nextLine();
		
		System.out.println(A+"\n"+B+"\n"+C);
	
	
	}

}
