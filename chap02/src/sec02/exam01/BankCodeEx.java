package sec02.exam01;

import java.util.Scanner;

public class BankCodeEx {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");

			String A = sc.nextLine();

				if (A.equals("1")) {
					System.out.print("예금액>");
					String B = sc.nextLine();
				} else if (A.equals("2")) {
					System.out.print("출금액>");
					String B = sc.nextLine();
				} else if (A.equals("3")) {
					System.out.print("잔고>");
					String B = sc.nextLine();
				} else if (A.equals("4")) {
					System.out.print("프로그램 종료");
					break;
				}
			}
		}

	}
