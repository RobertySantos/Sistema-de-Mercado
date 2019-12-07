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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Controller;

public class ExcluirUsuario extends JFrame implements ActionListener{
	JButton ok,sr;
	JTextField id;
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
		titulo.setText("<html><center>Excluir Usuário</html></center>");
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Aviso aviso = new Aviso();
		Controller conn = new Controller();
		if(e.getSource().equals(sr)) {
			setVisible(false);
		}
		if(e.getSource().equals(ok)) {
			if(id.getText().equals("")){
				aviso.init("Digite um ID válido");
			}
			else{
			if(conn.comandoVerificaUsuario(Integer.parseInt(id.getText()))!= true){
				aviso.init("ID inválido");
			}else{
				aviso.init("Excluido com sucesso!");
				conn.excluiUsuario(Integer.parseInt(id.getText()));
				this.setVisible(false);
				
			}
		}}
	}
}
