package application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main (String[] args) {
		
		Conteudo curso1 = new Curso("Curso JAVA", "Descricao Curso Java", 8);
		Conteudo curso2 = new Curso("Curso JS", "Descricao Curso JS", 4);
		
		Conteudo mentoria1 = new Mentoria("Mentoria JAVA", "Descricao Mentoria JAVA", LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao do bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devRafa = new Dev();
		devRafa.setNome("Rafael");
		devRafa.inscreverBootCamp(bootcamp);
		devRafa.progredir();
		System.out.println("Conteúdos Inscritos" + devRafa.getConteudoInscritos() + "horas");
		System.out.println("Conteudos Concluídos" + devRafa.getConteudoConcluidos() + "horas");
		System.out.println("XP:" + devRafa.calcularXp());
		
		Dev devGui = new Dev();
		devGui.setNome("Guilherme");
		devGui.inscreverBootCamp(bootcamp);
		devGui.progredir();
		System.out.println("Conteúdos Inscritos" + devGui.getConteudoInscritos() + "horas");
		System.out.println("Conteudos Concluídos" + devGui.getConteudoConcluidos() + "horas");
		System.out.println("XP:" + devGui.calcularXp());
	}
}
