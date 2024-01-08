package chap05;

import java.util.Random;
import java.util.Scanner;

public class LottoEx {

	public static void main(String[] args) {
		int[] lotto = new int[6]; // 인덱스는 0~5번(값의 개수는 6개)

		Random rd = new Random();
/*		lotto[0] = rd.nextInt();
		lotto[1] = rd.nextInt();
		lotto[2] = rd.nextInt();
		lotto[3] = rd.nextInt();
		lotto[4] = rd.nextInt();
		lotto[5] = rd.nextInt();
*/
/*		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호: ");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1; // (45)가 0~44까지 이므로 +1
			System.out.println(lotto[i]);
		}  */
		System.out.println("-------------------------------");

		// 웹개발에서 자주 사용하는 배열의 반복문
		for (int val : lotto) {
			// 향상된 반복문. 'val'부분 변수명은 내맘대로 쓰면 됨.
			// 인덱스를 안 구할거면 이거 쓰는게 좋음 (인덱스 위치별 값을 구하는게 필요 없다면)
			lotto[i] = rd.nextInt(45) + 1;
			System.out.println(val); 
		}

	}

}
