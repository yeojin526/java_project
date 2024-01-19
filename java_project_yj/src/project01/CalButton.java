package project01;

import java.awt.Container;

import javax.swing.JButton;

public class CalButton {
	JButton jb1 = new JButton("1");
	JButton jb2 = new JButton("2");
	JButton jb3 = new JButton("3");
	JButton jb4 = new JButton("4");
	JButton jb5 = new JButton("5");
	JButton jb6 = new JButton("6");
	JButton jb7 = new JButton("7");
	JButton jb8 = new JButton("8");
	JButton jb9 = new JButton("9");
	JButton jb0 = new JButton("0");

	JButton jb11 = new JButton("+"); // 버튼11: 더하기
	JButton jb22 = new JButton("-"); // 버튼22: 빼기
	JButton jb33 = new JButton("×"); // 버튼33: 곱하기
	JButton jb44 = new JButton("÷"); // 버튼44: 나누기
	JButton jb55 = new JButton("="); // 버튼55: 연산 결과

	JButton jbremove1 = new JButton("←");
	JButton jbremoveAll = new JButton("C");

	JButton jbDot = new JButton(".");

	public void firstLine() {//첫번째줄 (+, -, ×, ÷)
		jb11.setLocation(2, 75);
		jb11.setSize(50, 30);

		jb22.setLocation(55, 75);
		jb22.setSize(52, 30);

		jb33.setLocation(110, 75);
		jb33.setSize(52, 30);

		jb44.setLocation(165, 75);
		jb44.setSize(55, 30);
	}

	public void secondLine() {//두번째줄(7,8,9,한칸지우기(←))
		jb7.setLocation(2, 110);
		jb7.setSize(50, 50);

		jb8.setLocation(55, 110);
		jb8.setSize(52, 50);

		jb9.setLocation(110, 110);
		jb9.setSize(52, 50);

		jbremove1.setLocation(165, 110);
		jbremove1.setSize(55, 50);
	}

	public void thirdLine() {//세번째줄(4,5,6,전체지우기(C))
		jb4.setLocation(2, 165);
		jb4.setSize(50, 50);

		jb5.setLocation(55, 165);
		jb5.setSize(52, 50);

		jb6.setLocation(110, 165);
		jb6.setSize(52, 50);

		jbremoveAll.setLocation(165, 165);
		jbremoveAll.setSize(55, 50);
	}

	public void forthLine() { //네번째줄(1,2,3,결과(=))
		jb1.setLocation(2, 220);
		jb1.setSize(50, 50);

		jb2.setLocation(55, 220);
		jb2.setSize(52, 50);

		jb3.setLocation(110, 220);
		jb3.setSize(52, 50);

		jb55.setLocation(165, 220);
		jb55.setSize(55, 95);
	}

	public void finalLine() {//다섯번째줄(=마지막줄)(0)
		jb0.setLocation(2, 275);
		jb0.setSize(160, 40);
	}

}
