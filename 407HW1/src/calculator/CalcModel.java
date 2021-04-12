package calculator;

import javax.swing.JFrame;

public class CalcModel {
	//Member to hold result
	private int resultVal; 
	
	//Method to perform the multiplication operation
	public void multiplyOperation(int numOne, int numTwo){
		resultVal = numOne * numTwo;
	}
	
	//Getter to return result.
	public int getResult(){
		return resultVal;
	}
}
