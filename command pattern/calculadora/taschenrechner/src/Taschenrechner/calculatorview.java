package Taschenrechner;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Taschenrechner.calculator.OpCode;


public class calculatorview extends JFrame {

    calculator calculator;
	JButton eins, zwei, drei, vier, fuenf, sechs, sieben, acht, neun, nul,
			slash, mal, minus, punkt, gleich, plus, undo, clear;

	JLabel resultLabel;

	NumberHandler nHandler = new NumberHandler();
	OpHandler opHandler = new OpHandler();
	String  input= new String(); //String to show in label

    public void update(){
        resultLabel.setText(String.valueOf(calculator.getCurrent()));

    }

    class NumberHandler implements ActionListener {

        public void actionPerformed(ActionEvent a) {
			Object o = a.getSource();

			if (o == nul)
				input +="";
			if (o == eins)
				input +="1";
			if (o == zwei)
				input +="2";
			if (o == drei)
				input +="3";
			if (o == vier)
				input +="4";;
			if (o == fuenf)
				input +="5";;
			if (o == sechs)
				input +="6";
			if (o == sieben)
				input +="7";
			if (o == acht)
				input +="8";
			if (o == neun)
				input +="9";
			
			calculator.setCurrent(Double.parseDouble(input)); //es el numero actual
			update();
		}
	}
	
	class OpHandler implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			Object o = a.getSource();
			input = "";
			if (o == slash){
				calculator.setOpcode(OpCode.DIV);
                calculator.setOperand1();}
			if (o == mal){
				calculator.setOpcode(OpCode.MULT);
                calculator.setOperand1();}
			if (o == minus){
				calculator.setOpcode(OpCode.MINUS);
                calculator.setOperand1();}
			if (o == plus){
				calculator.setOpcode(OpCode.PLUS);
                calculator.setOperand1();}
			if(o== undo){
                calculator.setOpcode(OpCode.undo);
                calculator.compute();
                update();}
			if(o== clear){
                calculator.setOpcode(OpCode.clear);
                calculator.compute();
                update();}
            if(o == gleich){
			    calculator.compute();
                update();}


		}
	}
    public calculatorview(calculator calculator) {
		this.calculator = calculator;

		resultLabel = new JLabel("0.", SwingConstants.RIGHT);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5, 4));

		sieben = new JButton("7");
		sieben.addActionListener(nHandler);

		p.add(sieben);
		acht = new JButton("8");
		acht.addActionListener(nHandler);
		p.add(acht);
		neun = new JButton("9");
		neun.addActionListener(nHandler);
		p.add(neun);
		slash = new JButton("/");
		slash.addActionListener(opHandler);
		p.add(slash);
		vier = new JButton("4");
		vier.addActionListener(nHandler);
		p.add(vier);
		fuenf = new JButton("5");
		fuenf.addActionListener(nHandler);
		p.add(fuenf);
		sechs = new JButton("6");
		p.add(sechs);
		sechs.addActionListener(nHandler);
		mal = new JButton("*");
		mal.addActionListener(opHandler);
		p.add(mal);
		eins = new JButton("1");
		eins.addActionListener(nHandler);
		p.add(eins);
		zwei = new JButton("2");
		zwei.addActionListener(nHandler);
		p.add(zwei);
		drei = new JButton("3");
		drei.addActionListener(nHandler);
		p.add(drei);
		minus = new JButton("-");
		minus.addActionListener(opHandler);
		p.add(minus);
		nul = new JButton("0");
		nul.addActionListener(nHandler);
		p.add(nul);
		punkt = new JButton(".");
		punkt.addActionListener(opHandler);
		p.add(punkt);
		gleich = new JButton("=");
		gleich.addActionListener(opHandler);
		p.add(gleich);
		plus = new JButton("+");
		plus.addActionListener(opHandler);
		p.add(plus);
		undo= new JButton("undo");
		undo.addActionListener(opHandler);//boton nuevo para deshacer
		p.add(undo);
		clear= new JButton("clear");
		clear.addActionListener(opHandler);//boton nuevo para borrar todo
		p.add(clear);

		this.add(resultLabel, BorderLayout.NORTH);
		this.add(p, BorderLayout.SOUTH);

		setSize(300, 400);
		this.pack();
		this.setVisible(true);
	}


}
