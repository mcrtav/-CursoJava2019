package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JanelaHeranca extends JFrame {

	public JanelaHeranca() {
		super("Título da Janela Herança");
		setSize(500, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icone = new ImageIcon("img/refresh.png");
		setIconImage(icone.getImage());

		// janela.setLocation(100,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JanelaHeranca();
	}

}
