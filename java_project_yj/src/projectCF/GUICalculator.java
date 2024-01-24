package projectCF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalculator {  

    private JFrame frame; // JFrame 객체 선언 (Frame 객체를 참조하기 위한 필드를 선언)
    private JTextField textField; // 사용자 입력을 받는 JTextField 선언 (JTextField 객체를 참조하기 위한 필드를 선언)

    public GUICalculator() {
        frame = new JFrame("GUI 계산기"); //// JFrame 객체 생성 및 타이틀 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 설정
        frame.setSize(300, 400); // 창의 크기 설정
        frame.setLayout(new BorderLayout()); // 레이아웃 매니저 설정

        textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(); // JPanel 객체 생성
        buttonPanel.setLayout(new GridLayout(4, 4)); // 4x4 그리드 레이아웃 설정

        String[] buttonLabels = { // 각 버튼에 표시될 레이블 정의
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) { // 버튼 레이블을 반복하여 처리
            JButton button = new JButton(label); // 버튼 생성
            button.addActionListener(new ButtonClickListener()); // 버튼에 ActionListener 등록
            buttonPanel.add(button); // JPanel에 버튼 추가
        }

        frame.add(buttonPanel, BorderLayout.CENTER); // 창 중앙에 버튼이 추가된 JPanel 추가

        frame.setVisible(true); // 창 표시
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource(); // 이벤트가 발생한 JButton 객체 가져오기
            String buttonText = source.getText(); // 버튼의 텍스트 가져오기
            textField.setText(textField.getText() + buttonText); // JTextField에 텍스트 추가
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUICalculator(); // GUI 계산기 객체 생성
            }
        });
    }
}
