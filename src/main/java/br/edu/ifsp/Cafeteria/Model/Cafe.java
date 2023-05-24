package br.edu.ifsp.Cafeteria.Model;

import java.util.UUID;

public class Cafe {

	private String Id;
	private String name;
	private String historia;
	private String sabor;
	private String referencia;
	private String imagem;
	
	public Cafe(String name, String historia, String sabor, String referencia, String imagem) {
		super();
		this.Id = UUID.randomUUID().toString();
		this.name = name;
		this.historia = historia;
		this.sabor = sabor;
		this.referencia = referencia;
		this.imagem = imagem;
	}	

	
	public String getId() {
		return this.Id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHistoria() {
		return this.historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getSabor() {
		return this.sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public String getReferencia() {
		return this.referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getImagem() {
		return this.imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
		
}
