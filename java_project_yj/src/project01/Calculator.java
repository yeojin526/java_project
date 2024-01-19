package project01;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener, MouseListener {
	// 액션(동작) 관련 이벤트
	//이거 추가가가ㅏ가
	CalButton but = new CalButton();
	JTextField t1 = new JTextField(); // 입력창 (숫자 입력 공간)

	@Override
	public void actionPerformed(ActionEvent e) { // 어떤 액션(동작)을 할 것인가?
		switch (e.getActionCommand()) {
		case "+":
			//앞에 입력한 것 + 뒤에 입력한 것 실행하는 코드 필요
			break;
		case "-":
			//앞에 입력한 것 - 뒤에 입력한 것 실행하는 코드 필요
			break;
		case "×":
			//앞에 입력한 것 × 뒤에 입력한 것 실행하는 코드 필요
			break;
		case "÷":
			//앞에 입력한 것 ÷ 뒤에 입력한 것 실행하는 코드 필요
			break;
		case "=":
			System.out.println("=");
			break;
		default:
			break;
		}// 클래스가 인터페이스(ActionListener)를 구현하면,
			// 그 클래스는 **인터페이스에서 정의된 메서드(actionPerformed)를 반드시 구현**해야 함
	}

	public Calculator() {
		Container con = this.getContentPane();
		con.setLayout(null);
		con.addMouseListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(240, 360);
		this.setTitle("정수 사칙연산 계산기");
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		t1.setLocation(2, 2); // 입력창 컴포넌트 세팅
		t1.setSize(220, 70);
		con.add(t1);

		// 첫번째줄 버튼들(+, -, ×, ÷)
		but.firstLine();
		con.add(but.jb11);
		con.add(but.jb22);
		con.add(but.jb33);
		con.add(but.jb44);

		// 두번째줄 버튼들(7, 8, 9, ←)
		but.secondLine();
		con.add(but.jb7);
		con.add(but.jb8);
		con.add(but.jb9);
		con.add(but.jbremove1);

		// 세번째줄 버튼들(4, 5, 6, C)
		but.thirdLine();
		con.add(but.jb4);
		con.add(but.jb5);
		con.add(but.jb6);
		con.add(but.jbremoveAll);

		// 네번째줄 버튼들(1, 2, 3, =)
		but.forthLine();
		con.add(but.jb1);
		con.add(but.jb2);
		con.add(but.jb3);
		con.add(but.jb55);

		// 다섯번째줄 버튼(=마지막줄)(0)
		but.finalLine();
		con.add(but.jb0);
	}

	public static void main(String... ar) {
		new Calculator();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + ", " + e.getY());

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
//**간단한 계산기 구현:**
//- 덧셈, 뺄셈, 곱셈, 나눗셈 등의 기본적인 연산을 수행하는 
//	간단한 계산기를 만들어보세요. 
//사용자로부터 입력을 받아 계산 결과를 출력하는 형태로 구현할 수 있습니다.
//- 사용자로부터 숫자와 연산자를 입력받아 계산을 수행하는 
//콘솔 기반의 간단한 계산기를 만들어보세요.