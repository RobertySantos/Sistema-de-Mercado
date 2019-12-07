package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Controller.Conexao;
import Model.Produto;

public class ProdutosDAO {

	public boolean cadastrar(Produto produto) {
		Connection conn = null;
		Conexao conexao = new Conexao();
		try {
			String sql = "INSERT into tbproduto"
					+ " (nomeProduto,tipoProduto,marcaProduto,qtdProduto,precoProduto,codigoProduto) VALUES (?,?,?,?,?,?)";
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getTipo());
			pstm.setString(3, produto.getMarca());
			pstm.setInt(4, produto.getQtd());
			pstm.setDouble(5, produto.getPreco());
			pstm.setInt(6, produto.getCodigo());
			pstm.execute();

			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		} finally {
			conexao.fechar(conn);
		}
	}

	public Produto VerificaCodigo(Integer cod) {

		Connection conn = null;
		Conexao conexao = new Conexao();

		try {
			String sql = "select * from tbproduto where codigoProduto = " + cod;
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			if (rs != null && rs.next()) {
				int id = rs.getInt("idProduto");
				String nome = rs.getString("nomeProduto");
				String marca = rs.getString("marcaProduto");
				String tipo = rs.getString("tipoProduto");
				int qtd = rs.getInt("qtdProduto");
				double preco = rs.getDouble("precoProduto");
				Produto prod = new Produto();
				prod.setCodigo(cod);
				prod.setId(id);
				prod.setNome(nome);
				prod.setMarca(marca);
				prod.setTipo(tipo);
				prod.setQtd(qtd);
				prod.setPreco(preco);
				return prod;
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			conexao.fechar(conn);
		}
		return null;

	}

	public boolean excluirProduto(int id) {
		Connection conn = null;
		Conexao conexao = new Conexao();
		try {
			String sql = "Delete from tbproduto where idProduto = ?";
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareCall(sql);
			pstm.setInt(1, id);
			pstm.execute();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	public ArrayList<Produto> listarProdutos() {
		Connection conn = null;
		Conexao conexao = new Conexao();
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		try {
			String sql = "select * from tbproduto";
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Produto prod = new Produto();
				prod.setId(rs.getInt("idProduto"));
				prod.setNome(rs.getString("nomeProduto"));
				prod.setMarca(rs.getString("marcaProduto"));
				prod.setTipo(rs.getString("tipoProduto"));
				prod.setPreco(rs.getDouble("precoProduto"));
				prod.setQtd(rs.getInt("qtdProduto"));
				prod.setCodigo(rs.getInt("codigoProduto"));
				produtos.add(prod);
			}
			return produtos;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		} finally {
			conexao.fechar(conn);
		}
	}

	public boolean mudaProduto(Produto produto) {
		Connection conn = null;
		Conexao conexao = new Conexao();

		try {
			String sql = "UPDATE `tbproduto` SET `nomeProduto` = ?, `marcaProduto` = ?"
					+ ",`tipoproduto` = ? , qtdProduto = ?, precoProduto = ? WHERE `codigoProduto` = ?";
			conn = conexao.Banco();

			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getMarca());
			pstm.setString(3, produto.getTipo());
			pstm.setInt(4, produto.getQtd());
			pstm.setDouble(5, produto.getPreco());
			pstm.setInt(6, produto.getCodigo());
			pstm.execute();

			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			conexao.fechar(conn);
		}

		return false;

	}
}
