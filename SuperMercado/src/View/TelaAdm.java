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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Controller;

public class TelaAdm extends JFrame implements ActionListener {
	JButton[] menu = new JButton[6];
	JLabel fundo,fundo2,fundo3,fundo4,fundo5;
	Aviso aviso = new Aviso();
	
	
	//Variaveis menu lateral
	JButton reg,edi,lis,exc,sair;
	JLabel logo = new JLabel();

	
	//Paineis 
	JPanel registro = new JPanel();
	JPanel editar = new JPanel();
	JPanel listar = new JPanel();
	JPanel excluir = new JPanel();
	JPanel t= new JPanel();
	
	//Variaveis Cadastro Usuario
	JTextField login = new JTextField();
	JPasswordField senha = new JPasswordField();
	JComboBox<String> tipo = new JComboBox<String>();
	JButton cad = new JButton();
		
	//Variaveis painel cadastro produtos
	JTextField nomep = new JTextField();
	JTextField tipop = new JTextField();
	JTextField marcap = new JTextField();
	JTextField qtdp = new JTextField();
	JTextField precop = new JTextField();
	JTextField codigop = new JTextField();
	JButton cadp = new JButton();
	
	//Variaveis Painel Editar
	JLabel txt7 = new JLabel(),txt;
	JButton prodedit,usuedit;
	
	//Variaveis painel Listar
	JButton produtoListar,usuarioListar;
	
	//Variaveis painel Excluir
	JButton produtoExcluir,usuarioExcluir;
	
	public void init() {
		setSize(1250,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setUndecorated(true);
		setTitle("Administrador");
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(new Color(232, 253, 254));
		
		ImageIcon lg = new ImageIcon(Menu.class.getResource("Imagens/logo.png"));
		Image logo = lg.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
		
		this.setIconImage(logo);
		
		ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoApp.png"));
		Image im = img.getImage().getScaledInstance(1050, 700, Image.SCALE_DEFAULT);
		
		
		//PANEL
		t.setBounds(200, 0, 1050, 700);
		t.setLayout(null);
		t.setBackground(new Color(31, 31, 34));
		add(t);
		
		registro.setBounds(200, 0, 1050, 700);
		registro.setLayout(null);
		registro.setBackground(new Color(31, 31, 34));
		add(registro);
		
		editar.setBounds(200,0,1050,700);
		editar.setLayout(null);
		editar.setBackground(new Color(31,31,34));
		add(editar);
		
		listar.setBounds(200,0,1050,700);
		listar.setLayout(null);
		listar.setBackground(new Color(31,31,34));
		add(listar);
		
		excluir.setBounds(200, 0, 1050, 700);
		excluir.setLayout(null);
		excluir.setBackground(new Color(31,31,34));
		add(excluir);
		
		//TELA INICIAL
		
		txt = new JLabel();
		txt.setBounds(365, 125, 500, 150);
		txt.setText("Escolha a tela que quer ir!");
		txt.setFont(new Font("Bebas Neue", 0, 35));
		txt.setForeground(Color.white);
		t.add(txt);
		
		reg = new JButton();
		reg.setBounds(350, 250, 150, 70);
		reg.setText("Registrar");
		reg.setFont(new Font("Bebas Neue", 0, 25));
		reg.setMargin(new Insets(-4, 2, 2, 2));
		reg.setBackground(Color.white);
		reg.setForeground(Color.black);
		t.add(reg);
		reg.addActionListener(this);
		
		edi = new JButton();
		edi.setBounds(550, 250, 150, 70);
		edi.setText("Editar");
		edi.setFont(new Font("Bebas Neue", 0, 25));
		edi.setMargin(new Insets(-4, 2, 2, 2));
		edi.setBackground(Color.white);
		edi.setForeground(Color.black);
		t.add(edi);
		edi.addActionListener(this);
		
		lis = new JButton();
		lis.setBounds(350, 350, 150, 70);
		lis.setText("Listar");
		lis.setFont(new Font("Bebas Neue", 0, 25));
		lis.setMargin(new Insets(-4, 2, 2, 2));
		lis.setBackground(Color.white);
		lis.setForeground(Color.black);
		t.add(lis);
		lis.addActionListener(this);
		
		exc = new JButton();
		exc.setBounds(550, 350, 150, 70);
		exc.setText("Excluir");
		exc.setFont(new Font("Bebas Neue", 0, 25));
		exc.setMargin(new Insets(-4, 2, 2, 2));
		exc.setBackground(Color.white);
		exc.setForeground(Color.black);
		t.add(exc);
		exc.addActionListener(this);
		
		sair = new JButton();
		sair.setBounds(450, 450, 150, 70);
		sair.setText("Sair");
		sair.setFont(new Font("Bebas Neue", 0, 25));
		sair.setMargin(new Insets(-4, 2, 2, 2));
		sair.setBackground(Color.white);
		sair.setForeground(Color.black);
		t.add(sair);
		sair.addActionListener(this);
		
		// BTN LATERAL
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				menu[i] = new JButton();
				menu[i].setText("Registrar");
				menu[i].setBounds(25, 235, 150, 50);
				break;
			case 1:
				menu[i] = new JButton();
				menu[i].setText("Editar");
				menu[i].setBounds(25, 305, 150, 50);
				break;
			case 2:
				menu[i] = new JButton();
				menu[i].setText("Listar");
				menu[i].setBounds(25, 385, 150, 50);
				break;
			case 3:
				menu[i] = new JButton();
				menu[i].setText("Excluir");
				menu[i].setBounds(25, 460, 150, 50);
				break;
			case 4:
				menu[i] = new JButton();
				menu[i].setText("Sair");
				menu[i].setBounds(25, 535, 150, 50);
				break;
			default:
				break;
			}
			add(menu[i]);
			menu[i].setFont(new Font("Bebas Neue", 0, 25));
			menu[i].setMargin(new Insets(-4, 2, 2, 2));
			menu[i].setBackground(Color.BLACK);
			menu[i].setForeground(Color.white);
			menu[i].addActionListener(this);
		}
		
		
		
