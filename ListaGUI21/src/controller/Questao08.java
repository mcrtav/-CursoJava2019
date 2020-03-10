package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Questao08 {

	public static void main(String[] args) {
		String[] siglas = {"RJ","SP","MG","Outros"};
		ImageIcon icone = new ImageIcon ("img/remove.png");
Object objeto = JOptionPane.showInputDialog(null, "Qual eesado vc reside?", "Questao08", JOptionPane.PLAIN_MESSAGE,icone,siglas, siglas[0]);
switch (objeto.toString()) {
case "RJ":
	JOptionPane.showMessageDialog(null, "Carioca");
	break;
case "SP":
	JOptionPane.showMessageDialog(null, "Paulista");
	break;
case "MG":
	JOptionPane.showMessageDialog(null, "Carioca");
	break;
default:
	JOptionPane.showMessageDialog(null, "Outros Estados");
	break;

}




	}
}