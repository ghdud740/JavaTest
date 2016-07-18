package Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class CalculatorDemoMain2 {

	public static void main(String[] args) {
	
		
		JFrame frame =new JFrame("����");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(300,250));
		Container contentpane = frame.getContentPane();
		JButton button = new JButton();
		GridLayout Layout = new GridLayout(4,4,5,5);
		Font font = new Font("����ü",Font.BOLD,25);
		Panel panel1 =new Panel(); //�ؽ�Ʈ �ڽ� �г� 
		Panel panel2 =new Panel(); //��ư �г�
		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		text1.setEditable(false);
		text2.setEditable(false);
		text1.setHorizontalAlignment(text1.RIGHT);
		text2.setHorizontalAlignment(text2.RIGHT);
		panel1.add(text1);
		panel1.add(text2);
//		BoxLayout BoxLayout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
		panel1.setLayout(Layout);
		panel2.setLayout(Layout);
		contentpane.add(panel1,BorderLayout.NORTH);
		contentpane.add(panel2,BorderLayout.CENTER);

		ArrayList<String> list = new ArrayList<String>();
		list.add("1"); list.add("2"); list.add("3"); list.add("+");
		list.add("4"); list.add("5"); list.add("6"); list.add("-");
		list.add("7"); list.add("8"); list.add("9"); list.add("*");
		list.add("C"); list.add("0"); list.add("="); list.add("/");
		
		
		ArrayList<Integer> Numlist = new ArrayList<Integer>();
		ArrayList<String> Strlist = new ArrayList<String>();
		ActionListener listener = new WindowHelloClickListner2(list,Numlist,Strlist,text1,text2);
		for(int i=0;i<list.size();i++){
			button = new JButton(list.get(i));
			button.addActionListener(listener);
			panel2.add(button);
		}

		frame.pack();
		frame.setVisible(true);
	}
}
