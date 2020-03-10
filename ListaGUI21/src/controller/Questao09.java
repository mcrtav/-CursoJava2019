package controller;

import javax.swing.JOptionPane;

public class Questao09 {

	public static void main(String[] args) {
		String[] nome = new String[5];
		String[] profissao = new String[5];
		for (int i = 0; i < nome.length; i++) {
			nome[i] = JOptionPane.showInputDialog("informe o nome " + i + ":");
			profissao[i] = JOptionPane.showInputDialog("informe a Profissão " + i + ":");
		}
		StringBuffer bufferSaida = new StringBuffer("Nome e Profissões:\n");

		for (int i = 0; i < profissao.length; i++) {
			bufferSaida.append(i + " - Nome: " + nome[i] + " - Prtofissão: " + profissao[i] + "\n");
		}
		JOptionPane.showMessageDialog(null, bufferSaida.toString());
	}

}
