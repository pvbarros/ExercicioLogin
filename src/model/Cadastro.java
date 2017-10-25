package model;

public class Cadastro {
	
	private String usuario;
	private String nomeCompleto;
	private String email;
	private int telefone;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Usuário: " + getUsuario() + "\n");
		sb.append("Nome Completo: " + getNomeCompleto() + "\n");
		sb.append("E-mail: " + getEmail() + "\n");
		sb.append("Telefone: " + getTelefone() + "\n");
		sb.append("Senha: " + getSenha() + "\n");
		return sb.toString();
	}

}
