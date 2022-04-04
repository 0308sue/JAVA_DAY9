package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PannelTest3  extends JFrame{
	
	public PannelTest3() {
		setTitle("익명 class test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("버튼1"); 
		JButton btn2 = new JButton("버튼2"); 
		JButton btn3 = new JButton("버튼3"); 
		add(btn1);
		add(btn2);
		add(btn3);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.CYAN);
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.BLUE);
				
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.YELLOW);
				
			}
		});
		
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PannelTest3();
	}

}//class





