<%@page import="model.Cadastro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Pessoa</title>
</head>
<body>
<h3 style="color:grey; font-family: calibri;">Preencha os dados abaixo para fazer um novo cadastro</h3>
	
	<%
		Cadastro cadastro = (Cadastro) session.getAttribute("Cadastro Encontrado");
		if(cadastro == null){
			cadastro = new Cadastro();
		}
	%>
	
	<form method="post" action="./CtrCadastro">
		<table border="0">
			<tr>
				<td colspan="1"><b>Usuário:</b></td>
				<td colspan="1"><input type="text" name="usuario_cadastro" /></td>
			</tr>	
			<tr>
				<td colspan="1"><b>Nome Completo:</b></td>
				<td colspan="1"><input type="text" name="nome_completo" /></td>
			</tr>
			<tr>				
				<td colspan="1"><b>E-mail:</b></td>
				<td colspan="1"><input type="text" name="email" /></td>
			</tr>	
			<tr>
				<td colspan="1"><b>Telefone:</b></td>
				<td colspan="1"><input type="text" name="telefone" /></td>
			</tr>
			<tr>	
				<td colspan="1"><b>Senha:</b></td>
				<td colspan="1"><input type="text" name="senha_cadastro" /></td>
			</tr>
			<tr>
				<td colspan="1"><input type="submit" name="cmd_cadastro" value="Ok"></td>
				<td colspan="1"><input type="submit" name="cmd_cadastro" value="Voltar"></td>
				

			</tr>
				
		</table>
	</form>
</body>
</html>