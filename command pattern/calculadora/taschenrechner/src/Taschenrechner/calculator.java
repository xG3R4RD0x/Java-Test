package Taschenrechner;

import java.util.Stack;

public class calculator {

    public calculator(){
        opcode=OpCode.PLUS;
        current=0.0;

        }    
    
    private double current ;
    private double operand1;
    private Stack<Double> StateStack = new Stack<Double>(); 

    enum OpCode { PLUS, MINUS, DIV, MULT, undo, clear }
    OpCode opcode;

        public void compute(){ //send Command
            StateStack.push(current); //saved State for undo
            command c = new calculatorCommand(this,operand1,current,opcode);
            c.execute(); // ejecuto el comando
        }


        public void operation(OpCode opCode, double operand1, double operand) {

            switch (opCode) {
                case PLUS:
                    current=operand1+operand;
                    break;
                case MINUS:
                    current=operand1-operand;
                    break;
                case MULT:
                    current=operand1*operand;
                    break;
                case DIV:
                    current=operand1/operand;
                    break;
                case undo:
                    StateStack.pop();
                    current=StateStack.pop();
                    break;
                case clear:
                    current=0.0;
                    break;    
                }

        }
        
        public double getCurrent() {
            return this.current;
        }
    
        public void setCurrent(double current) {
            this.current = current;
        }
    
        public OpCode getOpcode() {
            return this.opcode;
        }
    
        public void setOpcode(OpCode o) {
            opcode = o;
        }  
        public double getOperand1() {
            return this.operand1;
        }
    
        public void setOperand1() {
            this.operand1 = current;
        }


}
