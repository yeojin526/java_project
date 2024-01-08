package chap05;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
//방법1
		int[] scores = { 83, 5, 7 }; // int scores[] 로 써도 됨. -----①
		// 선언부분이므로 대괄호 안에 숫자 쓰지 않음
		// 배열도 '참조형 변수'이므로 null로 초기화할 수 있다.

		System.out.println(scores.length);

		System.out.println("-------------------------------");
//방법2		
		int[] scores1 = new int[3]; // new를 사용함. 이 형태를 외우자.
		// ①과 같이 3개의 방이 생성되었는데, 각각의 값이 지정이 안된 상태인 것.
		// [3]: 힙 영역 생성 개수
		// 프리미티브 타입. 대괄호[]가 있으니 참조형이 되는 것.

		Scanner scan = new Scanner(System.in);
		System.out.println("생성할 정수 배열의 개수: ");
		int num = scan.nextInt();
		int[] scores2 = new int[num];

		System.out.println(scores2[0]); // 인덱스. scores1 배열의 0번째 자리 값
		System.out.println(scores2[1]); // 인덱스. scores1 배열의 1번째 자리 값
		System.out.println(scores2[2]); // 인덱스. scores1 배열의 2번째 자리 값

		System.out.println("-------------------------------");

		// 배열의 반복문
		for (int i = 0; i < 3; i++) {
			System.out.println(scores2[i]);

		}
		System.out.println("-------------------------------");

		for (int i = 0; i < scores2.length; i++) {
			System.out.println(scores2[i]);
		}
		System.out.println("-------------------------------");
		
		String[] names = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println(names[i]);
		}

	}
}
