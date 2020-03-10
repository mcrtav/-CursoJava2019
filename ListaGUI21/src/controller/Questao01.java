package controller;

import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		String nome;
		String sexo;
		int idade;
nome = JOptionPane.showInputDialog("Imput seu nome");
sexo = JOptionPane.showInputDialog("Informe seu sexo:");
idade = Integer.parseInt (JOptionPane.showInputDialog ("Informe sua Idade: ")); 
JOptionPane.showMessageDialog (null, "Nome "+nome+ "\nSexo: " +sexo+ "\nIdade: "+idade);
	}

}
