package edu.infnet.comercio.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/LogoutSrv" }) // cria um servelet para torna uma classe acesseivel via ptorocolo http...
public class LogoutServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			req.getSession().invalidate();
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
}
