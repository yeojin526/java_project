package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		boolean flag = true;
		int a =(int) (Math.random()*9+1);
		int b =(int) (Math.random()*9+1);
		int c = a*b;
		
		while(flag) {
			System.out.println(a+"X"+b+"= ?");
			
			Scanner sc = new Scanner(System.in);
			int an = sc.nextInt();
			
			if(an!=c){
				System.out.println("틀렸습니다.");
			}else {
			System.out.println("정답입니다!");
			flag=false;
			}
		}
	}
}
