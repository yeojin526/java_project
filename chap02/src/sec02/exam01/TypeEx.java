package sec02.exam01;

public class TypeEx {

	public static void main(String[] args) {
		String str3 = "3.14";
		double value = Double.parseDouble(str3); //문자열을 실수로 만들기
		
		String str2 = "" + 10 + 2; //문자열로 만들기
		System.out.println(str2);
		int num1 = Integer.parseInt(str2); //문자열을 정수로 만들기

		String str = 10 + 2 + "";
		System.out.println(str);

		String str1 = String.valueOf(10 + 2); //(정석)문자열로 만들기
		System.out.println(1 / 2.0);
	}

}
