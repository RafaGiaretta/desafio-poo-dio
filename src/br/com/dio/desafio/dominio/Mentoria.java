package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{


	private LocalDate cargaHoraria;
	
	
		
	public Mentoria(String titulo, String descricao, LocalDate cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}


	@Override
	public double calcularXp() {
		return XP_PADRAO + 20.0;
	}
	

	public LocalDate getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(LocalDate cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Mentoria titulo= " + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria= " + cargaHoraria;
	}


	
}
