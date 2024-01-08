package chap05;

public class Exam05 {

	public static void main(String[] args) {
//		int[] array = {83,90,87}            //두줄 모두 같은 의미
		int[] array = new int[] { 83, 90, 87 };

		// 총점, 평균, 출력

		int sum = 0; // 총점
		double avg; // 평균

		for (int num : array) {
// 			배열의타입 원하는변수명 : 배열이름
			sum += num;
//         (변수)   (피연산자)
//          변수 = 변수 + 피연산자			
		}
		System.out.println("총합: " + sum);

		avg = (double) sum / array.length;
		System.out.println("평균 " + avg);
	}

}
