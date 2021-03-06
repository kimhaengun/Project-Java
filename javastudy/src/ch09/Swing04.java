package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;


public class Swing04 extends JFrame {
	private JPanel pnorth, pcenter;
	private JButton btnopen, btnread, btnclose;
	private JLabel lajava, lahello, lalove;
	private Container c;
	private BorderLayout BorderLayout;
	
	private void initObject() {
		c=getContentPane();
		pnorth = new JPanel();
		btnopen = new JButton("Open");
		btnread = new JButton("Read");
		btnclose = new JButton("Close");
		pcenter = new JPanel();
		lajava = new JLabel("Java");
		lahello = new JLabel("Hello");
		lalove = new JLabel("Love");
	}
	private void initSetting() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		pnorth.setBackground(Color.gray);
		pcenter.setLayout(null);
		lajava.setBounds(23, 161, 57, 15);
		lahello.setBounds(155, 23, 57, 15);
		lalove.setBounds(300, 115, 57, 15);
		setVisible(true);
	}
	private void initBatch() {
		c.add(pnorth,BorderLayout.NORTH);
		pnorth.add(btnopen);
		pnorth.add(btnread);
		pnorth.add(btnclose);
		c.add(pcenter, BorderLayout.CENTER);
		pcenter.add(lajava);
		pcenter.add(lahello);
		pcenter.add(lalove);
	}
	
	public Swing04() {
		//1.필요한 오브젝트를 메모리에 로딩
		initObject();
		//2.세팅
		initSetting();
		//3.배치
		initBatch();
	}
	public static void main(String[] args) {
		new Swing04();
	}
}
