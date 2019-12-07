package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ConvolveOp;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Controller;

public class EditarUsuario extends JFrame implements ActionListener{
	JButton sr,ok,ok2;
	JTextField id,log,sen;
	int idusu;
	JComboBox<String> tipe = new JComboBox<>();
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
		titulo.setText("<html><center>Atualizar Usuário</html></center>");
		titulo.setFont(new Font("Bebas Neue",0,37));
		titulo.setForeground(Color.white);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(0,-50,570,220);
		add(titulo);
		
		JLabel txt = new JLabel();
		txt.setText("<html><center>Insira o <br>Id do Usuário: </html></center>");
		txt.setFont(new Font("Bebas Neue",0,30));
		txt.setForeground(Color.white);
		txt.setBounds(20,70,570,220);
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
	
	public void init(int id,String nome,String senha,int tipo) {
		setSize(670,470);
		setUndecorated(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(getContentPane());
		setTitle("Super Mercado");
		getContentPane().setBackground(new Color(31, 31, 34));
		
		ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoApp.png"));
		Image im = img.getImage().getScaledInstance(670, 470, Image.SCALE_DEFAULT);
		
		JLabel titulo = new JLabel();
		titulo.setText("<html><center>Editar Usuário</html></center>");
		titulo.setFont(new Font("Bebas Neue",0,37));
		titulo.setForeground(Color.white);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(0,-80,570,220);
		add(titulo);
		
		
		
		JLabel txt = new JLabel();
		txt.setText("<html><center>Login: </html></center>");
		txt.setFont(new Font("Bebas Neue",0,35));
		txt.setForeground(Color.white);
		txt.setBounds(50,40,570,220);
		add(txt);
		

		idusu = id;
		
		log = new JTextField();
		log.setBounds(170, 130, 250, 65);
		log.setBackground(Color.white);
		log.setForeground(Color.black);
		log.setText(nome);
		log.setBorder(null);
		log.setFont(new Font("Bebas Neue",0,25));
		add(log);
		
		JLabel txt2 = new JLabel();
		txt2.setText("<html><center>Senha: </html></center>");
		txt2.setFont(new Font("Bebas Neue",0,35));
		txt2.setForeground(Color.white);
		txt2.setBounds(50,140,570,220);
		add(txt2);
		
		sen = new JTextField();
		sen.setBounds(170, 230, 250, 65);
		sen.setBackground(Color.white);
		sen.setForeground(Color.black);
		sen.setText(senha);
		sen.setBorder(null);
		sen.setFont(new Font("Bebas Neue",0,25));
		add(sen);
		
		JLabel txt3 = new JLabel();
		txt3.setText("<html><center>Tipo: </html></center>");
		txt3.setFont(new Font("Bebas Neue",0,35));
		txt3.setForeground(Color.white);
		txt3.setBounds(50,240,570,220);
		add(txt3);
		
		tipe.setBounds(170,340,250,65);
		tipe.setBackground(Color.white);
		tipe.setForeground(Color.black);
		tipe.setBorder(null);
		tipe.setFont(new Font("Bebas Neue",0,25));
		tipe.addItem("Administrador");
		tipe.addItem("Usuário");
		tipe.setSelectedIndex(tipo);
		add(tipe);
		
		sr = new JButton();
		sr.setBounds(475, 325, 120, 80);
		sr.setText("Cancelar");
		sr.setFont(new Font("Bebas Neue", 0, 35));
		sr.setBackground(new Color(229,68,68));
		sr.setBorder(null);
		sr.setForeground(Color.white);
		add(sr);
		sr.addActionListener(this);
		
		
		ok2 = new JButton();
		ok2.setBounds(475, 220, 120, 80);
		ok2.setText("Editar");
		ok2.setFont(new Font("Bebas Neue", 0, 35));
		ok2.setFocusPainted(false);
		ok2.setMargin(new Insets(-200, 2, 2, 2));
		ok2.setBackground(new Color(70,195,71));
		ok2.setForeground(Color.white);
		ok2.setBorder(null);
		add(ok2);
		ok2.addActionListener(this);
		
		
		JLabel fundo = new JLabel();
		fundo.setBounds(0,0,670,470);
		fundo.setIcon(new ImageIcon(im));
		add(fundo);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Aviso aviso = new Aviso();
		conn = new Controller();
		
		if(e.getSource().equals(ok2)){
			
			if(conn.comandoEditarUsu(idusu,log.getText(), sen.getText(), tipe.getSelectedIndex())) {
				aviso.init( "Atualizado com Sucesso!");
				this.setVisible(false);
			}else {
				aviso.init("Erro na Atualização!");
			}
		}
		
		if(e.getSource().equals(sr)) {
			setVisible(false);
		}
		if(e.getSource().equals(ok)) {
			if(id.getText().equals("")){
				aviso.init("Digite um ID válido");
			}
			else{
			idusu = Integer.parseInt(id.getText());
			if(conn.comandoVerificaUsu(Integer.parseInt(id.getText()))!= true){
				aviso.init("ID inválido");
			}else{
				
				this.setVisible(false);
			}
		}}
		
	}
}
