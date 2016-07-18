package kr.ac.itschool.gui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class WindowHellowMain {
static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		JFrame frame = new JFrame("Title");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(200,150));
		
		Container contentpane = frame.getContentPane();
		JTextField text = new JTextField(20);
		JLabel label = new JLabel();
		JButton button1 = new JButton();
		JButton cancel= new JButton();

		JPanel panel1 = new JPanel();
		panel1.add(button1);
		panel1.add(cancel);
		contentpane.add(text, BorderLayout.CENTER);
		contentpane.add(label, BorderLayout.NORTH);
		contentpane.add(panel1, BorderLayout.SOUTH);
		
		
		ActionListener listener = new WindowHelloClickListner( text,label, button1,cancel,panel1);
		button1.addActionListener(listener);
		cancel.addActionListener(listener);
		frame.pack();
		frame.setVisible(true);
		
		
		
	}

}