		//REGISTRAR
		
		//LABEL
		JLabel tit2 = new JLabel();
		tit2.setBounds(375, 0, 500, 150);
		tit2.setText("Cadastro de Usuarios");
		tit2.setFont(new Font("Bebas Neue", 0, 35));
		tit2.setForeground(Color.white);
		registro.add(tit2);
		
		JLabel tx = new JLabel();
		tx.setBounds(150, 100, 300, 150);
		tx.setText("Login Usuario: ");
		tx.setFont(new Font("Bebas Neue", 0, 25));
		tx.setForeground(Color.white);
		registro.add(tx);
		
		JLabel tx2 = new JLabel();
		tx2.setBounds(150, 250, 300, 150);
		tx2.setText("Senha Usuario: ");
		tx2.setFont(new Font("Bebas Neue", 0, 25));
		tx2.setForeground(Color.white);
		registro.add(tx2);
		
		JLabel tx3 = new JLabel();
		tx3.setBounds(150, 400, 300, 150);
		tx3.setText("Tipo Usuario: ");
		tx3.setFont(new Font("Bebas Neue", 0, 25));
		tx3.setForeground(Color.white);
		registro.add(tx3);
		
		
		//DADOS
		login.setBounds(150, 200, 300, 70);
		login.setFont(new Font("Bebas Neue",0,25));
		registro.add(login);
		
		senha.setBounds(150, 350, 300, 70);
		senha.setFont(new Font("Bebas Neue",0,25));
		registro.add(senha);
		
		tipo.setBounds(150, 500, 300, 40);
		tipo.setFont(new Font("Bebas Neue", 0, 25));
		tipo.setBackground(Color.white);
		tipo.setForeground(Color.black);
		registro.add(tipo);
		tipo.addItem("Administrador");
		tipo.addItem("Usuário");
		
		cad.setBounds(600, 500, 200, 70);
		cad.setText("Cadastrar");
		cad.setFont(new Font("Bebas Neue", 0, 25));
		cad.setBackground(Color.white);
		cad.setForeground(Color.black);
		cad.addActionListener(this);
		registro.add(cad);

