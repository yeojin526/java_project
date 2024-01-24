package project01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleGUIApp {

    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("Simple GUI App");
        
        // JFrame 크기 설정
        frame.setSize(300, 200);
        
        // JFrame 위치 설정 - 화면 정중앙에 위치시키기
        frame.setLocationRelativeTo(null);
        
        // 닫기 버튼 동작 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 레이아웃 매니저 설정 (FlowLayout 사용)
        frame.setLayout(new FlowLayout());
        
        // 레이블 추가
        JLabel label = new JLabel("Hello, GUI!");
        frame.add(label); 
        
        // 버튼 추가
        JButton button = new JButton("Click me!");
        frame.add(button); 
        
        // JFrame을 보이도록 설정
        frame.setVisible(true);
    }
}