package Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WindowHelloClickListner implements  ActionListener  {

 private JTextField text1;
 private JTextField text2;
 private JTextField text3;
 private JLabel label1;
 private JButton button1;
 private JButton button2;
 private JButton button3;
 private JButton button4;
 private JButton cancel;
 private JFrame frame = new JFrame();

 WindowHelloClickListner(JTextField text1, JTextField text2, JTextField text3,
			JLabel label1, JLabel label2, JButton button1, JButton button2, JButton button3, JButton button4,
			JButton cancel)
 {
  this.text1=text1;
  this.text2=text2;
  this.text3=text3;
  this.label1=label1;
  this.button1=button1;
  this.button2=button2;
  this.button3=button3;
  this.button4=button4;
  this.cancel=cancel;
  this.frame = frame;
 }
 public void actionPerformed(ActionEvent e) {
  int result=0;
  // �������� ��ư�� ����.
  String gettext=e.getActionCommand();
  //���ڰ� �ԷµǴ���, ������ return
  boolean intchk = CheckNum(text1.getText());
  if(!intchk){
   JOptionPane.showMessageDialog(frame, "num1");
   return ;
  }
  intchk = CheckNum(text2.getText());
  if(!intchk){
   JOptionPane.showMessageDialog(frame, "num2");
   return ;
  }
  int a = Integer.parseInt(text1.getText());
  int b = Integer.parseInt(text2.getText());
  //������ ���� 0 �̸� �޽��� ��� �� ����
  if(gettext.equals("/") && (b==0) ){
  JOptionPane.showMessageDialog(frame, "!");
  return ;
  }
  // ���� ��Ģ���� 
  if(gettext.equals("+"))
   result = a+b;
  else if(gettext.equals("-"))
   result = a-b;
  else if(gettext.equals("*"))
   result = a*b;
  else if(gettext.equals("/"))
   result = a/b;
  // C�� �������� �ʱ�ȭ.
  else if(gettext.equals("C")){
   text1.setText(" ");
   text2.setText("");
   text3.setText("");
   label1.setText("");
   JOptionPane.showMessageDialog(frame, "!");
  }
  //��Ʈ������ ��ȯ�Ͽ� ������� ������ ��� �ؽ�Ʈâ�� �־���.
  String test = Integer.toString(result);
  text3.setText(test);
 }
 //���ڸ� üũ ���ִ� �޼���
  boolean CheckNum(String str){
   boolean intchk = false;
   try {
    Integer.parseInt(str);
    intchk = true;
   } catch (Exception e2) {
    System.out.println(e2.getMessage());
   }
   return intchk;
  }
 }