		//EDITAR
		txt7.setBounds(300, 125, 500, 150);
		txt7.setText("Escolha a tela que deseja editar!");
		txt7.setFont(new Font("Bebas Neue", 0, 35));
		txt7.setForeground(Color.white);
		editar.add(txt7);
		
		
		prodedit = new JButton();
		prodedit.setBounds(310, 300, 150, 70);
		prodedit.setText("Produtos");
		prodedit.setFont(new Font("Bebas Neue", 0, 25));
		prodedit.setBackground(Color.white);
		prodedit.setForeground(Color.black);
		prodedit.setMargin(new Insets(-4, 2, 2, 2));
		editar.add(prodedit);
		prodedit.addActionListener(this);
		
		usuedit = new JButton();
		usuedit.setBounds(510, 300, 150, 70);
		usuedit.setText("Usuarios");
		usuedit.setFont(new Font("Bebas Neue", 0, 25));
		usuedit.setMargin(new Insets(-4, 2, 2, 2));
		usuedit.setBackground(Color.white);
		usuedit.setForeground(Color.black);
		editar.add(usuedit);
		usuedit.addActionListener(this);
		
		//Listar
		JLabel txt8 = new JLabel();
		txt8.setBounds(-38, 125, 1050, 150);
		txt8.setText("<html><center>Escolha qual deseja Listar!</center></html>");
		txt8.setFont(new Font("Bebas Neue", 0, 35));
		txt8.setHorizontalAlignment(SwingConstants.CENTER);
		txt8.setForeground(Color.white);
		listar.add(txt8);
		
		
		produtoListar = new JButton();
		produtoListar.setBounds(310, 300, 150, 70);
		produtoListar.setText("Produtos");
		produtoListar.setFont(new Font("Bebas Neue", 0, 25));
		produtoListar.setBackground(Color.white);
		produtoListar.setForeground(Color.black);
		produtoListar.setMargin(new Insets(-4, 2, 2, 2));
		listar.add(produtoListar);
		produtoListar.addActionListener(this);
		
		
		usuarioListar = new JButton();
		usuarioListar.setBounds(510, 300, 150, 70);
		usuarioListar.setText("Usuarios");
		usuarioListar.setFont(new Font("Bebas Neue", 0, 25));
		usuarioListar.setMargin(new Insets(-4, 2, 2, 2));
		usuarioListar.setBackground(Color.white);
		usuarioListar.setForeground(Color.black);
		listar.add(usuarioListar);
		usuarioListar.addActionListener(this);
		
		
		//Excluir
		JLabel txt9 = new JLabel();
		txt9.setBounds(-38, 125, 1050, 150);
		txt9.setText("<html><center>Escolha qual deseja Excluir!</center></html>");
		txt9.setFont(new Font("Bebas Neue", 0, 35));
		txt9.setHorizontalAlignment(SwingConstants.CENTER);
		txt9.setForeground(Color.white);
		excluir.add(txt9);
		
		
		produtoExcluir = new JButton();
		produtoExcluir.setBounds(310, 300, 150, 70);
		produtoExcluir.setText("Produtos");
		produtoExcluir.setFont(new Font("Bebas Neue", 0, 25));
		produtoExcluir.setBackground(Color.white);
		produtoExcluir.setForeground(Color.black);
		produtoExcluir.setMargin(new Insets(-4, 2, 2, 2));
		excluir.add(produtoExcluir);
		produtoExcluir.addActionListener(this);
		
		usuarioExcluir = new JButton();
		usuarioExcluir.setBounds(510, 300, 150, 70);
		usuarioExcluir.setText("Usuarios");
		usuarioExcluir.setFont(new Font("Bebas Neue", 0, 25));
		usuarioExcluir.setMargin(new Insets(-4, 2, 2, 2));
		usuarioExcluir.setBackground(Color.white);
		usuarioExcluir.setForeground(Color.black);
		excluir.add(usuarioExcluir);
		usuarioExcluir.addActionListener(this);
		
		//LOGO
		
		JLabel log = new JLabel();
		log.setBounds(0,35,200,200);
		log.setIcon(new ImageIcon(logo));
		add(log);
		
