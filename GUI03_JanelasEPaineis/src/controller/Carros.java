package controller;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Carros extends JFrame {
	JTabbedPane carros = new JTabbedPane();

	JLabel fabricante1 = new JLabel("Fabricabte: XingLing");
	JLabel modelo1 = new JLabel("Modelo: ZangXung Turbo");
	JLabel ano1 = new JLabel("Ano: Label do Painel 3");
	JLabel motor1 = new JLabel("motor 4.5 L");
	JLabel preco1 = new JLabel("Preço: R$ 180.000,00");

	JLabel fabricante2 = new JLabel("Fabricabte: Fiat");
	JLabel modelo2 = new JLabel("Modelo: ZangXung Turbo");
	JLabel ano2 = new JLabel("Ano: Label do Painel 3");
	JLabel motor2 = new JLabel("motor 4.5 L");
	JLabel preco2 = new JLabel("Preço: R$ 180.000,00");

	JLabel fabricante3 = new JLabel("Fabricabte: VW");
	JLabel modelo3 = new JLabel("Modelo: ZangXung Turbo");
	JLabel ano3 = new JLabel("Ano: Label do Painel 3");
	JLabel motor3 = new JLabel("motor 4.5 L");
	JLabel preco3 = new JLabel("Preço: R$ 180.000,00");

	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();

	public Carros() {
 
		super("Carros");

		JPanel painel1 = new JPanel();
		painel1.setLayout(new GridLayout(5, 1));
		painel1.add(fabricante1);
		painel1.add(modelo1);
		painel1.add(ano1);
		painel1.add(motor1);
		painel1.add(preco1);
		
		JPanel painel2 = new JPanel();
		painel2.setLayout(new GridLayout(5, 1));
		painel2.add(fabricante2);
		painel2.add(modelo2);
		painel2.add(ano2);
		painel2.add(motor2);
		painel2.add(preco2);

		JPanel painel3 = new JPanel();
		painel3.setLayout(new GridLayout(5, 1));
		painel3.add(fabricante3);
		painel3.add(modelo3);
		painel3.add(ano3);
		painel3.add(motor3);
		painel3.add(preco3);

	
		
		carros.addTab("Carro 1", null, painel1, "Segundo painel");
		carros.addTab("Carro 2", null, painel2, "Segundo painel");
		carros.addTab("Carro 3", null, painel3, "Terceiro painel");

		Container container = getContentPane();
		container.add(carros);

		// getContentPane().add (abas);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Carros();

	}

}
