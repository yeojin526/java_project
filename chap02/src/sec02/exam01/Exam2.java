package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class Exam2 {
	
	public static void main(String[] args) {
		
	int i;
	for(i=0;i<5;i++) {
			
		boolean flag = true;
		int a =(int) (Math.random()*9+1);
		int b =(int) (Math.random()*9+1);
		int c = a*b;
		
		while(flag) {
			System.out.println(a+"X"+b+"=?");
			System.out.print("답>");
			
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			
				if(answer!=c){
					System.out.println("정답입니다!");
				} else {
					System.out.println("틀렸습니다.");
					
					flag=false;  //이스케이프
				}
		}
	}
	}
}
