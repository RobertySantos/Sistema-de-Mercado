package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Controller;

public class EditarProduto extends JFrame implements ActionListener{
	JButton sr,ok,ok2;
	JTextField id,log,sen,tip,quantidade,prc,cod;
	int idProd;
	Controller conn;
	
	
	public void init() {
	setSize(570,350);
	setUndecorated(true);
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(getContentPane());
	setTitle("Super Mercado");
	getContentPane().setBackground(new Color(31, 31, 34));
	
	ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoApp.png"));
	Image im = img.getImage().getScaledInstance(570, 350, Image.SCALE_DEFAULT);
	
	
	JLabel titulo = new JLabel();
	titulo.setText("<html><center>Atualizar Produto</html></center>");
	titulo.setFont(new Font("Bebas Neue",0,37));
	titulo.setForeground(Color.white);
	titulo.setHorizontalAlignment(SwingConstants.CENTER);
	titulo.setBounds(0,-50,570,220);
	add(titulo);
	
	JLabel txt = new JLabel();
	txt.setText("<html><center>Insira o <br>Codigo do<br> Produto: </html></center>");
	txt.setFont(new Font("Bebas Neue",0,30));
	txt.setForeground(Color.white);
	txt.setBounds(50,70,570,220);
	add(txt);
	
	
	sr = new JButton();
	sr.setBounds(325, 290, 120, 40);
	sr.setText("Cancelar");
	sr.setFont(new Font("Bebas Neue", 0, 25));
	sr.setBackground(new Color(229,68,68));
	sr.setBorder(null);
	sr.setForeground(Color.white);
	add(sr);
	sr.addActionListener(this);
	
	id= new  JTextField();
	id.setBounds(170, 160, 250, 65);
	id.setBackground(Color.white);
	id.setForeground(Color.black);
	id.setBorder(null);
	id.setFont(new Font("Bebas Neue",0,25));
	add(id);
	
	ok = new JButton();
	ok.setBounds(125, 290, 120, 40);
	ok.setText("OK");
	ok.setFont(new Font("Bebas Neue", 0, 25));
	ok.setBackground(new Color(70,195,71));
	ok.setForeground(Color.white);
	ok.setBorder(null);
	add(ok);
	ok.addActionListener(this);
	
	JLabel fundo = new JLabel();
	fundo.setBounds(0,0,570,350);
	fundo.setIcon(new ImageIcon(im));
	add(fundo);
	
	setVisible(true);
}
	
