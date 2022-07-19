package Taschenrechner;

import java.util.Observable;

public class Taschenrechner extends Observable {
	
	enum OpCode { PLUS, MINUS, DIV, MULT, EQ }
	double result;
	OpCode opcode;
	
	public Taschenrechner() {
		opcode = OpCode.PLUS;
	}
	
	public void setOpcode(OpCode o) {
		opcode = o;
	}
	
	public void setResult(double operand) {
		this.result = operand;
		this.setChanged();
		this.notifyObservers();
		
	}
	public double getResult() { return result; }
	
	public void berechne(double operand) {
		
		
		switch (opcode) {
		
		case PLUS:
				result += operand;
				break;
		case MINUS:
			result -= operand;
			break;
		case DIV:
			if (operand != 0)
				result /= operand;
			break;
		case MULT:
			if (operand != 0)
				result *= operand;
			break;
			
		}
		this.setChanged();
		this.notifyObservers();
	}
	
	
	

}
