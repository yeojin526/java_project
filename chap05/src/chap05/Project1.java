package sec03.exam01;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;  // ---- ①-1 배열 scores 선언,초기화
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
				break;
			case 2:
				// 점수입력 
				for(int i=0; i<scores.length; i++) {    
							//여기서 scores.length 대신 studentNum으로 써줘도 됨
					System.out.print("점수: ");
					scores[i]=Integer.parseInt(scanner.nextLine());
				}
				break;
			case 3:
				// 점수리스트
				System.out.println("점수리스트");
				break;
			case 4:
				// 분석
				System.out.println("분석");
				break;
			case 5:
				// 종료
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
