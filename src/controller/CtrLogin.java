package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Login;

@WebServlet("/CtrLogin")
public class CtrLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CtrLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Servlet adicionado pelo login.jsp ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario_login");
		String senha = request.getParameter("senha_login");
		String cmdLogin = request.getParameter("cmd_login");
		@SuppressWarnings("unchecked")
		List<Login> lista = (List<Login>) getServletContext().getAttribute("Lista");
		
		if(lista == null){
			lista = new ArrayList<Login>();
			getServletContext().setAttribute("Lista", lista);
		}
		
		if("Ok".equals(cmdLogin)){
			Login l = new Login();
			l.setUsuario(usuario);
			l.setSenha(senha);
			
			lista.add(l);	
			response.sendRedirect("./login.jsp");
		} 
		
		else if("Voltar".equals(cmdLogin)){
			response.sendRedirect("./index.jsp");
		}
		
		
	}

}
