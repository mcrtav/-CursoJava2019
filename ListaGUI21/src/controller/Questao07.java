package controller;

import javax.swing.JOptionPane;

public class Questao07 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe uma base: "));

/*		JOptionPane.showMessageDialog(null,
			"Tabuada do " + n + ":\n " + n + " . 1 = " + (n * 1) + "\n" + n + " . 2 = " + (n * 2) + "\n" + n
						+ " . 3 = " + (n * 3) + "\n" + n + " . 4 = " + (n * 4) + "\n" + n + " . 5 = " + (n * 5) + "\n"
						+ n + " . 6 = " + (n * 6) + "\n" + n + " . 7 = " + (n * 7) + "\n" + n + " . 8 = " + (n * 8)
						+ "\n" + n + " . 9 = " + (n * 9) + "\n" + n + " .10 = " + (n * 10) + "\n");
*/
	/*String saida = "Tabuada do " + n + ":\n";
		int i = 1;
		while (i <= 10) {
			saida = saida + n + " . " + i + " = " + (n * i) + "\n";
			i++;
		}
		JOptionPane.showMessageDialog(null, saida);
*/
		
		StringBuffer bufferSaida = new StringBuffer ( "Tabuada do " +n+"\n" );
		int i =1;
		while (i<=10) {
			bufferSaida.append ( n+" . "+i+ " = " +(n*i)+ "\n");
			i++;
			
		}
		
		JOptionPane.showMessageDialog(null,bufferSaida);
		
			}
}
