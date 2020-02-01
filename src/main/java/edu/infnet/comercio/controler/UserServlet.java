package edu.infnet.comercio.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mysql.cj.util.StringUtils;

import edu.infnet.comercio.negocio.modelo.Usuario;
import edu.infnet.comercio.negocio.servico.UsuarioService;

@WebServlet(urlPatterns = { "/UserSrv" }) // cria um servelet para torna uma classe acesseivel via ptorocolo http...
public class UserServlet extends HttpServlet {
	
	private static Logger Logger = LogManager.getLogger(UserServlet.class);
	private UsuarioService service;
	private static final long serialVersionUID = 1L; // para adicionar o serialVersionUID usar o atalho... selecionar
													 // UserServlet e ctrl 1 + enter
	public UserServlet() {
		this.service = new UsuarioService();
	} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		
		Logger.debug("Entrando no doPost");
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		String action = req.getParameter("action");
		
		if("new".equals(action)) {
			
			//TODO VALIDAR OS VALORES
			if(StringUtils.isEmptyOrWhitespaceOnly(login)) {
			}
			
			//TODO CONVERTER VALORES
			//TODO ALPICAR AO MODELO
			Usuario usuario = new Usuario(login,senha);
			//atalho: new Usuario();"ctrl+1+enter"
			//necessário criar um construtor sem o ID (classe usuário)
			//atalho: new Usuario(login,senha); escolher create constructor
			
			//TODO EXECUTAR LOGICA DE NEGOCIO
			service.save(usuario);
			req.setAttribute("msg", "usuário cadastro com sucesso!");
		}else {
			if(service.validarUsuario(login, senha)) {
				req.getSession().setAttribute("user", login);
			}else {
				req.setAttribute("msg", "login ou senha inválidos!");
			}
		}		
		
//		System.out.println("O login foi " + login);
//		System.out.println("O senha foi " + senha);
//		System.out.println("A action foi " + action);
		
		//req.getSession().setAttribute("pass", senha);
		req.getRequestDispatcher("pages/home.jsp").forward(req, resp);
	}
}
