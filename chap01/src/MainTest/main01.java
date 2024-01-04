package MainTest;
import java.util.Scanner;
public class main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요>");
		int A = sc.nextInt();
		System.out.println("숫자를 입력하세요>");
		int B = sc.nextInt();
		
		System.out.println(A+B);
		
		sc.close();
	}
}