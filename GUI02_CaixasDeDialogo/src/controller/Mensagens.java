package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Mensagem 1");

		JOptionPane.showMessageDialog(null, "Mensagem 2", "Titulo da mmensagem 2", JOptionPane.ERROR_MESSAGE);

		ImageIcon icone = new ImageIcon("img/remove.png");

		JOptionPane.showMessageDialog(null, "Mensagem 3", "Titulo da mmensagem 3", JOptionPane.PLAIN_MESSAGE, icone);

	}

}
