package com.enumerador;

public class Principal {
	public static void main(String[] args) {
		
		Roupa r1 = new Roupa("Camiseta", Tamanho.GG, Estacao.INVERNO);
		r1.msg();
		Roupa r2 = new Roupa("Cal�a", Tamanho.XG, Estacao.VERAO);
		r2.msg();
	}
}
