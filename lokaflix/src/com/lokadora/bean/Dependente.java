package com.lokadora.bean;

public class Dependente extends Cliente{
	
	private String parentesco;
	private String nomeDep;
	private String sobrenomeDep;
	
	public Dependente(String parentesco, String nomeDep, String sobrenomeDep, String cpf, String email, String senha, String nome, String sobrenome) {
		super(cpf, email, senha, nome, sobrenome);
		this.parentesco = parentesco;
		this.nomeDep = nomeDep;
		this.sobrenomeDep = sobrenomeDep;
		
}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getSobrenomeDep() {
		return sobrenomeDep;
	}

	public void setSobrenomeDep(String sobrenomeDep) {
		this.sobrenomeDep = sobrenomeDep;
	}
	
	
}
