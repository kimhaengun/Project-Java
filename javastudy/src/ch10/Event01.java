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
		setTitle("�̺�Ʈ 01");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("Ŭ��");
		btn1.addActionListener(new ActionListener() {
			
			@Override //�͸�Ŭ������ ����ϴ� ��� �������̽�Ÿ������
 			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btn1==e.getSource())
					la1.setText("Ŭ�� ��");
			}
		}); 
		//1.������ ���(������ = �������̽�(�޼ҵ� ������ ���ؼ�))
		//2.JVM(OS)�� � �̺�Ʈ�� �߻��ߴ����� Ȯ��
		//3.�߻��� �̺�Ʈ�� �̺�Ʈ �й� �����忡 ���(��⿭ ���)
		//4.������� �����ʰ� �����.
		
		la1 = new JLabel("Ŭ���ȵ�");
		la1.setFont(new Font("Serif", Font.BOLD, 50));
		
		Container c= getContentPane(); //JFrame�� �⺻������ ������ �ִ� JPanel�� �����ϱ� ����.
		c.addMouseListener(new MouseAdapter() { //Adapter�� ����Ͽ� ����ϰ� �����͸� �������̵��ؼ� ���
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("���콺 Ŭ����");
			}
		});
		
		c.add(la1, BorderLayout.CENTER);
		c.add(btn1, BorderLayout.SOUTH);
		
		setVisible(true); //������ ���� ��������!! (�׸��� �׸��� �޼ҵ�)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event01();
	}


}