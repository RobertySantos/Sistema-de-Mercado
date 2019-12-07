package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controller.Controller;

public class TelaUsuario extends JFrame implements ActionListener {
	JLabel tit;
	JButton sr, et;
	Controller con = new Controller();
	JButton menu[] = new JButton[3];
	JLabel logo = new JLabel();
	JPanel lis = new JPanel();

	public void init(String nome) {
		setSize(1250, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setUndecorated(true);
		setTitle("Usuário");
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(new Color(66, 91, 105));

		ImageIcon lg = new ImageIcon(Menu.class.getResource("Imagens/logoBlue.png"));
		Image logo = lg.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		this.setIconImage(logo);

		ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoWhiteApp.png"));
		Image im = img.getImage().getScaledInstance(1050, 700, Image.SCALE_DEFAULT);

		JLabel tit = new JLabel();
		tit.setBounds(375, 0, 500, 150);
		tit.setText("Bem Vindo " + nome + "");
		tit.setFont(new Font("Palatino Linotype", Font.BOLD, 35));
		add(tit);
		
		lis.setBounds(200, 0, 1050, 700);
		lis.setLayout(null);
		lis.setBackground(new Color(31, 31, 34));
		add(lis);
		

		// BTN LATERAL
		for (int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				menu[i] = new JButton();
				menu[i].setText("Produtos");
				menu[i].setBounds(25, 285, 150, 50);
				break;
			case 1:
				menu[i] = new JButton();
				menu[i].setText("Caixa");
				menu[i].setBounds(25, 360, 150, 50);
				break;
			case 2:
				menu[i] = new JButton();
				menu[i].setText("Sair");
				menu[i].setBounds(25, 445, 150, 50);
				break;
			default:
				break;
			}
			this.add(menu[i]);
			menu[i].setFont(new Font("Bebas Neue", 0, 25));
			menu[i].setMargin(new Insets(-4, 2, 2, 2));
			menu[i].setBackground(Color.white);
			menu[i].setForeground(Color.BLACK);
			menu[i].addActionListener(this);
		}

		// Logo
		JLabel log = new JLabel();
		log.setBounds(0, 75, 200, 200);
		log.setIcon(new ImageIcon(logo));
		add(log);

		this.logo.setBounds(10, -60, 200, 200);
		this.logo.setFont(new Font("Birds of Paradise  Personal Use", 0, 55));
		this.logo.setForeground(Color.white);
		this.logo.setText("Phoenix");
		add(this.logo);

		// Fundo
		JLabel fundo = new JLabel();
		fundo.setBounds(200, 0, 1050, 700);
		fundo.setIcon(new ImageIcon(im));
		this.add(fundo);

		JLabel fundo1 = new JLabel();
		fundo1.setBounds(0,0,1050,700);
		fundo1.setIcon(new ImageIcon(im));
		lis.add(fundo1);
		
		setVisible(true);
		lis.setVisible(false);
		revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(sr) || e.getSource().equals(menu[2])) {
			System.exit(0);
		}

		if(e.getSource().equals(menu[0])) {
		lis.setVisible(true);
		}
	}
}
