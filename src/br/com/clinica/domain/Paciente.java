package br.com.clinica.domain;

public class Paciente {

	//CLASSES do PACIENTE
	private int id;
	private String nome;
	private String email;
	
	
	//SOURCES FIELDS sem marcação (CONSTRUTORES)
	public Paciente() {
		
	}
	
	//SOURCES FIELDS MARCADOS (CONSTRUTORES)
	public Paciente(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
