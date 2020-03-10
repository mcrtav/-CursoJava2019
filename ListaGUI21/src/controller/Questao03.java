package controller;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		double dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Dolar: "));

		double reais = dolar * 4.25 ;

		JOptionPane.showMessageDialog(null, "Em Reais " + "R$" + reais);
	}

}



//public static void main(String[] args) {
//	double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Dolar: "));
//
//	double reais = 4.25 * n1;
//
//	JOptionPane.showMessageDialog(null, "Em Reais " + "R$" + reais);