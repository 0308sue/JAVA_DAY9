package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PannelTest extends JFrame implements ActionListener{
	public PannelTest() {
		///super("swing test swing test");
		setTitle("swing test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("버튼1"); 
		JButton btn2 = new JButton("버튼2"); 
		JButton btn3 = new JButton("버튼3"); 
		add(btn1);
		add(btn2);
		add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		setSize(300,400);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("버튼1")) {
			 // System.out.println("버튼1 이벤트 발생");
			  getContentPane().setBackground(Color.BLUE);
		}else if(str.equals("버튼2")) {
			  //System.out.println("버튼2 이벤트 발생");
			  getContentPane().setBackground(Color.YELLOW);
		}else {
			//System.out.println("버튼3 이벤트 발생");
			 getContentPane().setBackground(Color.PINK);
		}
		System.out.println(str +" 이벤트 발생");
	}
	public static void main(String[] args) {
		new PannelTest();

	}


}