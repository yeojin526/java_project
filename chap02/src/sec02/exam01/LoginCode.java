package sec02.exam01;

import java.util.Scanner;

public class LoginCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("아이디: ");
		String name = sc.nextLine();
		
		System.out.print("비밀번호: ");
		String strPassward = sc.nextLine();
		int password = Integer.parseInt(strPassward);
		
	  //String name1 ="java";
		int pw1 =12345;
		

	    if(name.equals("java")){
	  //if(name==name1) {
			if(password==pw1) {
				System.out.println("로그인 성공");
				}else {
				System.out.println("로그인 실패: 패스워드가 틀림");
				}
			} else{
		System.out.println("로그인 실패:아이디 존재하지 않음");
			}
	}
}
