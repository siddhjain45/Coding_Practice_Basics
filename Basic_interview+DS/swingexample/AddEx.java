package swingexample;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
class Base extends JFrame
{
	Base(){}
	Base(String s){
		super(s);
	}

	
	JLabel l1,l2,l3,l4;
	JTextArea t1,t2;
	JButton b1,b2,b3,b4;
	void setComponents()
	{
		l1 = new JLabel(" Siddharth's personal Calculator");
		l2 = new JLabel(" Enter First Number");
		l3 = new JLabel(" Enter Second Number");
		l4 = new JLabel();
	    t1 = new JTextArea();
	    t2 = new JTextArea();
	    b1 = new JButton("Add");
	    b2 = new JButton("Substract");
	    b3 = new JButton("Multiply");
	    b4 = new JButton("Divide");
	    setLayout(null);
	    l1.setBounds(100, 50, 200, 20);
        l1.setForeground(Color.BLUE);
        l1.setBackground(Color.BLACK);
        
        l2.setBounds(20, 80, 150, 20);
	    t1.setBounds(170, 80, 200, 20);
	    l3.setBounds(20, 110, 150, 20);
        t2.setBounds(170, 110, 200, 20);
        b1.setBounds(50, 150, 90, 20);
        b2.setBounds(150, 150, 90, 20);
        b3.setBounds(260, 150, 90, 20);
        b4.setBounds(380, 150, 90, 20);
        l4.setBounds(70, 200, 200, 20);
        b1.addActionListener(new sum());
        b2.addActionListener(new sub());
        b3.addActionListener(new mult());
        b4.addActionListener(new divi());
        add(l1);
	    add(l2);
	    add(t1);
	    add(l3);
	    add(t2);
	    add(b1);
	    add(b2);
	    add(b3);
	    add(b4);
	    add(l4);
	    
	    
	}
	
	

class sum implements ActionListener
{

	public void actionPerformed(ActionEvent e) {
         int a = Integer.parseInt(t1.getText());
         int b = Integer.parseInt(t2.getText());
         int s = a+b;
         l4.setText("Sum of two number is  "+s);
		
	}
	
}
class sub implements ActionListener
{

	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int s = a-b;
        l4.setText("substraction of two number is  "+s);
		
	}
	
}
class mult implements ActionListener
{
	public void actionPerformed(ActionEvent e) {
		long a = Integer.parseInt(t1.getText());
        long b = Integer.parseInt(t2.getText());
        long s = a*b;
        l4.setText("Multiplication of two number is  "+s);
		
	}	
}
class divi implements ActionListener
{
	public void actionPerformed(ActionEvent e) {
		try{
		int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int s = a/b;
        l4.setText("division of two number is  "+s);
		}
		catch(Exception E){
			E.getStackTrace();
			l4.setText("Not divisible by 0");
		}
	}
}
}






public class AddEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Base jf = new Base("Calculator (GUI)");
       jf.setComponents();
    jf.setSize(500, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
