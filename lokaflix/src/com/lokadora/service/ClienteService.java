package com.lokadora.service;

import com.lokadora.bean.Cliente;

public class ClienteService {

	private static ClienteService singleton = null;
	
	public  static ClienteService getClienteService() {
		 if (singleton == null) 
	        { 
			 singleton = new ClienteService(); 
	        } 
	        return singleton; 
	}
	
	//escondendo o construtor, a unica maneira de obter uma instancia e' pelo metodo getClienteService().
	private  ClienteService() {}
	
	boolean validaCPF(Cliente c) {
		
		String CPF = c.getCpf();
		try {
			CPF = CPF.replace(".", "");  
		    CPF = CPF.replace("-", "");
		    
		    if (CPF.length() != 11) {     
		           return false;   
		       }
		       return true;
		    
		}
		catch (Exception ex) {
			return false;
		}
	}
	
}