	public void init(int id,String nome,String marca,String tipo,int qtd,double valor, int codigo) {
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
	titulo.setText("<html><center>Editar Usuário</html></center>");
	titulo.setFont(new Font("Bebas Neue",0,37));
	titulo.setForeground(Color.white);
	titulo.setHorizontalAlignment(SwingConstants.CENTER);
	titulo.setBounds(0,-50,870,220);
	add(titulo);
	
	//Nome
	JLabel txt = new JLabel();
	txt.setText("<html><center>Nome: </html></center>");
	txt.setFont(new Font("Bebas Neue",0,35));
	txt.setForeground(Color.white);
	txt.setBounds(35,40,570,220);
	add(txt);
	
	log = new JTextField();
	log.setBounds(155, 130, 240, 65);
	log.setBackground(Color.white);
	log.setForeground(Color.black);
	log.setText(nome);
	log.setBorder(null);
	log.setFont(new Font("Bebas Neue",0,25));
	add(log);
	
	//Marca
	JLabel txt2 = new JLabel();
	txt2.setText("<html><center>Marca: </html></center>");
	txt2.setFont(new Font("Bebas Neue",0,35));
	txt2.setForeground(Color.white);
	txt2.setBounds(35,140,570,220);
	add(txt2);
	
	sen = new JTextField();
	sen.setBounds(155, 230, 240, 65);
	sen.setBackground(Color.white);
	sen.setForeground(Color.black);
	sen.setText(marca);
	sen.setBorder(null);
	sen.setFont(new Font("Bebas Neue",0,25));
	add(sen);
	
	//Tipo
	JLabel txt3 = new JLabel();
	txt3.setText("<html><center>Tipo: </html></center>");
	txt3.setFont(new Font("Bebas Neue",0,35));
	txt3.setForeground(Color.white);
	txt3.setBounds(35,250,570,220);
	add(txt3);
	
	tip = new JTextField();
	tip.setBounds(155, 330, 240, 65);
	tip.setBackground(Color.white);
	tip.setForeground(Color.black);
	tip.setText(tipo);
	tip.setBorder(null);
	tip.setFont(new Font("Bebas Neue",0,25));
	add(tip);
	
	//Qtd
	JLabel txt4 = new JLabel();
	txt4.setText("<html><center>Quantidade: </html></center>");
	txt4.setFont(new Font("Bebas Neue",0,35));
	txt4.setForeground(Color.white);
	txt4.setBounds(420,40,570,220);
	add(txt4);
	
	quantidade = new JTextField();
	quantidade.setBounds(580, 130, 240, 65);
	quantidade.setBackground(Color.white);
	quantidade.setForeground(Color.black);
	quantidade.setText(Integer.toString(qtd));
	quantidade.setBorder(null);
	quantidade.setFont(new Font("Bebas Neue",0,25));
	add(quantidade);
	
	//Preço
	JLabel txt5 = new JLabel();
	txt5.setText("<html><center>Preço: </html></center>");
	txt5.setFont(new Font("Bebas Neue",0,35));
	txt5.setForeground(Color.white);
	txt5.setBounds(420,140,570,220);
	add(txt5);
	
	prc = new JTextField();
	prc.setBounds(580, 230, 240, 65);
	prc.setBackground(Color.white);
	prc.setForeground(Color.black);
	prc.setText(Double.toString(valor));
	prc.setBorder(null);
	prc.setFont(new Font("Bebas Neue",0,25));
	add(prc);
	
	//Código
	JLabel txt6 = new JLabel();
	txt6.setText("<html><center>Código: </html></center>");
	txt6.setFont(new Font("Bebas Neue",0,35));
	txt6.setForeground(Color.white);
	txt6.setBounds(420,240,570,220);
	add(txt6);
	
	cod = new JTextField();
	cod.setBounds(580, 330, 240, 65);
	cod.setBackground(Color.white);
	cod.setForeground(Color.black);
	cod.setText(Integer.toString(codigo));
	cod.setBorder(null);
	cod.setFont(new Font("Bebas Neue",0,25));
	add(cod);
	
	
	sr = new JButton();
	sr.setBounds(475, 425, 120, 80);
	sr.setText("Cancelar");
	sr.setFont(new Font("Bebas Neue", 0, 35));
	sr.setBackground(new Color(229,68,68));
	sr.setBorder(null);
	sr.setForeground(Color.white);
	add(sr);
	sr.addActionListener(this);
	
	
	ok2 = new JButton();
	ok2.setBounds(275, 425, 120, 80);
	ok2.setText("Editar");
	ok2.setFont(new Font("Bebas Neue", 0, 35));
	ok2.setFocusPainted(false);
	ok2.setMargin(new Insets(-200, 2, 2, 2));
	ok2.setBackground(new Color(70,195,71));
	ok2.setForeground(Color.white);
	ok2.setBorder(null);
	add(ok2);
	ok2.addActionListener(this);
	
	idProd = id;
	
	JLabel fundo = new JLabel();
	fundo.setBounds(0,0,870,550);
	fundo.setIcon(new ImageIcon(im));
	add(fundo);
	
	setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		Aviso aviso = new Aviso();
		conn = new Controller();
		if(e.getSource().equals(sr)) {
			setVisible(false);
		}
		if(e.getSource().equals(ok)) {
			if(id.getText().equals("")){
				aviso.init("Digite um ID válido");
			}
			else{
			idProd = Integer.parseInt(id.getText());
			if(conn.comandoVerificaProd(Integer.parseInt(id.getText()))!= true){
				aviso.init("Codigo inválido");
			}else{
				this.setVisible(false);
			}
		}}
		if(e.getSource().equals(ok2)){
			
			if(conn.comandoEditarProd(idProd,log.getText(), sen.getText(), tip.getText(), Integer.parseInt(quantidade.getText()),Double.parseDouble (prc.getText()), Integer.parseInt(cod.getText()))) {
				aviso.init( "Atualizado com Sucesso!");
				this.setVisible(false);
			}else {
				aviso.init("Erro na Atualização!");
			}
		}
	
	}

	
}
