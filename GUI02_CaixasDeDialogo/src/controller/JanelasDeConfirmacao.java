package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeConfirmacao {

	public static void main(String[] args) {
		int opcao1;
		opcao1 = JOptionPane.showConfirmDialog(null, "Janela de conrirmação 1");

		switch (opcao1) {

		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Você Clicou em Sim");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Você Clicou em Não");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Você Clicou em Cancelar");
			break;
		default:
			JOptionPane.showMessageDialog(null, "voce fechou a janela");
			break;
		}
		int opcao2 = JOptionPane.showConfirmDialog(null, "Janela de confirmação 2", "Titulo da Janela",
				JOptionPane.OK_CANCEL_OPTION);

		switch (opcao2) {
		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(null, "Você Clicou em OK");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Você Clicou em CANCELAR");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Você Fechou a Janela");
			break;
		}

		int opcao3 = JOptionPane.showConfirmDialog(null, "Janela de Confirmação 3", "Titulo da Janela",
				JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

		switch (opcao3) {
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em Sim");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em NÃO");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Você Fechou a Janela");
			break;

		}
		ImageIcon icone = new ImageIcon("img/refresh.png");
		int opcao4 = JOptionPane.showConfirmDialog(null, "Janela de Confirmação 4", "Titulo da Janela",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone);

		switch (opcao4) {
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em Sim");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em NÃO");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em Cancelar");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Você Fechou a Janela");
			break;

		}
	}
}
