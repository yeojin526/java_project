package projectCF;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        String[] buttonLabels = {"Button 1", "Button 2", "Button 3"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);

            // 익명 내부 클래스를 사용한 ActionListener
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(label + " clicked!");
                }
            });

            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