		this.logo.setBounds(10, -60, 200, 200);
		this.logo.setFont(new Font("Birds of Paradise  Personal Use",0,55));
		this.logo.setForeground(Color.black);
		this.logo.setText("Phoenix");
		add(this.logo);
		
		//FUNDO
		JLabel fundo = new JLabel();
		fundo.setBounds(0,0,1050,700);
		fundo.setIcon(new ImageIcon(im));
		t.add(fundo);
		
		
		JLabel fundo3 = new JLabel();
		fundo3.setBounds(0,0,1050,700);
		fundo3.setIcon(new ImageIcon(im));
		registro.add(fundo3);
		
		JLabel fundo4 = new JLabel();
		fundo4.setBounds(0,0,1050,700);
		fundo4.setIcon(new ImageIcon(im));
		editar.add(fundo4);
		
		JLabel fundo5 = new JLabel();
		fundo5.setBounds(0,0,1050,700);
		fundo5.setIcon(new ImageIcon(im));
		listar.add(fundo5);
		
		JLabel fundo6 = new JLabel();
		fundo6.setBounds(0,0,1050,700);
		fundo6.setIcon(new ImageIcon(im));
		excluir.add(fundo6);
		
		
		
		
		setVisible(true);
		login.setVisible(false);
		senha.setVisible(false);
		nomep.setVisible(false);
		tipop.setVisible(false);
		marcap.setVisible(false);
		qtdp.setVisible(false);
		precop.setVisible(false);
		codigop.setVisible(false);
		cad.setVisible(false);
		cadp.setVisible(false);
		tipo.setVisible(false);
		prodedit.setVisible(false);
		usuedit.setVisible(false);
		usuarioExcluir.setVisible(false);
		produtoExcluir.setVisible(false);
		produtoListar.setVisible(false);
		usuarioListar.setVisible(false);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Controller conn = new Controller();
		
