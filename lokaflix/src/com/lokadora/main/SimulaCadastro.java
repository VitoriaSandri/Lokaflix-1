package com.lokadora.main;

import java.util.ArrayList;
import java.util.List;

import com.lokadora.bean.*;

public class SimulaCadastro {

	public List<Cliente> lstClientes;
	public List<Video> lstVideos;
	public List<Dependente> lstDependente;
	
	public SimulaCadastro() {
		this.lstClientes  = new ArrayList<Cliente> ();
		this.lstVideos = new ArrayList<Video> ();
		this.lstDependente = new ArrayList<Dependente>();
	}
	
	public List<Video> incluirVideo(Video v) {
		this.lstVideos.add(v);
		return lstVideos;
	}
	
	public List<Video> getVideo(){
		return this.lstVideos;
	}
	
	public List<Cliente> getCliente(){
		return this.lstClientes;
	}
	
	public List<Cliente> incluirCliente(Cliente c) {
		this.lstClientes.add(c);
		return lstClientes;
	}
	
	public List<Dependente> getDependente(){
		return this.lstDependente;
	}
	
	public List<Dependente> incluirDependente(Dependente d) {
		this.lstDependente.add(d);
		return lstDependente;
	}
}
