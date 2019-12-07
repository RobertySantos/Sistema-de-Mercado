package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.Controller;

public class Tela extends JFrame	implements ActionListener{
	JLabel txt,txt2;
	JTextField lg;
	JPasswordField sn;
	JButton sr,et;
	
	public void init() {
		setSize(370,250);
		setUndecorated(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(getContentPane());
		setTitle("Super Mercado");
		getContentPane().setBackground(new Color(31, 31, 34));
		
		ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoApp.png"));
		Image im = img.getImage().getScaledInstance(370, 250, Image.SCALE_DEFAULT);
		
		
		txt = new JLabel();
		txt.setText("Login: ");
		txt.setBounds(35, -60, 200, 200);
		txt.setFont(new Font("Bebas Neue", 0, 35));
		txt.setForeground(Color.white);
		add(txt);
		
		txt2 = new JLabel();
		txt2.setText("Senha: ");
		txt2.setBounds(35, 30, 200, 200);
		txt2.setFont(new Font("Bebas Neue", 0, 35));
		txt2.setForeground(Color.white);
		add(txt2);
		
		lg = new JTextField();
		lg.setBounds(120, 28, 200, 40);
		lg.setFont(new Font("Bebas Neue", 0, 25));
		lg.setBackground(Color.white);
		lg.setForeground(Color.black);
		add(lg);
		
		sn = new JPasswordField();
		sn.setBounds(120, 118, 200, 40);
		sn.setFont(new Font("Bebas Neue", 0, 25));
		sn.setBackground(Color.white);
		sn.setForeground(Color.black);
		add(sn);
		
		sr = new JButton();
		sr.setBounds(205, 190, 110, 40);
		sr.setText("Sair");
		sr.setFont(new Font("Bebas Neue", 0, 25));
		sr.setBackground(Color.white);
		sr.setForeground(Color.black);
		add(sr);
		sr.addActionListener(this);
		
		et = new JButton();
		et.setBounds(70, 190, 110, 40);
		et.setText("Entrar");
		et.setFont(new Font("Bebas Neue", 0, 25));
		et.setBackground(Color.white);
		et.setForeground(Color.black);
		add(et);
		et.addActionListener(this);
		
		JLabel fundo = new JLabel();
		fundo.setBounds(0,0,370,250);
		fundo.setIcon(new ImageIcon(im));
		add(fundo);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Aviso av = new Aviso();
		if(e.getSource().equals(sr)) {
			System.exit(0);
		}
		if(e.getSource().equals(et)) {
			if(lg.getText().equals("")) {
				av.init("Digite um login válido");
			}else {
				if(sn.getText().equals("")) {
				av.init("Digite uma senha válida");
				}else {
					Controller con = new Controller();
					if(con.comandoLogin(lg.getText(), sn.getText())) {
						this.setVisible(false);
					}else {
						
						av.init( "Registro não encontrado");
					}
					
							}
		
				}
			}
				}
}
