package com.lokadora.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.lokadora.bean.*;

public class Interface {
	public static void main(String[] args) {
		ChamadaInterface ci = new ChamadaInterface();

		menu(ci);
		}
	public static void menu(ChamadaInterface ci) {
		
		Scanner in = new Scanner(System.in);

		int opcoes = -1;
		System.out.println("\n\n\n\nBEM-VINDO(A) A LOKAFLIX!\n");
		System.out.println("O que voc� deseja fazer?\n");
		System.out.println("1 - Me cadastrar como cliente");
		System.out.println("2 - Cadastrar um dependente");
		System.out.println("3 - Cadastrar um video");
		System.out.println("0 - Sair\n");
		
		System.out.println("Escolha uma op��o: ");
		
		switch (in.nextInt()) {
		case 1:
			System.out.println("\n# CADSTRO DO CLIENTE #\n");
			System.out.println("Insira o nome: ");
			String nome = in.next();
			
			System.out.println("Insira o sobrenome: ");
			String sobrenome = in.next();
			
			System.out.println("Insira o CPF: ");
			String cpf = in.next();
			
			System.out.println("Insira o E-mail: ");
			String email = in.next();
			
			System.out.println("Crie uma Senha: ");
			String senha = in.next();
			
			
			Cliente c1 = new Cliente(cpf, email , senha , nome , sobrenome );
			
			List<Cliente> lstCli = ci.insereCliente(c1);
			
			System.out.println("Lista de todos os cliente");
			 for (Cliente c : lstCli) {
				System.out.println("Nome: " + c.getNome());
			}
				
			System.out.println("Cliente cadastrado com sucesso!");
			
			menu(ci);
			break;
			
		case 2:
			System.out.println("\n# CADSTRO DO DEPENDENTE #\n");
			
			System.out.println("Insira o nome do Dependente: ");
			String nomeDep = in.next();
			
			System.out.println("Insira o sobrenome do dependente: ");
			String sobrenomeDep = in.next();
			
			System.out.println("Insita o grau de parentesco: ");
			String grauParentesco = in.next();
			
			System.out.println("Nome do Cliente: ");
			String nomeCliente = in.next();
			
			System.out.println("Sobrenome do Cliente: ");
			String sobrenomeCliente = in.next();
			
			System.out.println("Cpf do Cliente: ");
			String cpfCliente = in.next();
			
			System.out.println("E-mail do Cliente: ");
			String emailCliente = in.next();
			
			System.out.println("Senha do Cliente: ");
			String senhaCliente = in.next();
						
			Dependente d1 = new Dependente(grauParentesco, nomeDep, sobrenomeDep, cpfCliente, emailCliente , senhaCliente , nomeCliente , sobrenomeCliente );
			
			List<Dependente> lstDep = ci.insereDependente(d1);
			
			System.out.println("Lista de todos os dependentes");
			 for (Dependente d : lstDep) {
				System.out.println("Nome: " + d.getNomeDep());
			}				
			System.out.println("Dependente cadastrado com sucesso!");
			menu(ci);
			break;
		case 3:
			System.out.println("\n# CADSTRO DO VIDEO #\n");
			String diretor = "Bill Condon";
			System.out.println("Diretor: " + diretor);
	
			String dataAquisicao = "10/05/2017";
			System.out.println("Data de aquisi��o: " + dataAquisicao);
			
			//Date dataLancamento = (Date) formato.parse("16/03/2017");
			String dataLancamento = "16/03/2017";
			System.out.println("Data de lan�amento: " + dataLancamento);
			
			String titulo = "A Bela e a Fera";
			System.out.println("T�tulo: " + titulo);
			
			String duracao = "130 minutos";
			System.out.println("Dura��o: " + duracao);
			
			String sinopse = "Moradora de uma pequena aldeia francesa, Bela tem o pai capturado pela Fera e decide entregar sua vida ao estranho ser em troca da liberdade do progenitor. No castelo ela conhece objetos m�gicos e descobre que a Fera � na verdade um pr�ncipe que precisa de amor para voltar � forma humana.";
			System.out.println("Sinopse: " + sinopse);		
			
			Video v1 = new Video(diretor, dataAquisicao, dataLancamento, titulo, duracao, sinopse);
			List<Video> lstVid = ci.insereVideo(v1);
			
			System.out.println("Lista de todos os videos");
			 for (Video v : lstVid) {
				System.out.println("T�tulo: " + v.getTitulo());
			}		
			
			System.out.println("Video cadastrado com sucesso!");	
			menu(ci);
			break;
		default:
			System.out.println("AT� MAIS!");
			break;
		}
	}
}
