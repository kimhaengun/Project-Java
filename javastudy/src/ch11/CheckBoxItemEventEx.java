package ch11;

import java.awt.Checkbox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {
private Container c;
private JLabel latext, laresult;
private JCheckBox [] fruits = new JCheckBox [3];
private String [] name = {"���","��","ü��"};
private int sum =0;
private int ��� = 100;
private int �� = 500;
private int ü�� = 20000;
	public CheckBoxItemEventEx() {
	c = getContentPane();
	c.setLayout(new FlowLayout());
	latext = new JLabel("��� 100��, �� 500��, ü�� 20000��");
	c.add(latext);
	for (int i = 0; i < fruits.length; i++) {
		fruits[i] = new JCheckBox(name[i]);
		fruits[i].addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() == ItemEvent.SELECTED) {
				if(fruits[0]==e.getItem())
				sum=sum+���;
				
				if(fruits[1]==e.getItem())
					sum=sum+��;
					
				if(fruits[2]==e.getItem())
					sum=sum+ü��;
				}else {
				if (e.getItem()==fruits[0]) 
					sum=sum-���;
				if (e.getItem()==fruits[1]) 
					sum=sum-��;
				if (e.getItem()==fruits[2]) 
					sum=sum-ü��;
				}
				laresult.setText("����"+sum+"���Դϴ�.");
			}
		});
		c.add(fruits[i]);
	}
	
	laresult = new JLabel("���� "+sum+"���Դϴ�.");
	
	
	c.add(laresult);
		
		
	setTitle("üũ�ڽ��� itemevent");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(250, 200);
	setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}//end of main

}