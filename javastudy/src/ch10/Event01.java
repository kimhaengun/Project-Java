package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Event01 extends JFrame{
	private JButton btn1;
	private JLabel la1;
	public Event01() {
		setTitle("이벤트 01");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("클릭");
		btn1.addActionListener(new ActionListener() {
			
			@Override //익명클래스로 사용하는 방법 인터페이스타입으로
 			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btn1==e.getSource())
					la1.setText("클릭 됨");
			}
		}); 
		//1.리스너 등록(리스너 = 인터페이스(메소드 전달을 위해서))
		//2.JVM(OS)이 어떤 이벤트가 발생했는지를 확인
		//3.발생된 이벤트를 이벤트 분배 스레드에 등록(대기열 등록)
		//4.순서대로 리스너가 실행됨.
		
		la1 = new JLabel("클릭안됨");
		la1.setFont(new Font("Serif", Font.BOLD, 50));
		
		Container c= getContentPane(); //JFrame이 기본적으로 가지고 있는 JPanel에 접근하기 위함.
		c.addMouseListener(new MouseAdapter() { //Adapter를 사용하여 사용하고 싶은것만 오버라이드해서 사용
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 클릭됨");
			}
		});
		
		c.add(la1, BorderLayout.CENTER);
		c.add(btn1, BorderLayout.SOUTH);
		
		setVisible(true); //생성자 가장 마지막에!! (그림을 그리는 메소드)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event01();
	}


}
