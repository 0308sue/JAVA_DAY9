package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PannelTest2  extends JFrame{
	
	public PannelTest2() {
		setTitle("inner class test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("버튼1"); 
		JButton btn2 = new JButton("버튼2"); 
		JButton btn3 = new JButton("버튼3"); 
		add(btn1);
		add(btn2);
		add(btn3);
		ActionH ah = new ActionH();
		btn1.addActionListener(ah);
		btn2.addActionListener(ah);
		btn3.addActionListener(ah);
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PannelTest2();

	}
  //내부클래스
	class ActionH implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			if(str.equals("버튼1")) {
			  getContentPane().setBackground(Color.GRAY);
			}else if(str.equals("버튼2")) {
				getContentPane().setBackground(Color.GREEN);
			}else {
				getContentPane().setBackground(Color.CYAN);
			}
		}

	}
}//class