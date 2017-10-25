package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cadastro;

@WebServlet("/CtrCadastro")
public class CtrCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CtrCadastro() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Servlet adicionado pelo cadastro.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario_cadastro");
		String nomeCompleto = request.getParameter("nome_completo");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String senha = request.getParameter("senha_cadastro");
		String cmdCadastro = request.getParameter("cmd_cadastro");
		@SuppressWarnings("unchecked")
		List<Cadastro> lista = ((List<Cadastro>) getServletContext().getAttribute("Lista"));
		
		if(lista == null){
			lista = new ArrayList<Cadastro>();
			getServletContext().setAttribute("Lista", lista);
		}
		
		if("Ok".equals(cmdCadastro)){
			Cadastro c = new Cadastro();
			c.setUsuario(usuario);
			c.setNomeCompleto(nomeCompleto);
			c.setEmail(email);
			c.setTelefone(Integer.parseInt(telefone));
			c.setSenha(senha);
			
			lista.add(c);
			response.sendRedirect("./cadastro.jsp");
		} 
		else if("Voltar".equals(cmdCadastro)){
			response.sendRedirect("./index.jsp");
	}
}

}
