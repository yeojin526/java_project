package chap05;

import java.util.Scanner;

public class Project1_0108 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;  			// ---- ①-1 배열 scores 선언,초기화
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				// 학생수
				System.out.print("학생수: ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum]; // ---- ①-2 배열 scores 값의 총 '개수' 설정
											  // 힙 영역에 만들어지고 초기화 (모두 0)
				break;
			case 2:
				// 점수입력
				for (int i = 0; i < scores.length; i++) {
					// 여기서 scores.length 대신 studentNum으로 써줘도 됨
					System.out.print("점수" + (i + 1) + ": ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case 3:
				// 점수리스트
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수" + (i + 1) + ": " + scores[i]);
				}
				break;
			case 4:
				// 분석
				int max = 0;
				double avg = 0;
				int sum = 0;
				for (int num : scores) {
					if (max < num) {
						max = num;
					}
					sum += num;
				}
				avg = sum / scores.length;
				System.out.println("최고점수: " + max);
				System.out.println("총 점수: " + sum);
				System.out.println("평균점수: " + avg);
				break;
			case 5:
				// 종료
				run = false;
				break;
			}

		}
		System.out.println("종료");
	}
}
