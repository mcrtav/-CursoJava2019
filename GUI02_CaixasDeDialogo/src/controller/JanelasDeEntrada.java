package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeEntrada {

	public static void main(String[] args) {
		String Texto1 = JOptionPane.showInputDialog("Janela de entrada 1");
		JOptionPane.showMessageDialog(null, "Voce digitou " + Texto1);

		String Texto2 = JOptionPane.showInputDialog(null, "Janela de entrada 2");
		JOptionPane.showMessageDialog(null, "Voce digitou " + Texto2);

		String Texto3 = JOptionPane.showInputDialog("Janela de entrada 3", "digite aqui");
		JOptionPane.showMessageDialog(null, "Voce digitou " + Texto3);
		String Texto4 = JOptionPane.showInputDialog(null, "Janela de entrada 4", "valor inicial...");
		JOptionPane.showMessageDialog(null, "Voce digitou " + Texto4);
		String Texto5 = JOptionPane.showInputDialog(null, "Janela de entrada 5", "Titulo de Janela",
				JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Voce digitou " + Texto5);
		ImageIcon icone = new ImageIcon("img/stockindexUp.png");
		String[] vetor = { "Rodrigo", "João", "Maria", "Camila", "José" };
		Object objeto = JOptionPane.showInputDialog(null, "Janela de Entrada 6", "Titulo da janela",
				JOptionPane.PLAIN_MESSAGE, icone, vetor, vetor[2]);
	}
}
