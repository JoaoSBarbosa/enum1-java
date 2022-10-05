package com.enumerador;

enum Estacao{
	VERAO,
	OUTONO,
	INVERNO,
	PRIMAVERA
}
enum Tamanho{
	P,
	M,
	G,
	GG,
	XG,
	PP
}
public class Roupa {
	
	private String modelo;
	private Tamanho tamanho;
	private Estacao colecao;
	
	
	public Roupa(String modelo, Tamanho tamanho, Estacao colecao) {
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.colecao = colecao;
	}
	public void msg() {
		switch (colecao) {
		case VERAO:
			System.out.println("Arrasa na praia !");
			System.out.println("Tamanho: "+ tamanho);
			break;
		case OUTONO:
			System.out.println("Passe o outono com elegancia !");
			System.out.println("Tamanho: "+ tamanho);
			break;
		case INVERNO:	
			System.out.println("Se agasalhe bem e com estilo !");
			System.out.println("Tamanho: "+ tamanho);
			break;
		case PRIMAVERA:
			System.out.println("Se vista na estação das flores !");
			System.out.println("Tamanho: "+ tamanho);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Tamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	public Estacao getColecao() {
		return colecao;
	}
	public void setColecao(Estacao colecao) {
		this.colecao = colecao;
	}
	
	
	
	
}

