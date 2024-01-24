package projectCF;

	import javax.swing.*;
	import javax.swing.event.ListSelectionEvent;
	import javax.swing.event.ListSelectionListener;

	public class SimpleSwingListExample { //배열을 이용하여 간단한 JList를 생성하는 Swing 코드의 예시

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> createAndShowGUI());
	    }

	    private static void createAndShowGUI() {
	        JFrame frame = new JFrame("Simple Swing List Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        String[] dataList = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

	        JList<String> itemList = new JList<>(dataList);
	        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        itemList.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    // 선택이 변경되었을 때의 동작
	                    int selectedIndex = itemList.getSelectedIndex();
	                    if (selectedIndex != -1) {
	                        System.out.println("Selected item: " + dataList[selectedIndex]);
	                    }
	                }
	            }
	        });

	        JScrollPane scrollPane = new JScrollPane(itemList);
	        frame.getContentPane().add(scrollPane);

	        frame.setSize(300, 200);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
	}
//이 코드는 간단한 JList를 만들고, 선택된 항목이 변경될 때 콘솔에 출력하는 예시입니다. 
//리스트의 항목은 String 배열을 이용하여 정의되었습니다. 코드에서는 익명 클래스를 사용하여 ListSelectionListener를 구현하고, 
//선택이 변경될 때의 동작을 정의하였습니다.