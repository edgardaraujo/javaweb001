package edu.infnet.comercio.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.infnet.comercio.negocio.dao.JpaDAO;
import edu.infnet.comercio.negocio.dao.ProdutoDAO;
import edu.infnet.comercio.negocio.dao.ProdutoJPADAO;
import edu.infnet.comercio.negocio.modelo.Produto;

@WebServlet(urlPatterns = { "/ComprasSrv" }) // cria um servelet para torna uma classe acesseivel via ptorocolo http...
public class ComprasServlet extends HttpServlet{
	
	private ProdutoDAO dao;
	private JpaDAO jpadao;
	
	private static final long serialVersionUID = 1L;
	
	public ComprasServlet() {
		// TODO Auto-generated constructor stub
		this.dao = new ProdutoDAO();
		this.jpadao = new ProdutoJPADAO();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Produto produto = new Produto("TV 4K","Televisão Smart TV LED 43 UHD 4K",7999.99,"tv4k.jpg");
		
		//this.jpadao.save(produto);
		
		//List<Produto> produtos = dao.findAllProdutos(); //dao.findAllProdutos(); ctrl+1+enter+enter
		
		List<Produto> produtos = jpadao.findAll();		
		
		req.setAttribute("lista_produto", produtos);
		
		req.getRequestDispatcher("pages/catalogo.jsp").forward(req, resp);
	}

}
