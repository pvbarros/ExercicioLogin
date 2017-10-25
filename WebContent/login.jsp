<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login de Pessoa</title>
</head>
<body>
<h3 style="color:grey; font-family: calibri;">Digite seu usário e senha para fazer login</h3>

	<form method="post" action="./CtrLogin">
		<table border="0">
			<tr>
				<td colspan="1"><b>Usuário:</b></td>
				<td colspan="1"><input type="text" name="usuario_login" /></td>
			</tr>	
			<tr>
				<td colspan="1"><b>Senha:</b></td>
				<td colspan="1"><input type="text" name="senha_login" /></td>
			</tr>
			<tr>
				<td colspan="1"><input type="submit" name="cmd_login" value="Ok"></td>
				<td colspan="1"><input type="submit" name="cmd_login" value="Voltar"></td>
			</tr>

		</table>
	</form>
</html>