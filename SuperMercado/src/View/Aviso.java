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
import javax.swing.SwingConstants;

public  class Aviso extends JFrame implements ActionListener{
	static JButton sair = new JButton();
	static JButton ok = new JButton();
	int retorno;
	public static void init(String msg) {
		JFrame janela = new JFrame();
		janela.setSize(350,220);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setTitle("");
		janela.setLayout(null);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoApp.png"));
		Image im = img.getImage().getScaledInstance(350, 220, Image.SCALE_DEFAULT);
		
		
		JLabel texto = new JLabel("",JLabel.CENTER);
		texto.setText(msg);
		texto.setBounds(20, -110, 310, 300);
		texto.setFont(new Font("Bebas Neue", 0, 25));
		texto.setBackground(Color.white);
		texto.setForeground(Color.white);
		janela.add(texto);
		
		
		JLabel fundo = new JLabel();
		fundo.setBounds(0,0,350,220);
		fundo.setIcon(new ImageIcon(im));
		janela.add(fundo);
		
		
		
		
		sair.setBounds(140, 150, 70,30);
		sair.setText("Ok");
		sair.setFont(new Font("Bebas Neue", 0, 25));
		sair.setMargin(new Insets(-4, 2, 2, 2));
		sair.setBackground(Color.green);
		sair.setForeground(Color.white);
		janela.add(sair);
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(sair)) {
					janela.setVisible(false);
				}
				
			}
		});
		
		
		janela.setVisible(true);
	}
	public void init() {
		
		JFrame janela = new JFrame();
		janela.setSize(350,220);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setTitle("");
		janela.setLayout(null);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoApp.png"));
		Image im = img.getImage().getScaledInstance(350, 220, Image.SCALE_DEFAULT);
		
		
		JLabel texto = new JLabel("",JLabel.CENTER);
		texto.setText("<html><center>Tem certeza Disso?</center></html>");
		texto.setBounds(20, -110, 310, 300);
		texto.setFont(new Font("Bebas Neue", 0, 25));
		texto.setBackground(Color.white);
		texto.setForeground(Color.white);
		janela.add(texto);
		
		
		JLabel fundo = new JLabel();
		fundo.setBounds(0,0,350,220);
		fundo.setIcon(new ImageIcon(im));
		janela.add(fundo);
		
		sair.setBounds(140, 150, 70,30);
		sair.setText("Ok");
		sair.setFont(new Font("Bebas Neue", 0, 25));
		sair.setMargin(new Insets(-4, 2, 2, 2));
		sair.setBackground(Color.green);
		sair.setForeground(Color.white);
		janela.add(sair);
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(sair)) {
					retorno = 1;
				}
				
			}
		});
		
		ok.setBounds(140, 150, 70,30);
		ok.setText("Sim");
		ok.setFont(new Font("Bebas Neue", 0, 25));
		ok.setMargin(new Insets(-4, 2, 2, 2));
		ok.setBackground(Color.green);
		ok.setForeground(Color.white);
		janela.add(ok);
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(ok)) {
					retorno = 2;
				}
				
			}
		});

		janela.setVisible(true);
		int i = 0;
		while(i==0) {
		if(retorno == 1) {
			janela.setVisible(false);
			return;
		}
		if(retorno == 2) {
			janela.setVisible(false);
			return;
		}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
