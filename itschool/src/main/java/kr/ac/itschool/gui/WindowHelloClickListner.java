package kr.ac.itschool.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class WindowHelloClickListner implements  ActionListener {
	private JTextField text;
	private JLabel label;
	private JButton Button1;
	private JButton cancel;
	private JPanel panel1;


	public WindowHelloClickListner(JTextField text,JLabel label,JButton button1,JButton cancel, JPanel panel1)
	{

		this.text = text;
		this.label = label;
		this.Button1 = Button1;
		this.cancel = cancel;



	}
		
	public void actionPerformed(ActionEvent e) {

		String gettext=e.getActionCommand();
		
		if(gettext.equals(cancel))
		{
			text.setText("");
			label.setText("Hello");
		}
		label.setText(label.getText()+text.getText());
		
	}
	
}
