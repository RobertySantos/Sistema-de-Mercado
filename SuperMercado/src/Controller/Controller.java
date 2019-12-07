package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.ProdutosDAO;
import DAO.UsuarioDAO;
import Model.Produto;
import Model.Usuario;
import View.EditarProduto;
import View.EditarUsuario;
import View.TelaAdm;
import View.TelaUsuario;

public class Controller {
	private String nome;
	UsuarioDAO mu = new UsuarioDAO();
	Usuario usu = new Usuario();
	ProdutosDAO mp = new ProdutosDAO();
	Produto prod = new Produto();

	// LOGIN
	public boolean comandoLogin(String nome, String senha) {

		try {
			usu.setLogin(nome);
			usu.setSenha(senha);
			Usuario usuario = new Usuario();
			usuario = mu.controleLogin(usu);
			if (usuario.getTipo() == 0) {
				TelaAdm tel = new TelaAdm();
				tel.init();
			}
			if (usuario.getTipo() == 1) {
				TelaUsuario tel = new TelaUsuario();
				tel.init(usuario.getLogin());
			}
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	// Usuario

	public boolean comandoCadastraUsu(String log, String sen, int tipo) {
		Usuario p = new Usuario();
		p.setLogin(log);
		p.setSenha(sen);
		p.setTipo(tipo);
		UsuarioDAO m = new UsuarioDAO();
		if (m.cadastrar(p)) {
			return true;
		}

		return false;
	}

	public boolean excluiUsuario(int id) {
		if (mu.excluirUsuario(id)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean comandoVerificaUsuario(int id) {
		try {
			Usuario usuario = new Usuario();
			usuario = mu.verificaID(id);
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	public boolean comandoEditarUsu(int idusu, String nome, String senha, int tipo) {
		try {
			Usuario usuario = new Usuario();
			usuario.setId(idusu);
			usuario.setLogin(nome);
			usuario.setSenha(senha);
			usuario.setTipo(tipo);
			return mu.attUsuario(usuario);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return false;
	}

	public boolean comandoVerificaUsu(int id) {
		try {
			Usuario usuario = new Usuario();
			usuario = mu.verificaID(id);
			EditarUsuario edi = new EditarUsuario();
			edi.init(usuario.getId(), usuario.getLogin(), usuario.getSenha(), usuario.getTipo());
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	public Object[][] listaUsuario() {
		try {
			ArrayList<Usuario> usuario = new ArrayList<Usuario>();
			usuario = mu.listarUsuario();
			Object[][] lista = new Object[usuario.size()][7];
			int i = 0;
			for (Usuario usus : usuario) {
				lista[i][0] = usus.getId();
				lista[i][1] = usus.getLogin();
				lista[i][2] = usus.getSenha();
				if (usus.getTipo() == 0) {
					lista[i][3] = "Administrador";
				}
				if (usus.getTipo() == 1) {
					lista[i][3] = "Usuario";
				}
				i++;
			}
			return lista;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return null;

	}

	
	
	
	
	
	
	//PRODUTO
	public boolean comandaCadastraProd(String nome, String tipo, String marca, int qtd, double preco, int codigo) {

		Produto p = new Produto();
		p.setNome(nome);
		p.setTipo(tipo);
		p.setMarca(marca);
		p.setQtd(qtd);
		p.setPreco(preco);
		p.setCodigo(codigo);
		ProdutosDAO m = new ProdutosDAO();
		if (m.cadastrar(p)) {
			return true;
		}

		return false;
	}
	
	public boolean excluiProduto(int id) {
		if (mp.excluirProduto(id)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean comandoVerificaProduto(int cod) {
		try {
			Produto produto = new Produto();
			produto = mp.VerificaCodigo(cod);
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	public boolean comandoEditarProd(int idProd, String nome, String marca, String tipo, int qtd, double preco,
			int codigo) {
		try {
			Produto produto = new Produto();
			produto.setId(idProd);
			produto.setCodigo(codigo);
			produto.setMarca(marca);
			produto.setTipo(tipo);
			produto.setQtd(qtd);
			produto.setPreco(preco);
			produto.setNome(nome);
			return mp.mudaProduto(produto);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	public Object[][] listaProdutos() {
		try {
			ArrayList<Produto> produto = new ArrayList<Produto>();
			produto = mp.listarProdutos();
			Object[][] lista = new Object[produto.size()][7];
			int i = 0;
			for (Produto prods : produto) {
				lista[i][0] = prods.getId();
				lista[i][1] = prods.getNome();
				lista[i][2] = prods.getTipo();
				lista[i][3] = prods.getMarca();
				lista[i][4] = prods.getQtd();
				lista[i][5] = prods.getPreco();
				lista[i][6] = prods.getCodigo();
				i++;
			}
			return lista;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return null;

	}

	
	public boolean comandoVerificaProd(int cod) {
		try {
			Produto produto = new Produto();
			produto = mp.VerificaCodigo(cod);
			EditarProduto edi = new EditarProduto();
			edi.init(produto.getId(), produto.getNome(), produto.getMarca(), produto.getTipo(), produto.getQtd(),
					produto.getPreco(), produto.getCodigo());
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

}
