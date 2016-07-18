package Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WindowHelloClickListner2 implements ActionListener {
		private ArrayList<String> list;       
		private ArrayList<String> Numlist = new ArrayList<String>();    //���ڸ� ����
		private ArrayList<String> Strlist = new ArrayList<String>();     //��ȣ�� ����
		private JTextField text1;			   //�ؽ�Ʈ�ڽ� ����â
		private JTextField text2;			   //�ؽ�Ʈ�ڽ� ���â
		private JFrame frame;				   //���â ��޸���.
		private String Num;                     //���� �� ���� ����
		private int result;					//���갪 ���� ����		
		private int temp1;				//���� ���� �ӽ� ���� ����
		private String temp;				//Calculator ��ȣ �ӽ� ����
		private int Num1;
		
	public WindowHelloClickListner2(ArrayList<String> list2, ArrayList<Integer> numlist, ArrayList<String> strlist,
			JTextField text1, JTextField text2) {
		this.list = list;
		this.text1 = text1;
		this.text2 = text2;
		this.frame = frame;
		this.Numlist = Numlist;
		this.Strlist = Strlist;
		this.Num = Num;
		this.result = result;
		this.temp1 = temp1;
		this.temp = temp;
		this.Num1 = Num1;
	}
	//���κκ�
	public void actionPerformed(ActionEvent e) {
		result = 0;
		String getValue=e.getActionCommand();
		text1.setText(text1.getText()+getValue); 
		boolean intchk= false;
		intchk=Chknum(text1.getText());
		 ArrayList<String> nike=NumlistDemo(Num,intchk,Numlist,getValue);   //�����϶� ��Ӵ���

		//���ڿ� ����
		if(!intchk)
		{
			
		if(getValue.equals("+"))
		Strlist.add(getValue);
		else if(getValue.equals("-"))
			Strlist.add(getValue);
		else if(getValue.equals("*"))
			Strlist.add(getValue);
		else if(getValue.equals("/"))
			Strlist.add(getValue);
		else if(getValue.equals("C")){
			JOptionPane.showMessageDialog(frame, "��µǶ�");
			text1.setText("");
			text2.setText("");
			result=0;
			Strlist = new ArrayList<String>();
			Numlist = new ArrayList<String>();
		}
		}
		int result2 = Calcurator(result,intchk,Numlist,Strlist,temp1);
		String finalresult = Integer.toString(result2);	
		
		if(getValue.equals("=")){
			text2.setText(finalresult);	
		}			
	}
	// ���ڸ� �ɷ����� �޼���
	boolean Chknum(String str){
		boolean intchk = false;
		try {	
			Integer.parseInt(str);
			intchk = true;
		} catch (Exception e) {
		}
		return intchk;
	}
	//���� �϶� ��Ӵ��� �޼���
	ArrayList<String> NumlistDemo(String Num1,boolean intchk,ArrayList<String> Numlist,String getValue){
		Num ="";
		if(intchk){
			Num+=Integer.parseInt(getValue);
		}
		Numlist.add(Num);
		return Numlist;
	}
	int Calcurator(int result,boolean intchk,ArrayList<String> Numlist,ArrayList<String> Strlist,int temp1){
		String nike =" ";
		 String nike3 =" ";
		for(String nike2:Strlist){
			nike3+=nike2;
		}
		if(intchk){
		for(int i=0;i<Numlist.size();i++){
			nike=Numlist.get(i);}
		temp1= Integer.parseInt(nike);
		}	
		if(!intchk){
			switch(nike3){
			case "+" : result+=temp1; break;
			case "-" : result-=temp1; break;
			case "*" : result*=temp1; break;
			case "/" : result/=temp1; break;
			}
		}
		
		return result;
	}

}
	



