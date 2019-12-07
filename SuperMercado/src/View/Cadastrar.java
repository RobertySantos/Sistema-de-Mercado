package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
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

public class Cadastrar extends JFrame implements ActionListener{
	
	JTextField nomep,tipop,marcap,qtdp,precop,codigop;
	JButton cadp,cad;
	JPanel divisa;
	JComboBox<String> tipo;
	JPasswordField senha;
	public void init() {
		setSize(950,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setUndecorated(true);
		setTitle("Cadastro");
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(new Color(12, 9, 18));
		
		nomep = new JTextField();
		tipop = new JTextField();
		marcap = new JTextField();
		qtdp = new JTextField();
		precop = new JTextField();
		codigop = new JTextField();
		cadp = new JButton();
		JTextField login = new JTextField();
		 senha= new JPasswordField();
		tipo = new JComboBox<String>();
		cad = new JButton();
		
		ImageIcon lg = new ImageIcon(Menu.class.getResource("Imagens/logo.png"));
		Image logo = lg.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
		
		this.setIconImage(logo);
		
		ImageIcon img = new ImageIcon(Menu.class.getResource("Imagens/FundoWhiteApp.png"));
		Image im = img.getImage().getScaledInstance(950, 480, Image.SCALE_DEFAULT);
		
		
		JLabel tit = new JLabel();
		tit.setBounds(115, -30, 500, 150);
		tit.setText("Cadastro de Produtos");
		tit.setFont(new Font("Bebas Neue", 0, 25));
		tit.setForeground(Color.white);
		add(tit);
		
		divisa = new JPanel();
		divisa.setBounds(485, -30, 2, 600);
		divisa.setBackground(Color.black);
		add(divisa);
		
		JLabel txt1 = new JLabel();
		txt1.setBounds(25, 50, 300, 150);
		txt1.setText("Nome: ");
		txt1.setFont(new Font("Bebas Neue", 0, 23));
		txt1.setForeground(Color.white);
		add(txt1);
		
		JLabel txt2 = new JLabel();
		txt2.setBounds(25, 140, 300, 150);
		txt2.setText("Tipo: ");
		txt2.setFont(new Font("Bebas Neue", 0, 25));
		txt2.setForeground(Color.white);
		add(txt2);
		
		JLabel txt3 = new JLabel();
		txt3.setBounds(25, 230, 300, 150);
		txt3.setText("Marca: ");
		txt3.setFont(new Font("Bebas Neue", 0, 25));
		txt3.setForeground(Color.white);
		add(txt3);
		
		JLabel txt4 = new JLabel();
		txt4.setBounds(230, 50, 300, 150);
		txt4.setText("Quantidade: ");
		txt4.setFont(new Font("Bebas Neue", 0, 25));
		txt4.setForeground(Color.white);
		add(txt4);
		
		JLabel txt5 = new JLabel();
		txt5.setBounds(230, 140, 300, 150);
		txt5.setText("Preço: ");
		txt5.setFont(new Font("Bebas Neue", 0, 25));
		txt5.setForeground(Color.white);
		add(txt5);
		
		JLabel txt6 = new JLabel();
		txt6.setBounds(230, 230, 300, 150);
		txt6.setText("Codigo:");
		txt6.setFont(new Font("Bebas Neue",0,25));
		txt6.setForeground(Color.white);
		add(txt6);
		
		//DADOS CADASTRO PRODUTO
		nomep.setBounds(25, 150, 170, 40);
		nomep.setFont(new Font("Bebas Neue", 0, 25));
		nomep.setBackground(Color.white);
		nomep.setForeground(Color.black);
		add(nomep);
		
		tipop.setBounds(25, 240, 170, 40);
		tipop.setFont(new Font("Bebas Neue", 0, 25));
		tipop.setBackground(Color.white);
		tipop.setForeground(Color.black);
		add(tipop);
		
		marcap.setBounds(25, 330, 170, 40);
		marcap.setFont(new Font("Bebas Neue", 0, 25));
		marcap.setBackground(Color.white);
		marcap.setForeground(Color.black);
		add(marcap);
		
		qtdp.setBounds(230, 150, 170, 40);
		qtdp.setFont(new Font("Bebas Neue", 0, 25));
		qtdp.setBackground(Color.white);
		qtdp.setForeground(Color.black);
		add(qtdp);
		
		precop.setBounds(230, 240, 170, 40);
		precop.setFont(new Font("Bebas Neue", 0, 25));
		precop.setBackground(Color.white);
		precop.setForeground(Color.black);
		add(precop);
		
		codigop.setBounds(230, 330, 170, 40);
		codigop.setFont(new Font("Bebas Neue",0,25));
		codigop.setBackground(Color.white);
		codigop.setForeground(Color.black);
		add(codigop);
		
		cadp.setBounds(135, 400, 150, 50);
		cadp.setText("Cadastrar");
		cadp.setFont(new Font("Bebas Neue", 0, 25));
		cadp.setForeground(Color.black);
		cadp.setBackground(Color.white);
		cadp.addActionListener(this);
		add(cadp);
		
		
		//DADOS CADASTRO USUARIO
		
		JPanel t= new JPanel();
		t.setBounds(0, 0, 950, 480);
		t.setLayout(null);
		t.setBackground(new Color(31, 31, 34));
		add(t);
		
		JLabel fundo = new JLabel();
		fundo.setBounds(0,0,950,480);
		fundo.setIcon(new ImageIcon(im));
		t.add(fundo);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
