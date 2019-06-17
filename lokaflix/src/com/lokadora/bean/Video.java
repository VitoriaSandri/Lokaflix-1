package com.lokadora.bean;

public class Video {

	
		private String diretor;
		private String dataAquisicao;
		private String dataLancamento;
		private String titulo;
		private String duracao;
		private String sinopse;
		
		public Video(String diretor, String dataAquisicao, String dataLancamento, String titulo, String duracao, String sinopse) {
			this.diretor = diretor;
			this.dataAquisicao = dataAquisicao;
			this.dataLancamento = dataLancamento;
			this.titulo = titulo;
			this.duracao = duracao;
			this.sinopse = sinopse;
		}
		
		public String getDiretor() {
			return diretor;
		}
		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}
		public String getDataAquisicao() {
			return dataAquisicao;
		}
		public void setDataAquisicao(String dataAquisicao) {
			this.dataAquisicao = dataAquisicao;
		}
		public String getDataLancamento() {
			return dataLancamento;
		}
		public void setDataLancamento(String dataLancamento) {
			this.dataLancamento = dataLancamento;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDuracao() {
			return duracao;
		}
		public void setDuracao(String duracao) {
			this.duracao = duracao;
		}
		public String getSinopse() {
			return sinopse;
		}
		public void setSinopse(String sinopse) {
			this.sinopse = sinopse;
		}
		
}
