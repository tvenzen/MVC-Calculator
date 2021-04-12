package calculator;

public class CalcHead {
	public static void main(String[] args){
		//Initializing objects.
		CalcView cView = new CalcView();
		CalcModel cModel = new CalcModel();
		CalcController cController = new CalcController(cModel, cView);
		
		//Sets the window to be visible. 
		cView.setVisible(true);
	}
}
