package sec03.exam01;

import java.util.Scanner;

public class KeyCodeExample {

	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 String inputData;
		 
		 while(true){
			 System.out.println("입력>");
			 inputData = sc.nextLine();
			 System.out.printf("입력된 문자열:%s\n", inputData);
			 if(inputData.equals("q")) {
				 break;
			 }
		 }
		 System.out.println("종료");
}
}
