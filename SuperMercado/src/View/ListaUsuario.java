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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import Controller.Controller;

public class ListaUsuario extends JFrame implements ActionListener{
	JButton sr;
	JTable tabela;
	Controller conn;
	Object  dados[][];
	public void init() {
		setSize(870,550);
		setUndecorated(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(getContentPane());
		setTitle("Super Mercado");
		getContentPane().setBackground(new Color(31, 31, 34));
		
		ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoApp.png"));
		Image im = img.getImage().getScaledInstance(870, 550, Image.SCALE_DEFAULT);
		
		JLabel titulo = new JLabel();
		titulo.setText("<html><center>Lista Usuário</html></center>");
		titulo.setFont(new Font("Bebas Neue",0,37));
		titulo.setForeground(Color.white);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(0,-50,870,220);
		add(titulo);
		
		conn = new Controller();
		
		Object[] obj={
				"Id","Login","Senha","Tipo"
			};
		dados = conn.listaUsuario();
		tabela = new JTable(dados,obj);
		tabela.setBackground(Color.white);
		tabela.setForeground(Color.black);
		tabela.setBounds(50, 120, 650, 400);
		

		JScrollPane scroll = new JScrollPane(tabela);
		scroll.setBounds(50, 120, 650, 400);
		
		
		add(scroll);
		
		
		sr = new JButton();
		sr.setBounds(730, 450, 120, 80);
		sr.setText("Sair");
		sr.setFont(new Font("Bebas Neue", 0, 35));
		sr.setBackground(new Color(229,68,68));
		sr.setBorder(null);
		sr.setForeground(Color.white);
		add(sr);
		sr.addActionListener(this);
		
		JLabel fundo = new JLabel();
		fundo.setBounds(0,0,870,550);
		fundo.setIcon(new ImageIcon(im));
		add(fundo);
		
		setVisible(true);
	}@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(sr)) {
			setVisible(false);
		}
	}
}
