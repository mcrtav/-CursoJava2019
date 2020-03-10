package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		JFrame janela = new JFrame();
		janela.setTitle("T�tulo da  Janela");
		janela.setSize(500, 300);
		janela.setResizable(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icone = new ImageIcon("img/refresh.png");
		janela.setIconImage(icone.getImage());
		
		//janela.setLocation(100,200);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

}
