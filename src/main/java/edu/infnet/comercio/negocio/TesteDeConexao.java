package edu.infnet.comercio.negocio;


import java.util.List;

import edu.infnet.comercio.negocio.dao.ProdutoDAO;
import edu.infnet.comercio.negocio.dao.UsuarioDAO;
import edu.infnet.comercio.negocio.modelo.Produto;
import edu.infnet.comercio.negocio.modelo.Usuario;

public class TesteDeConexao {
	
	public static void main(String[] args) {
//		teste 1 conexao
//		MysqlConnection.getConnection();

//		teste 2 inserir usuario no banco				
//		Usuario usuario = new Usuario();
//		usuario.setLogin("usuario");
//		usuario.setSenha("senha");
//		UsuarioDAO dao = new UsuarioDAO();
//		dao.save(usuario);
		
//		teste 3 selecionar usuario por login
//		UsuarioDAO dao = new UsuarioDAO();
//		Usuario usuario = dao.getByLogin("usuario");
//		System.out.println(usuario);
		
//		teste 4 listar produtos
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> lista = dao.findAllProdutos();
		System.out.println(lista);
	}
}
