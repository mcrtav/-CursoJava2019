package controller;

import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		/*double n = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));

		if (n > 20) {
			JOptionPane.showMessageDialog(null, "O a metade do numero é: " + (n / 2));

		} else {
			JOptionPane.showMessageDialog(null, "O numero inteiro é: " + n);

		}*/
		double n = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));

			if (n > 20) {n=n/2;
			JOptionPane.showMessageDialog(null, "Resultado: " + n);
			

	}

}
}