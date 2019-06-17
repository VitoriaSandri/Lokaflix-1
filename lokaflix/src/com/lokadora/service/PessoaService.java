package com.lokadora.service;

import com.lokadora.bean.Pessoa;

public class PessoaService {
	
private static PessoaService singleton = null;
	
	public  static PessoaService getPessoaService() {
		 if (singleton == null) 
	        { 
			 singleton = new PessoaService(); 
	        } 
	        return singleton; 
	}
	
	//escondendo o construtor, a unica maneira de obter uma instancia e' pelo metodo getPessoaService().
	private  PessoaService() {}
	
	boolean validaNome(Pessoa p) {  
	       if (p.getNome().length() < 2) {     
	           return false;   
	       }
	       return true;
		}

}
