package sec03.exam01;

import java.util.Scanner;

public class Studentcredits {
	public static void main(String[] args) {
		//int scoreMax = 100;
		//int scoreMin = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
		System.out.print("학점을 입력하시오:");
		int score =sc.nextInt();
		
			if (90<=score&&score<=100) {
			System.out.println("학점은 A");
			} else if(80<=score&&score<90) {
			System.out.println("학점은 B");
			} else if(70<=score&&score<80) {
			System.out.println("학점은 C");
			} else if(score<70) {
			System.out.println("학점은 F");
			} else{
			System.out.println("값을 잘못 입력하셨습니다.");
			}
		}
		}
	}

