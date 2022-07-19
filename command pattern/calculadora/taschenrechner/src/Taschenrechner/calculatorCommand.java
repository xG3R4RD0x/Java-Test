package Taschenrechner;

import Taschenrechner.calculator.OpCode;

public class calculatorCommand implements command {

    private calculator calculator;
    private double operand;
    private OpCode opcode;
    private double operand1;

    public calculatorCommand(calculator t,double operand1, double operand,OpCode opcode){
        this.calculator=t;
        this.operand=operand;
        this.opcode=opcode;
        this.operand1=operand1;
    }

    @Override
    public void execute() {
        calculator.operation(opcode,operand1,operand);
    }
    
}
