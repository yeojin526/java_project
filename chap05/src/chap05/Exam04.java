package chap05;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int index = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 개수: ");
		int count = sc.nextInt();
		int[] intNum = new int[count];

		for (int i = 0; i < intNum.length; i++) {
			System.out.print("정수 입력: ");
			// 입력 받는 부분
			intNum[i] = sc.nextInt();

		}
		int i = 0;
		int max = 0;
		for (int val : intNum) {
			if (max < val) {         
				max = val;
				index = i;
			}
			i++;
		}		System.out.println("최대값: "+max);

		System.out.println("최대값 인덱스: "+index);
	}
}
// 최대값 구해서 출력

//  	-----------------------------------------------			
//		int[] array = { 1, 5, 3, 8, 2 };

//		for (int i = 0; i < array.length; i++) {
//			if (max < array[i]) { // max 값과 배열의 값을 비교
//			max = array[i]; // max보다 큰 값을 max에 저장
//				index = i;
//			}
//		System.out.println("-------------------------------");

//		int i = 0;
//		for (int num : array) {
// 			배열의타입 원하는변수명 : 배열이름
//			if (max < num) {
//				max = num;
//				index = i;
//			}
//			i++;
//		}
//		System.out.println("최대값: " + max);
//	}

//		System.out.println("인덱스: " + index);
//}
