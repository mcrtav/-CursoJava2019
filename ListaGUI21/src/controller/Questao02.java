package controller;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt (JOptionPane.showInputDialog ("Informe sua 1º numero: ")); 
		int n2 =  Integer.parseInt (JOptionPane.showInputDialog ("Informe sua 2º numero: ")); 
		int n3 = Integer.parseInt (JOptionPane.showInputDialog ("Informe sua 3º numero: ")); 
		int n4 = Integer.parseInt (JOptionPane.showInputDialog ("Informe sua 4º numero:: ")); 
		
int soma =  n1+n2+n3+n4;
int mult =  n1*n2*n3*n4;

JOptionPane.showMessageDialog (null, "Soma: "+soma+ "\nMultiplicação: " +mult);
	}

}

//public static void main(String[] args) {
//int a;
//int b;
//int c;
//int d;

//a = Integer.parseInt (JOptionPane.showInputDialog ("Informe sua 1º numero: ")); 
//b = Integer.parseInt (JOptionPane.showInputDialog ("Informe sua 2º numero: ")); 
//c = Integer.parseInt (JOptionPane.showInputDialog ("Informe sua 3º numero: ")); 
//d = Integer.parseInt (JOptionPane.showInputDialog ("Informe sua 4º numero:: ")); 

//JOptionPane.showMessageDialog (null, "Soma dos numeros: "+(a+b+c+d)+ "\nMultiplicação dos Numeros " +(a*b*c*d));