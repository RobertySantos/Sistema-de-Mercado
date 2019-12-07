package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controller.Conexao;
import Model.Usuario;
import View.Aviso;





public class UsuarioDAO {
	
	
	public boolean cadastrar(Usuario usuario){
		Connection conn = null;
		Conexao conexao = new Conexao();
		try{ String sql = "INSERT into tbusuario"
				+ " (loginUsuario, senhaUsuario,tipoUsuario) VALUES (?,?,?)";
		conn = conexao.Banco();
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, usuario.getLogin());
		pstm.setString(2, usuario.getSenha());
		pstm.setInt(3, usuario.getTipo());
		pstm.execute();
		return true;
			
		}catch(Exception e){
			System.err.println(e.getMessage());
			return false;
		}finally{
			conexao.fechar(conn);
		}
	}
	
	
	//Verifica usuario que logou
	public Usuario controleLogin(Usuario usu) {
		Connection conn = null;
		Conexao conexao = new Conexao(); 
		
		
		try{
			String sql = "select * from tbusuario where loginUsuario = '"+usu.getLogin()+
					"' AND senhaUsuario = '"+usu.getSenha()+"'";
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			if(rs != null && rs.next()){
				usu.setLogin(rs.getString("loginUsuario"));
                usu.setTipo(rs.getInt("tipoUsuario"));
			return usu;
			}
			
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}finally{
			conexao.fechar(conn);
		}
		return null;
		
		}
	
	public Usuario verificaID(Integer id) {
		
		Connection conn = null;
		Conexao conexao = new Conexao();
		
		try {
			String sql ="select * from tbUsuario where idUsuario ="+id;
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			if(rs != null && rs.next()) {
				String nome = rs.getString("loginUsuario");
				String senha = rs.getString("senhaUsuario");
				int tipo = rs.getInt("tipoUsuario");
				Usuario usuario = new Usuario();
				usuario.setLogin(nome);
				usuario.setSenha(senha);
				usuario.setTipo(tipo);
				usuario.setId(id);
				
				return usuario;
			}
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			conexao.fechar(conn);
			}
		return null;

	}
		
	public boolean attUsuario(Usuario usu){
		Connection conn = null;
		Conexao conexao = new Conexao();
		
		try {
			System.out.println(usu.getId());
			String sql = "update tbUsuario set loginUsuario = ?, senhaUsuario = ?,tipoUsuario = ? where idUsuario = ?";
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareCall(sql);
			pstm.setString(1, usu.getLogin());
			pstm.setString(2, usu.getSenha());
			pstm.setInt(3, usu.getTipo());
			pstm.setInt(4, usu.getId());
			pstm.execute();
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}finally{
			conexao.fechar(conn);
		}
	}


	public ArrayList<Usuario> listarUsuario(){
		Connection conn = null;
		Conexao conexao = new Conexao();
		ArrayList<Usuario> usuario = new ArrayList<Usuario>();
		
		try {
			String sql = "select * from tbUsuario";
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs= pstm.executeQuery();
			//Next = Cair na linha zero. ir para o proximo
			while(rs.next()) {
				Usuario usus =  new Usuario();
				usus.setId(rs.getInt("idUsuario"));
				usus.setLogin(rs.getString("loginUsuario"));
				usus.setSenha(rs.getString("senhaUsuario"));
				usus.setTipo(rs.getInt("tipoUsuario"));
				usuario.add(usus);
				}
			return usuario;				
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;	
		}finally {
			conexao.fechar(conn);
	}
  }

	
	public boolean excluirUsuario(int id) {
		Connection conn = null; 
		Conexao conexao = new Conexao();
		try {
			String sql = "Delete from tbUsuario where idUsuario = ?";
			conn = conexao.Banco();
			PreparedStatement pstm = conn.prepareCall(sql);
			pstm.setInt(1, id);
			pstm.execute();
			return true;
		} catch (Exception e) {
			
		}
		return false;
	}
		
	}

