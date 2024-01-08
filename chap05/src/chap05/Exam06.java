package chap05;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
//p201 6번 문제(학생 수와 각 학생들의 점수를 받아서 최고 점수 및 평균 점수 구하기)
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------");

			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = sc.nextInt();
				scores=new int[studentNum];

			} else if (selectNo == 2) {
				System.out.println("점수 입력: ");
				int num = sc.nextInt();
				scores = new int[num];
					for (int i = 0; i < scores.length; i++) {
						
						System.out.println(scores[i]);
				}
			} else if (selectNo == 3) {

			} else if (selectNo == 4) {
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
