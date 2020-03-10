package controller;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Abas extends JFrame {
	JTabbedPane abas = new JTabbedPane();

	JLabel label1 = new JLabel("Label do Painel 1");
	JLabel label2 = new JLabel("Label do Painel 2");
	JLabel label3 = new JLabel("Label do Painel 3");

	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();

	ImageIcon iconAjuda = new ImageIcon("img/ajuda.png");
	ImageIcon iconImprimir = new ImageIcon("img/imprimir.png");
	ImageIcon iconSair = new ImageIcon("img/sair.png");

	public Abas() {
		super("Exemplo Abas");

		painel1.add(label1);
		painel2.add(label2);
		painel3.add(label3);

		abas.addTab("Ajuda", iconAjuda, painel1, "Primeiro painel");
		abas.addTab("Imprimir", iconImprimir, painel2, "Segundo painel");
		abas.addTab("Sair", iconSair, painel3, "Terceiro painel");



		Container container = getContentPane();
		container.add(abas);

		// getContentPane().add (abas);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Abas();

	}

}
