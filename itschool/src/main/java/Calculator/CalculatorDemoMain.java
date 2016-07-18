package Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kr.ac.itschool.gui.WindowHelloClickListner;

public class CalculatorDemoMain {

 public static void main(String[] args) {
  JFrame frame = new JFrame("Calculate");
  frame.setLocation(500,400);
  frame.setPreferredSize(new Dimension(400,300));
  
  
  Container content = frame.getContentPane();
  JLabel name = new JLabel("°è»ê±â");
  JTextField text = new JTextField(20);
  JButton Button1 = new JButton("+");
  JButton Button2 = new JButton("-");
  JButton Button3 = new JButton("*");
  JButton Button4 = new JButton("/");
  JButton cancel = new JButton("C");
  
  JPanel panel1 = new JPanel();
  panel1.add(Button1);
  panel1.add(Button2);
  panel1.add(Button3);
  panel1.add(Button4);
  panel1.add(cancel);
  
  JPanel panel2 = new JPanel();
  JTextField text1 = new JTextField(5);
  JLabel label1 = new JLabel("       ");
  JTextField text2 = new JTextField(5);
  JTextField text3 = new JTextField(5);
  JLabel label2 = new JLabel("=");
  
  panel2.add(text1);
  panel2.add(label1);
  panel2.add(text2);
  panel2.add(label2);
  panel2.add(text3);
  
  
  content.add(name, BorderLayout.CENTER);
  content.add(panel1,BorderLayout.SOUTH);
  content.add(panel2,BorderLayout.CENTER);

  ActionListener listener =new WindowHelloClickListner(text1,text2, text3,label1,label2,Button1,Button2,Button3,Button4,cancel);
  Button1.addActionListener(listener);
  Button2.addActionListener(listener);
  Button3.addActionListener(listener);
  Button4.addActionListener(listener);
  cancel.addActionListener(listener);
  
  frame.pack();
  frame.setVisible(true);
 }




}





	

