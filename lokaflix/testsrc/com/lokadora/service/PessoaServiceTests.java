package com.lokadora.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lokadora.bean.Pessoa;

class PessoaServiceTests {

	@Test
	void testeNomeCom4Letras() {
		PessoaService pSrv = PessoaService.getPessoaService();
		Pessoa p = new com.lokadora.bean.Pessoa("REEE", "ASDD");
		assertEquals(true, pSrv.validaNome(p));
	}
	
	@Test
	void testeNomeCom1Letras() {
		PessoaService pSrv = PessoaService.getPessoaService();
		Pessoa p = new com.lokadora.bean.Pessoa("R", "ASDD");
		assertEquals(false, pSrv.validaNome(p));
	}
}