		if(e.getSource().equals(reg)||e.getSource().equals(menu[0])) {
			registro.setVisible(true);	
			login.setVisible(true);
			senha.setVisible(true);
			cad.setVisible(true);
			tipo.setVisible(true);
			t.setVisible(false);
			nomep.setVisible(false);
			tipop.setVisible(false);
			marcap.setVisible(false);
			qtdp.setVisible(false);
			precop.setVisible(false);
			codigop.setVisible(false);
			cadp.setVisible(false);
			prodedit.setVisible(false);
			usuedit.setVisible(false);
			excluir.setVisible(false);
			usuarioExcluir.setVisible(false);
			produtoExcluir.setVisible(false);
			listar.setVisible(false);
			produtoListar.setVisible(false);
			usuarioListar.setVisible(false);
			Cadastrar c = new Cadastrar();
			c.init();
		}
		if(e.getSource().equals(cadp)) {
			if(nomep.getText().equals("")) {
				aviso.init("Digite um nome válido");
			}else {
				if(tipop.getText().equals("")) {
					aviso.init("Digite um tipo válido");
				}else {
					if(marcap.getText().equals("")) {
						aviso.init( "Digite uma marca válida");
					}else {
						
						
						if(qtdp.getText().equals("")) {
							aviso.init( "<html>Digite um numero inteiro <br/> no campo de quantidade</html>");
						}else {
							
							if(precop.getText().equals("")) {
								aviso.init("<html><center>Digite um valor no campo de preço sem letras</center></html>");
							}else {
								if(codigop.getText().equals("")){
									aviso.init( "<html><center>Digite um valor inteiro no campo de codigo do produto</center></html>");
								}else{
								try {
									if(conn.comandaCadastraProd(nomep.getText(), tipop.getText(), marcap.getText(), Integer.parseInt(qtdp.getText()), Double.parseDouble(precop.getText()),Integer.parseInt(codigop.getText()))) {
										aviso.init( "Cadastro realizado com sucesso!");
										nomep.setText("");
										tipop.setText("");
										marcap.setText("");
										qtdp.setText("");
										precop.setText("");
										codigop.setText("");
									}else {
										aviso.init("Erro no cadastro!");
									}	
								} catch (Exception e2) {
									aviso.init( "<html><center>Substitua a virgula no campo preço por ponto \n"
											+ " ou coloque um valor inteiro no campo de quantidade</center></html>");
								}
								}								
							}
					
							}
					
					}
				}
			}
		}
		if(e.getSource().equals(cad)) {
			if(login.getText().equals("")) {
				aviso.init( "Digite um login válido");
			}else {
			if(senha.getText().equals("")) {
				aviso.init( "Digite uma senha válida");
			}else {
				if(conn.comandoCadastraUsu(login.getText(), senha.getText(), tipo.getSelectedIndex())) {
					aviso.init( "Cadastro Realizado com Sucesso!");
					login.setText("");
					senha.setText("");
				}else {
					aviso.init("Erro no Cadastro!");
				}
			}
			}
			
			
		}
		if(e.getSource().equals(edi)||e.getSource().equals(menu[1])){
			editar.setVisible(true);
			prodedit.setVisible(true);
			usuedit.setVisible(true);
			t.setVisible(false);
			nomep.setVisible(false);
			tipop.setVisible(false);
			marcap.setVisible(false);
			qtdp.setVisible(false);
			precop.setVisible(false);
			codigop.setVisible(false);
			registro.setVisible(false);
			login.setVisible(false);
			senha.setVisible(false);
			cad.setVisible(false);
			cadp.setVisible(false);
			tipo.setVisible(false);
			excluir.setVisible(false);
			usuarioExcluir.setVisible(false);
			produtoExcluir.setVisible(false);
			listar.setVisible(false);
			produtoListar.setVisible(false);
			usuarioListar.setVisible(false);
		}
		if(e.getSource().equals(lis)||e.getSource().equals(menu[2])) {
			listar.setVisible(true);
			produtoListar.setVisible(true);
			usuarioListar.setVisible(true);
			editar.setVisible(false);
			prodedit.setVisible(false);
			usuedit.setVisible(false);
			t.setVisible(false);
			nomep.setVisible(false);
			tipop.setVisible(false);
			marcap.setVisible(false);
			qtdp.setVisible(false);
			precop.setVisible(false);
			codigop.setVisible(false);
			registro.setVisible(false);
			login.setVisible(false);
			senha.setVisible(false);
			cad.setVisible(false);
			cadp.setVisible(false);
			tipo.setVisible(false);
			excluir.setVisible(false);
			usuarioExcluir.setVisible(false);
			produtoExcluir.setVisible(false);
		}
		if(e.getSource().equals(exc)||e.getSource().equals(menu[3])) {
			excluir.setVisible(true);
			usuarioExcluir.setVisible(true);
			produtoExcluir.setVisible(true);
			listar.setVisible(false);
			produtoListar.setVisible(false);
			usuarioListar.setVisible(false);
			editar.setVisible(false);
			prodedit.setVisible(false);
			usuedit.setVisible(false);
			t.setVisible(false);
			nomep.setVisible(false);
			tipop.setVisible(false);
			marcap.setVisible(false);
			qtdp.setVisible(false);
			precop.setVisible(false);
			codigop.setVisible(false);
			registro.setVisible(false);
			login.setVisible(false);
			senha.setVisible(false);
			cad.setVisible(false);
			cadp.setVisible(false);
			tipo.setVisible(false);
		}
		if(e.getSource().equals(prodedit)){
			EditarProduto edi = new EditarProduto();
			edi.init();
		}
		if(e.getSource().equals(usuedit)){
			EditarUsuario usus = new EditarUsuario();
			usus.init();
		}
		if(e.getSource().equals(usuarioExcluir)) {
			ExcluirUsuario usus = new ExcluirUsuario();
			usus.init();
		}
		if(e.getSource().equals(produtoListar)) {
			ListaProdutos lis = new ListaProdutos();
			lis.init();
		}
		if(e.getSource().equals(usuarioListar)) {
			ListaUsuario lis = new ListaUsuario();
			lis.init();
		}
		if(e.getSource().equals(produtoExcluir)) {
			ExcluirProduto prods = new  ExcluirProduto();
			prods.init();
		}
		if(e.getSource().equals(sair)||e.getSource().equals(menu[4])) {
			System.exit(0);
		}
	}
}
		