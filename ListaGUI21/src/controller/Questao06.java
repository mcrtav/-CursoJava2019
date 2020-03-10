package controller;

import javax.swing.JOptionPane;

public class Questao06 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe a Capital do Brasil: ");
		if (nome.equalsIgnoreCase("Brasilia"))
			JOptionPane.showMessageDialog(null, "A capital é : " + nome);
		else
			JOptionPane.showMessageDialog(null, "A capital não é : " + nome);
	}

}
