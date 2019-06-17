package com.lokadora.main;

import java.util.List;

import com.lokadora.bean.*;

public class ProcessamentoCadastro {
	SimulaCadastro smlCadastro = new SimulaCadastro();
	
	public List<Cliente> lstCliente(){
		return smlCadastro.getCliente();
	}
	
	public List<Cliente> novoCliente(Cliente c) {
		//RNs -  não pode ser menor que 0
		//chama model e inclui no banco
		return this.smlCadastro.incluirCliente(c);
	}
	
	public List<Video> novoVideo(Video v) {
		//RNs
		return this.smlCadastro.incluirVideo(v);
	}
	
	public List<Video> lstVideo(){
		return smlCadastro.getVideo();
	}
	
	public List<Dependente> lstDependente(){
		return smlCadastro.getDependente();
	}
	
	public List<Dependente> novoDependente(Dependente d) {
		//RNs -  não pode ser menor que 0
		//chama model e inclui no banco
		return this.smlCadastro.incluirDependente(d);
	}
}
