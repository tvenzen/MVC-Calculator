package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JOptionPane;

public class CalcController {
	//Sets the members of CalcController to the view and model
	private CalcModel cModel;
	private CalcView cView;
	
	//Constructor for CalcController
	public CalcController(CalcModel cModel, CalcView cView){
		this.cModel = cModel;
		this.cView = cView;
		
		this.cView.multiplyListener(new MultListener());
		this.cView.clearListener(new ClearListener());
	}
	
	class MultListener implements ActionListener{
		//Establishes the actionPerformed from the ActionListener interface to cause operations to trigger
		public void actionPerformed(ActionEvent e){
			//Members to hold values from the two user input text fields.
			int firstNum = 0;
			int secondNum = 0;
			
			try{
				
				firstNum = cView.getFirstNum();
				secondNum = cView.getSecondNum();
				
				//Multiplication occurs through this method.
				cModel.multiplyOperation(firstNum, secondNum);
				
				//Sets the result in the view.
				cView.setResult(cModel.getResult());
			}
			catch(Exception t){
				JOptionPane.showMessageDialog(cView, "An Error Occured");
			}
		}
		
	}
	
	class ClearListener implements ActionListener{
		//Establishes the actionPerformed from the ActionListener interface to cause operations to trigger
		public void actionPerformed(ActionEvent e){
			try{
				//Clears texts fields and sets result to 0.
				cView.clearFirstNum();
				cView.clearSecondNum();
				cView.setResult(0);
			}
			catch(Exception t){
				JOptionPane.showMessageDialog(cView, "An Error Occured");
			}
		}
	}
}
