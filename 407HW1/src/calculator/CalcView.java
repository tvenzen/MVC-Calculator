package calculator;

import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;

import javax.swing.*;

public class CalcView extends JFrame {
	
	//Creates members for all text fields, labels, buttons, and parameters for window size.
	private final int WINDOW_WIDTH = 420;
	private final int WINDOW_LENGTH = 300;
	private JTextField firstNum = new JTextField(10);
	private JTextField secondNum = new JTextField(10);
	private JTextField resultNum = new JTextField(10);
	private JLabel firstOp = new JLabel("First Number");
	private JLabel secOp = new JLabel("Second Number");
	private JLabel resTitle = new JLabel ("Result");
	private JButton multButton = new JButton("Multiply");
	private JButton clearButton = new JButton("Clear");
	
	
	
	CalcView(){
		//Sets the title of the program, 
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WINDOW_WIDTH, WINDOW_LENGTH);
		this.setLayout(new GridLayout(3, 3));
		
		//Creates the panels to hold the objects
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		
		//We don't want the result field to be editable.
		resultNum.setEditable(false);
		
		//Adding all of the object to the panels
		panel1.add(firstOp);
		panel2.add(secOp);
		panel3.add(resTitle);
		panel4.add(firstNum);
		panel5.add(secondNum);
		panel6.add(resultNum);
		panel7.add(multButton);
		panel8.add(clearButton);
		
		//Adding all panels to build the window  
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
		add(panel8);
	}
	
	//Various getters and setters.
	
	//Returns the value of firstNum
	public int getFirstNum(){
		return Integer.parseInt(firstNum.getText());
	}
	
	//Returns the value of secondNum
	public int getSecondNum(){
		return Integer.parseInt(secondNum.getText());
	}
	
	//Returns the value of resultNum
	public int getResultNum(){
		return Integer.parseInt(resultNum.getText());
	}
	
	//Sets the result for resultNum
	public void setResult(int i){
		resultNum.setText(Integer.toString(i));
	}
	
	//Erases what was written in firstNum
	public void clearFirstNum(){
		firstNum.setText("");
	}
	
	//Erases what was written in secondNum
	public void clearSecondNum(){
		secondNum.setText("");
	}
	
	//Establishes a listener for the multButton
	void multiplyListener(ActionListener muliplyTrigger){
		multButton.addActionListener(muliplyTrigger);
	}
	
	//Establishes a listener for the clearButton.
	void clearListener(ActionListener clearTrigger){
		clearButton.addActionListener(clearTrigger);
	}
}
