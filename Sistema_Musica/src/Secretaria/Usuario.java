package Secretaria;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
	
	private int Tipo;
    private String Nome;
    private String Login;
    private String Senha;
    
	/* Tipo 1 - Aluno
	 * Tipo 2 - Professor
	 * Tipo 3 - secretaria
	 */
     public int getTipo() {
		return Tipo;
	}
	public void setTipo(int Tipo) {
		this.Tipo = Tipo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String Login) {
		this.Login = Login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String Senha) {
		this.Senha = Senha;
	}
	
	
	public Usuario(int tipo, String nome, String login, String senha) {
		Tipo = tipo;
		Nome = nome;
		Login = login;
		Senha = senha;
	}
	
	//Usuario ativo
	private Usuario a = null;

	//HashMap com usuarios e senha
	public static HashMap<String, Usuario> hashUser = new HashMap<>();
	
	//Cria login, verifica tipo do usuario e o coloca no hashmap
    public static void newUser(int tipo, String nome, String login, String senha) {
    	
    	if(tipo == 1) {
    		hashUser.put(login, new Aluno(nome, login, senha));
    		System.out.println("Novo aluno criado");
    	}else if(tipo == 2) {
    		hashUser.put(login, new Professor(nome, login, senha));
    		System.out.println("Novo professor criado");
    	}else if(tipo == 3) {
    		hashUser.put(login, new Secretaria(nome, login, senha));
    		System.out.println("Novo Secretario criado");
    	}
    	
    }
    
    //Confere e conecta o login ao hashmap
    public static Usuario userLogin(String login, String senha) {
    	if(hashUser.get(login).getSenha().equals(senha)) {
    		return hashUser.get(login);
    	}else return null;
    	
    }
    //Lista todos os usuarios (Professores e alunos)
    public void listarUsuarios(){
    	
		for (Map.Entry<String, Usuario> set : hashUser.entrySet()) {
			String tipo;
			if(set.getValue().getTipo() == 1) {
				tipo = "Aluno";
			}else if(set.getValue().getTipo() == 2) {
				tipo = "Professsor";
			}
			
			else tipo = "Secretaria";
		    System.out.println("Login: "+set.getKey() + " - " + "/nNome: "+set.getValue().getNome()+"/n");
		}
	}
}
