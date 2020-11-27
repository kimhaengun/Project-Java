package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	private Container c;
	private JLabel la;
	private JTextField tf1;
	private JTextArea ta;
	public TextAreaEx() {
	c=getContentPane();
	c.setLayout(new FlowLayout());
	la = new JLabel("입력 후 <Enter>키를 입력하세요.");
	tf1 = new JTextField(20);
	ta = new JTextArea(7,20);
	
	tf1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (tf1==e.getSource());
			ta.append(tf1.getText()+"\n");
			tf1.setText("");
		}
	});
	
	
		
	c.add(la);	
	c.add(tf1);
	c.add(ta);	
	c.add(new JScrollPane(ta));
	
	setTitle("텍스트영역 만들기 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 300);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaEx();
	}

}
