package sec03.exam01;

import java.util.Scanner;

public class Id {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i; //변수 i 선언
		int sum =0; //변수 sum 선언 및 초기화
		
			for(i=1;i<=3;i++) {
			
			System.out.print(i+"번째 숫자를 입력하시오.(단,1이상의 수)>");
			int num1 = sc.nextInt();
		
				if(num1>0) {
					sum+=num1;}
				else {
					System.out.println("0보다 작은 수를 입력하셨습니다.");
				}			
			}
			System.out.println("입력한 수들의 합은 "+sum+"입니다.");	
			System.out.println("입력한 수들의 평균값은 "+sum/3+"입니다.");
	}

	
}