package controller;

import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
		
		JOptionPane.showMessageDialog(null, "O numero antecesso �: " + (--n) + "\nO numero Sucessor �: " + ((++n)+1));
	}

}